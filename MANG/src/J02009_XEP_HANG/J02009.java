package J02009_XEP_HANG;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class J02009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Pair> a = new ArrayList<>();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            a.add(new Pair(sc.nextInt(), sc.nextInt()));
        }
        Collections.sort(a, new Comparator<Pair>() {
            @Override
            public int compare(Pair o1, Pair o2) {
                return o1.getA() - o2.getA();
            }
        });
        int res = a.get(0).getA();
        for (int i = 0; i < n; i++) {
            if (a.get(i).getA() >= res) {
                res = a.get(i).getA() + a.get(i).getB();
            } else {
                res += a.get(i).getB();
            }
        }
        System.out.print(res);
    }
}
