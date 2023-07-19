package J05031_BANG_DIEM_THANH_PHAN_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class J05031 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        ArrayList<bangDiem> bd = new ArrayList<>();
        while (t-- > 0) {
            sc.nextLine();
            bd.add(new bangDiem(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble()));
        }
        Collections.sort(bd, new Comparator<bangDiem>() {
            @Override
            public int compare(bangDiem o1, bangDiem o2) {
                return o1.getTenSV().compareTo(o2.getTenSV());
            }
        });
        int stt = 1;
        for (bangDiem x : bd) {
            System.out.print(stt + " ");
            stt++;
            System.out.println(x);
        }
    }
}
