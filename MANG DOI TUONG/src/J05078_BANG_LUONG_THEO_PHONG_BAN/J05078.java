package J05078_BANG_LUONG_THEO_PHONG_BAN;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class J05078 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<NhanVien> nv = new ArrayList<>();
        HashMap<String, String> map = new HashMap<>();
        for (int i = 0; i < t; i++) {
            String[] x = (sc.nextLine()).trim().split("\\s+");
            String id = x[0];
            StringBuilder sb = new StringBuilder();
            for (int j = 1; j < x.length; j++) {
                sb.append(x[j]);
                if (j != x.length - 1) {
                    sb.append(" ");
                }
            }
            String ten = sb.toString();
            map.put(id, ten);
        }
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            NhanVien x = new NhanVien(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()));
            nv.add(x);
        }
        String z = sc.nextLine();
        System.out.println("Bang luong phong " + map.get(z) + ":");
        for (NhanVien x : nv) {
            if (x.pb().equals(z)) {
                System.out.println(x);
            }
        }
    }
}

//2
//HC Hanh chinh
//KH Ke hoach Dau tu
//2
//C06HC
//Tran Binh Minh
//65
//25
//D03KH
//Le Hoa Binh
//59
//24
//KH