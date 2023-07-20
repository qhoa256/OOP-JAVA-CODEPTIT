package J05050_TINH_TIEN_DIEN;

import java.util.ArrayList;
import java.util.Scanner;

public class J05050 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<khachHang> kh = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            sc.nextLine();
            kh.add(new khachHang("KH" + String.format("%02d", i + 1), sc.nextLine(), sc.nextDouble(), sc.nextDouble()));
        }
        for (khachHang x : kh) {
            System.out.println(x);
        }
    }
}
