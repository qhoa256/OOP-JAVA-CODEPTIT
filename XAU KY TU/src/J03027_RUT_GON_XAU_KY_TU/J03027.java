package J03027_RUT_GON_XAU_KY_TU;

import java.util.Scanner;
import java.util.Stack;

public class J03027 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (st.empty()) {
                st.push(s.charAt(i));
            } else {
                Character x = st.peek();
                if (x == s.charAt(i)) {
                    st.pop();
                }else{
                    st.push(s.charAt(i));
                }
            }
        }
        if (st.empty()) {
            System.out.println("Empty String");
        } else {
            String res = "";
            while (!st.empty()) {
                res += st.peek();
                st.pop();
            }
            for (int i = res.length() - 1; i >= 0; i--) {
                System.out.print(res.charAt(i));
            }
        }
    }
}
