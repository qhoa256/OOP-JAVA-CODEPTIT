package J07010_DANH_SACH_SINH_VIEN_TRONG_FILE_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class J07010 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("SV.in"));
        int n = sc.nextInt();
        sinhVien[] sv = new sinhVien[n];
        for (int i = 0; i < n; i++) {
            sc.nextLine();
            sv[i] = new sinhVien("B20DCCN" + String.format("%03d", i + 1), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextDouble());
        }
        for(sinhVien x:sv){
            System.out.println(x);
        }
    }
}
