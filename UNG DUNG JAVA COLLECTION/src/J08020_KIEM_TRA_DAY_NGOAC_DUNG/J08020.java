package J08020_KIEM_TRA_DAY_NGOAC_DUNG;

import java.util.Scanner;
import java.util.Stack;

public class J08020 {
    public static boolean check(String s) {
        Stack<Character> st = new Stack<>();
        for (char x : s.toCharArray()) {
            if (x == '(' || x == '[' || x == '{') {
                st.push(x);
            } else {
                if (st.isEmpty()) {
                    return false;
                } else {
                    Character y = st.peek();
                    if ((y == '(' && x == ')') || (y == '[' && x == ']') || (y == '{' && x == '}'))
                        st.pop();
                    else {
                        return false;
                    }
                }
            }
        }
        return st.isEmpty();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        while (n-- > 0) {
            String s = sc.nextLine();
            if (check(s)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}

//2
//[()]{}{[()()]()}
//[(])