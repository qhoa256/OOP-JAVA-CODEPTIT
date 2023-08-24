package J02017_THU_GON_DAY_SO;

import java.util.Scanner;
import java.util.Stack;

public class J02017 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            if (st.isEmpty()) {
                st.push(x);
            } else {
                int tmp = st.peek();
                if ((tmp + x) % 2 == 0) {
                    st.pop();
                }else{
                    st.push(x);
                }
            }
        }
        System.out.println(st.size());
    }
}
