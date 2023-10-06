package DANH_SO_THU_TU_CAP_DAU_NGOAC;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String s = sc.nextLine();
            int cnt = 1;
            Stack<Integer> st = new Stack<>();
            for (char i : s.toCharArray()) {
                if (i == '(') {
                    st.push(cnt);
                    System.out.print(cnt + " ");
                    cnt++;
                } else if (i == ')') {
                    System.out.print(st.peek() + " ");
                    st.pop();
                }
            }
            System.out.println();
        }
    }
}
