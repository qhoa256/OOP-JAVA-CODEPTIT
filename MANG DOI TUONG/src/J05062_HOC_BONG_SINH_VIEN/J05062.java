package J05062_HOC_BONG_SINH_VIEN;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class J05062 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = (sc.nextLine()).split("\\s+");
        int n = Integer.parseInt(s[0]), m = Integer.parseInt(s[1]);
        ArrayList<SinhVien> sv = new ArrayList<>();
        ArrayList<Double> diemHB = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            String s1 = sc.nextLine();
            String[] x = (sc.nextLine()).split("\\s+");
            SinhVien tmp = new SinhVien(s1, Double.parseDouble(x[0]), Integer.parseInt(x[1]));
            diemHB.add(Double.parseDouble(x[0]));
            sv.add(tmp);
        }
        Collections.sort(diemHB, new Comparator<Double>() {
            @Override
            public int compare(Double o1, Double o2) {
                if (o1 < o2) return -1;
                else return 1;
            }
        });
        double diemChuan = diemHB.get(m - 1);
        for (SinhVien x : sv) {
            if (x.getGpa() < diemChuan) {
                x.setLoaiHB("KHONG");
            }
        }
        for (SinhVien x : sv) {
            System.out.println(x);
        }
    }
}
//3 2
//Nguyen Van Nam
//3.59 75
//Tran Hong Ngoc
//3.61 90
//Do Van An
//3.22 90