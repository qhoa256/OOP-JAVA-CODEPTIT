package UNG_DUNG_NGAN_XEP;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long ans = 0;
        Stack<Integer> st = new Stack<>();
        long[] cnt = new long[6000001];
        int[] a = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 1; i <= n; i++) {
            while (!st.isEmpty() && a[i] > st.peek()) {
                cnt[st.pop()]--;
                ans++;
            }
            if (!st.isEmpty()) {
                if (a[i] == st.peek()) {
                    if (st.size() > cnt[a[i]]) {
                        ans += cnt[a[i]] + (long)1;
                    } else {
                        ans += cnt[a[i]];
                    }
                } else {
                    ans++;
                }
            }
            cnt[a[i]]++;
            st.push(a[i]);
        }
        System.out.print(ans);
    }
}
