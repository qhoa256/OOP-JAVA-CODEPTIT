package J01024_SO_TAM_PHAN;

import java.util.Scanner;

public class J01024 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            boolean ok = true;
            String s = sc.nextLine();
            for (char x : s.toCharArray()) {
                if (x != '0' && x != '1' && x != '2') {
                    ok = false;
                    break;
                }
            }
            if (ok) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
