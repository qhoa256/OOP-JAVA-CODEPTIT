package J03032_DAO_TU;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class J03032 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String s = sc.nextLine();
            ArrayList<String> al = new ArrayList<>();
            String[] a = s.split("\\s+");
            for (String x : a) {
                StringBuilder sb = new StringBuilder(x);
                al.add(sb.reverse().toString());
            }
            for (String x : al) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}
