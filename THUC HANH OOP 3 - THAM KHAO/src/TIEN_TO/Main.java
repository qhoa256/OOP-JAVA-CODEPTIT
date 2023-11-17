package TIEN_TO;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static long cal(Long a, Long b, String x) {
        if (x.equals("+"))
            return a + b;
        else if (x.equals("-"))
            return a - b;
        else if (x.equals("*"))
            return a * b;
        else
            return a / b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            int n = Integer.parseInt(sc.nextLine());
            String []str = (sc.nextLine()).split("\\s+");
            ArrayList<String> a = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                a.add(str[i]);
            }
            Stack<Long> st = new Stack<>();
            for (int i = n - 1; i >= 0; i--) {
                if (a.get(i).compareTo("+") != 0 && a.get(i).compareTo("-") != 0 && a.get(i).compareTo("*") != 0 && a.get(i).compareTo("/") != 0) {
                    st.push(Long.parseLong(a.get(i)));
                } else {
                    Long x = st.peek();
                    st.pop();
                    Long y = st.peek();
                    st.pop();
                    st.push(cal(x, y, a.get(i)));
                }
            }
            System.out.println(st.peek());
        }
    }
}
