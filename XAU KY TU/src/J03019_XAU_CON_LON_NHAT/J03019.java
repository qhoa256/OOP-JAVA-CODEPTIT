package J03019_XAU_CON_LON_NHAT;

import java.util.Scanner;
import java.util.Stack;

public class J03019 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Character> st = new Stack<>();
        String s = sc.nextLine();
        for (int i = 0; i < s.length(); i++) {
            while (!st.empty() && s.charAt(i) > st.peek()) {
                st.pop();
            }
            st.push(s.charAt(i));
        }
        StringBuilder res = new StringBuilder();
        while (!st.empty()) {
            res.insert(0, st.pop());
        }
        System.out.println(res.toString());
    }
}
