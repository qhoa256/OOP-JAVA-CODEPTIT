package HUONG_DAN_DO_AN_TOT_NGHIEP;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DANHSACH.in"));
        ArrayList<sinhVien> sv = new ArrayList<>();
        while (sc.hasNext()) {
            sinhVien x = new sinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            sv.add(x);
        }
        HashMap<String, String> giangVien = new HashMap<>();
        HashMap<String, String> doAn = new HashMap<>();
        sc = new Scanner(new File("HUONGDAN.in"));
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String s = sc.nextLine();
            String[] tmp = s.trim().split("\\s+");
            String tenGV = "";
            for (int i = 0; i < tmp.length - 1; i++) {
                tenGV += tmp[i];
                if (i != tmp.length - 2) tenGV += " ";
            }
            int n = Integer.parseInt(tmp[tmp.length - 1]);
            while (n-- > 0) {
                String tmp1 = sc.nextLine();
                String[] tmp2 = tmp1.trim().split("\\s+");
                String msv = tmp2[0];
                String tenDoAn = "";
                for (int i = 1; i < tmp2.length; i++) {
                    tenDoAn += tmp2[i];
                    if (i != tmp2.length - 1) tenDoAn += " ";
                }
                giangVien.put(msv, tenGV);
                doAn.put(msv, tenDoAn);
            }
        }
        Collections.sort(sv, new Comparator<sinhVien>() {
            @Override
            public int compare(sinhVien o1, sinhVien o2) {
                return o1.getMaSV().compareTo(o2.getMaSV());
            }
        });
        for (sinhVien x : sv) {
            if (giangVien.containsKey(x.getMaSV())) {
                System.out.println(x.getMaSV() + " " + x.getHoTen() + " " + giangVien.get(x.getMaSV()) + " " + doAn.get(x.getMaSV()) + " " + x.getSdt());
            }
        }
    }
}
