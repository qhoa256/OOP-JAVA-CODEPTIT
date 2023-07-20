package J05044_LIET_KE_NHAN_VIEN_THEO_CHUC_VU;

import java.util.ArrayList;
import java.util.Scanner;

public class J05044 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        ArrayList<nhanVien> nv = new ArrayList<>();
        for (int i = 0; i < t; i++) {
            sc.nextLine();
            nv.add(new nhanVien("NV" + String.format("%02d", i + 1), sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextDouble()));
        }
        String cv = sc.next();
        for (nhanVien x : nv) {
            if (x.getChucVu().contentEquals(cv))
                System.out.println(x);
        }
    }
}
