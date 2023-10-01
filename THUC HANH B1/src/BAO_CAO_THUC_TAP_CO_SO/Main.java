package BAO_CAO_THUC_TAP_CO_SO;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        HashMap<String, String> mp1 = new HashMap<>();
        int n = sc.nextInt();
        sinhVien[] sv = new sinhVien[n];
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            sv[i] = new sinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            mp1.put(sv[i].getMaSV(), sv[i].getHoTen());
        }
        sc = new Scanner(new File("DETAI.in"));
        int p = sc.nextInt();
        sc.nextLine();
        deTai[] dt = new deTai[p];
        HashMap<String, String> mp2 = new HashMap<>();
        for (int i = 0; i < p; i++) {
            dt[i] = new deTai(String.format("DT%03d", i + 1), sc.nextLine(), sc.nextLine());
            mp2.put(dt[i].getMaDeTai(), dt[i].getTenDeTai() + " " + dt[i].getGiangVien());
        }
        sc = new Scanner(new File("HOIDONG.in"));
        int m = sc.nextInt();
        sc.nextLine();
        hoiDong[] hd = new hoiDong[m];
        TreeSet<String> ts = new TreeSet<>();
        for (int i = 0; i < m; i++) {
            String s = sc.nextLine();
            String[] tmp = s.trim().split("\\s+");
            hd[i] = new hoiDong(tmp[0], tmp[1], tmp[2]);
            ts.add(tmp[2]);
        }
        Arrays.sort(hd);
        for (String x : ts) {
            System.out.println("DANH SACH HOI DONG " + x.charAt(2) + ":");
            for (hoiDong y : hd) {
                if (y.getMaHoiDong().compareTo(x) == 0) {
                    System.out.println(y.getMaSV() + " " + mp1.get(y.getMaSV()) + " " + mp2.get(y.getMaDeTai()));
                }
            }
        }
    }
}
