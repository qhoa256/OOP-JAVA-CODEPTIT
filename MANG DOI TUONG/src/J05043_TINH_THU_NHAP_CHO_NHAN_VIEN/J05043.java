package J05043_TINH_THU_NHAP_CHO_NHAN_VIEN;

import java.util.ArrayList;
import java.util.Scanner;

public class J05043 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        ArrayList<nhanVien> nv = new ArrayList<>();
        for (int i = 0; i < t; i++) {
            sc.nextLine();
            nv.add(new nhanVien("NV" + String.format("%02d", i + 1), sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextDouble()));
        }
        for(nhanVien x:nv){
            System.out.println(x);
        }
    }
}
