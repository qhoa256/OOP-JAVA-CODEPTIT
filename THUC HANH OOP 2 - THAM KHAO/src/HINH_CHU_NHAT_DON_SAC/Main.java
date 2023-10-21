package HINH_CHU_NHAT_DON_SAC;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void right(int[] a, int n, int[] d) {
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < n; i++) {
            while (!st.empty() && a[i] < a[st.peek()]) {
                d[st.peek()] = i;
                st.pop();
            }
            st.push(i);
        }
        while (!st.empty()) {
            d[st.peek()] = n;
            st.pop();
        }
    }

    public static void left(int[] a, int n, int[] d) {
        Stack<Integer> st = new Stack<>();
        for (int i = n - 1; i >= 0; i--) {
            while (!st.empty() && a[i] < a[st.peek()]) {
                d[st.peek()] = i;
                st.pop();
            }
            st.push(i);
        }
        while (!st.empty()) {
            d[st.peek()] = -1;
            st.pop();
        }
    }

    public static long maxArea(int[] a, int[] l, int[] r, int n) {
        left(a, n, l);
        right(a, n, r);
        long res = 0;
        for (int i = 0; i < n; i++) {
            long tmp = (long) a[i] * (r[i] - l[i] - 1);
            res = Math.max(res, tmp);
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt(), n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            b[i] = m - a[i];
        }
        int[] la = new int[n];
        int[] ra = new int[n];
        int[] lb = new int[n];
        int[] rb = new int[n];
        System.out.println(Math.max(maxArea(a, la, ra, n), maxArea(b, lb, rb, n)));
    }
}
