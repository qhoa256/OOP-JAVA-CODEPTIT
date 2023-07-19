package J03021_DIEN_THOAI_CUC_GACH;

import java.util.Scanner;

public class J03021 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String s = sc.nextLine().toUpperCase();
            String res = "";
            for (int i = 0; i < s.length(); i++) {
                char x = s.charAt(i);
                if (x == 'A' || x == 'B' || x == 'C') {
                    res += "2";
                } else if (x == 'D' || x == 'E' || x == 'F') {
                    res += "3";
                } else if (x == 'G' || x == 'H' || x == 'I') {
                    res += "4";
                } else if (x == 'J' || x == 'K' || x == 'L') {
                    res += "5";
                } else if (x == 'M' || x == 'N' || x == 'O') {
                    res += "6";
                } else if (x == 'P' || x == 'Q' || x == 'R' || x == 'S') {
                    res += "7";
                } else if (x == 'T' || x == 'U' || x == 'V') {
                    res += "8";
                } else {
                    res += "9";
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append(res);
            sb.reverse();
            if (sb.toString().compareTo(res) != 0) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
    }
}
