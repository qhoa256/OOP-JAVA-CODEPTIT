package J05075_DIEM_DANH_2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class J05075 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<sinhVien> sv = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < t; i++) {
            String id = sc.nextLine();
            sinhVien x = new sinhVien(id, sc.nextLine(), sc.nextLine());
            sv.add(x);
            map.put(id, i);
        }
        for (int i = 0; i < t; i++) {
            String[] x = (sc.nextLine()).split("\\s+");
            int pos = map.get(x[0]);
            for (int j = 0; j < t; j++) {
                if (sv.get(pos).getMaSV().equals(x[0])) {
                    sv.get(pos).setDiemDanh(x[1]);
                    break;
                }
            }
        }
        String lopCQ = sc.nextLine();
        for (sinhVien x : sv) {
            if (x.getLop().equals(lopCQ))
                System.out.println(x);
        }
    }
}
