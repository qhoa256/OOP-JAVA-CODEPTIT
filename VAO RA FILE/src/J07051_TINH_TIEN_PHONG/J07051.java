package J07051_TINH_TIEN_PHONG;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class J07051 {
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        Scanner sc = new Scanner(new File("KHACHHANG.in"));
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<KhachHang> kh = new ArrayList<>();
        for (int i = 1; i <= t; i++) {
            KhachHang x = new KhachHang("KH" + String.format("%02d", i), sc.nextLine().trim(), sc.nextLine().trim(), sc.nextLine().trim(), sc.nextLine().trim(), Long.parseLong(sc.nextLine().trim()));
            kh.add(x);
        }
        Collections.sort(kh, new Comparator<KhachHang>() {
            @Override
            public int compare(KhachHang o1, KhachHang o2) {
                try {
                    if (o1.tongTien() < o2.tongTien()) return 1;
                    else return -1;
                } catch (ParseException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        for (KhachHang x : kh) {
            System.out.println(x);
        }
    }
}
