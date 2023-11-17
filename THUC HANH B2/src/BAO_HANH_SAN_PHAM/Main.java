package BAO_HANH_SAN_PHAM;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MUAHANG.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<sanPham> sp = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            sanPham x = new sanPham(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()));
            sp.add(x);
        }
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<khachHang> kh = new ArrayList<>();
        for (int j = 0; j < t; j++) {
            khachHang x = new khachHang("KH" + String.format("%02d", j + 1), sc.nextLine(), sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), sc.nextLine());
            kh.add(x);
        }
        for (int i = 0; i < kh.size(); i++) {
            khachHang x = kh.get(i);
            for (int j = 0; j < sp.size(); j++) {
                sanPham y = sp.get(j);
                if (x.getMaSP().compareTo(y.getMaSP()) == 0) {
                    int tien = x.getSoLuong() * y.getGiaBan();
                    x.setTongTien(tien);
                    LocalDate mua = LocalDate.parse(x.getNgayMua(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                    LocalDate newDate = mua.plusMonths(y.getBaoHanh());
                    String dateStr = newDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                    x.setHetHan(dateStr);
                }
            }
        }
        Collections.sort(kh, new Comparator<khachHang>() {
            @Override
            public int compare(khachHang o1, khachHang o2) {
                if (o1.ngay().compareTo(o2.ngay()) != 0) {
                    return o1.ngay().compareTo(o2.ngay());
                }
                return o1.getMaKH().compareTo(o2.getMaKH());
            }
        });
        for (khachHang x : kh) {
            System.out.println(x);
        }
    }
}
