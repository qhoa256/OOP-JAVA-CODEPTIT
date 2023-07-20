package J05045_SAP_XEP_NHAN_VIEN_THEO_THU_NHAP;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J05045 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        ArrayList<nhanVien> nv = new ArrayList<>();
        for (int i = 0; i < t; i++) {
            sc.nextLine();
            nv.add(new nhanVien("NV" + String.format("%02d", i + 1), sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextDouble()));
        }
        Collections.sort(nv, new SortNV());
        for (nhanVien x : nv) {
            System.out.println(x);
        }
    }
}
