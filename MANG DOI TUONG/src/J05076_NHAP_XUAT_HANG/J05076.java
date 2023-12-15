package J05076_NHAP_XUAT_HANG;

import java.util.ArrayList;
import java.util.Scanner;

public class J05076 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<MatHang> mh = new ArrayList<>();
        for (int i = 0; i < t; i++) {
            MatHang x = new MatHang(sc.nextLine(), sc.nextLine(), sc.nextLine());
            mh.add(x);
        }
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<DonHang> dh = new ArrayList<>();
        while (n-- > 0) {
            String[] x = (sc.nextLine()).split("\\s+");
            DonHang tmp = new DonHang(x[0], Long.parseLong(x[1]), Long.parseLong(x[2]), Long.parseLong(x[3]), mh);
            dh.add(tmp);
        }
        for (DonHang x : dh) {
            System.out.println(x);
        }
    }
}

//2
//A001
//Tu lanh
//A
//P002
//May giat
//B
//2
//A001 500 100 300
//P002 1000 1000 500