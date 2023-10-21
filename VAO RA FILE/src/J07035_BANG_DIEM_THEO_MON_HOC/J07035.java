package J07035_BANG_DIEM_THEO_MON_HOC;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J07035 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<sinhVien> sv = new ArrayList<>();
        while (n-- > 0) {
            sinhVien x = new sinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            x.chuanHoa();
            sv.add(x);
        }
        sc = new Scanner(new File("MONHOC.in"));
        int m = Integer.parseInt(sc.nextLine());
        ArrayList<monHoc> mh = new ArrayList<>();
        while (m-- > 0) {
            monHoc x = new monHoc(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()));
            mh.add(x);
        }
        sc = new Scanner(new File("BANGDIEM.in"));
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<bangDiem> bd = new ArrayList<>();
        while (t-- > 0) {
            bangDiem x = new bangDiem(sc.nextLine(), sv, mh);
            bd.add(x);
        }
        Collections.sort(bd);
        int q = Integer.parseInt(sc.nextLine());
        while (q-- > 0) {
            String maMH = sc.nextLine();
            for (monHoc x : mh) {
                if (x.getMaMon().contains(maMH)) {
                    System.out.printf("BANG DIEM MON %s:\n", x.getTenMon());
                    break;
                }
            }
            for (bangDiem x : bd) {
                if (x.getMh().getMaMon().contains(maMH)) {
                    System.out.println(x);
                }
            }
        }
    }
}
