package J07018_CHUAN_HOA_DANH_SACH_SINH_VIEN;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J07018 {
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<SinhVien> sv = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            SinhVien x = new SinhVien("B20DCCN" + String.format("%03d", i), sc.nextLine(), sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()));
            sv.add(x);
        }
        for (SinhVien x : sv) {
            System.out.println(x);
        }
    }
}
