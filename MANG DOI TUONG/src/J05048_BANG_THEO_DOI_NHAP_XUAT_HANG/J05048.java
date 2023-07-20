package J05048_BANG_THEO_DOI_NHAP_XUAT_HANG;

import java.util.ArrayList;
import java.util.Scanner;

public class J05048 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<matHang> mh = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            sc.nextLine();
            mh.add(new matHang(sc.nextLine(), sc.nextLong()));
        }
        for (matHang x : mh) {
            System.out.println(x);
        }
    }
}
