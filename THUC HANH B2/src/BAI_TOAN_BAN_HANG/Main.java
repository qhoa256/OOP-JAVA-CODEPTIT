package BAI_TOAN_BAN_HANG;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("KH.in"));
        ArrayList<khachHang> kh = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        for (int i = 1; i <= t; i++) {
            khachHang x = new khachHang("KH" + String.format("%03d", i), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            kh.add(x);
        }
        sc = new Scanner(new File("MH.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<matHang> mh = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            matHang x = new matHang("MH" + String.format("%03d", i), sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()));
            mh.add(x);
        }
        sc = new Scanner(new File("HD.in"));
        int m = Integer.parseInt(sc.nextLine());
        ArrayList<hoaDon> hd = new ArrayList<>();
        for (int i = 1; i <= m; i++) {
            String[] s = (sc.nextLine()).trim().split("\\s+");
            hoaDon x = new hoaDon("HD" + String.format("%03d", i), s[0], s[1], Integer.parseInt(s[2]));
            x.setKh(kh);
            x.setMh(mh);
            hd.add(x);
        }
        for (hoaDon h : hd) {
            System.out.print(h.getMaHD() + " ");
            for (khachHang x : kh) {
                if (h.getMaKH().equals(x.getMaKH())) {
                    System.out.print(x.getHoTen() + " " + x.getDiaChi() + " ");
                    for (matHang y : mh) {
                        if (h.getMaMH().equals(y.getMaMH())) {
                            System.out.print(y.getTenMH() + " " + y.getDonVi() + " ");
                            System.out.println(y.getGiaMua() + " " + y.getGiaBan() + " " + h.getSoLuong() + " " + (y.getGiaBan() * h.getSoLuong()));
                        }
                    }
                }
            }
        }
    }
}
