package SO_LUONG_DAU_NGOAC_VUONG_LON_NHAT;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int cnt = 0, res = 0;
        Stack<Pair<Character, Integer>> st = new Stack<>();
        st.push(new Pair<>('@', 0));
        for (char c : s.toCharArray()) {
            if ((!st.isEmpty() && ((c == ')' && st.peek().first == '(')) || (c == ']' && st.peek().first == '['))) {
                st.pop();
                if (!st.isEmpty()) {
                    res = Math.max(res, cnt - st.peek().second);
                }
            } else {
                if (c == '[') cnt++;
                st.push(new Pair<>(c, cnt));
            }
        }
        System.out.println(res);
    }
}
