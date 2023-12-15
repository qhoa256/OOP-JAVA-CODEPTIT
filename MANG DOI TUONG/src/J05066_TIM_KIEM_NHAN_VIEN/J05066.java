package J05066_TIM_KIEM_NHAN_VIEN;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class J05066 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<NhanVien> nv = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        while (n-- > 0) {
            String[] s = (sc.nextLine()).trim().split("\\s+");
            String maNV = s[0];
            StringBuilder res = new StringBuilder("");
            for (int i = 1; i < s.length; i++) {
                res.append(s[i]);
                if (i != s.length - 1) res.append(" ");
            }
            String id = maNV.substring(0, 2);
            int soHieu = Integer.parseInt(maNV.substring(4));
            if((soHieu > 1 && id.equals("GD")) || (soHieu > 3 && id.equals("TP") || (soHieu > 3 && id.equals("PP")))){
                StringBuilder sb = new StringBuilder("NV");
                sb.append(maNV.substring(2));
                maNV = sb.toString();
            }
            nv.add(new NhanVien(maNV, res.toString()));
        }
        Collections.sort(nv, new Comparator<NhanVien>() {
            @Override
            public int compare(NhanVien o1, NhanVien o2) {
                if (!o1.bacLuong().equals(o2.bacLuong())) {
                    return o2.bacLuong().compareTo(o1.bacLuong());
                } else {
                    return o1.soHieu().compareTo(o2.soHieu());
                }
            }
        });
        int q = Integer.parseInt(sc.nextLine());
        while (q-- > 0) {
            String ten = sc.nextLine().trim();
            for (NhanVien x : nv) {
                if (x.getHoTen().toLowerCase().contains(ten.toLowerCase())) {
                    System.out.println(x);
                }
            }
            System.out.println();
        }
    }
}


//6
//GD08001 Nguyen Kim Loan
//TP05002 Hoang Thanh Tuan
//TP05001 Tran Binh Nguyen
//PP06002 Phan Trung Tuan
//PP06001 Tran Quoc Huy
//NV04003 Vo Van Lan
//2
//OA
//aN