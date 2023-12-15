package J05077_TINH_LUONG;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class J05077 {
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
            String tmp = x.pb();
            x.setPhongBan(map.get(tmp));
            nv.add(x);
        }
        for (NhanVien x : nv) {
            System.out.println(x);
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
