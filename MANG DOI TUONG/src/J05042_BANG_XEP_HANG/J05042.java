package J05042_BANG_XEP_HANG;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class J05042 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<bangXH> bxh = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            sc.nextLine();
            bxh.add(new bangXH(sc.nextLine(), sc.nextInt(), sc.nextInt()));
        }
        Collections.sort(bxh, new SortBXH());
        for (bangXH x : bxh) {
            System.out.println(x);
        }
    }
}
