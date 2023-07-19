package J05022_LIET_KE_SINH_VIEN_THEO_LOP;

import java.util.ArrayList;
import java.util.Scanner;

public class J05022 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<sinhVien> sv = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            sv.add(new sinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String x = sc.nextLine();
            System.out.println("DANH SACH SINH VIEN LOP " + x + ":");
            for(sinhVien y:sv){
                if(y.getLop().compareTo(x) == 0){
                    System.out.println(y);
                }
            }
        }
    }
}
