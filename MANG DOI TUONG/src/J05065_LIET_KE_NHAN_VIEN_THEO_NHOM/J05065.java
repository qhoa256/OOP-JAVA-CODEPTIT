package J05065_LIET_KE_NHAN_VIEN_THEO_NHOM;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class J05065 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int giamDoc = 1, truongPhong = 3, phoPhong = 3;
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
            if (id.equals("GD")) {
                if (giamDoc > 0) {
                    giamDoc--;
                } else {
                    StringBuilder x = new StringBuilder("NV");
                    x.append(maNV.substring(2));
                    maNV = x.toString();
                }
            } else if (id.equals("TP")) {
                if (truongPhong > 0) {
                    truongPhong--;
                } else {
                    StringBuilder x = new StringBuilder("NV");
                    x.append(maNV.substring(2));
                    maNV = x.toString();
                }
            } else if (id.equals("PP")) {
                if (phoPhong > 0) {
                    phoPhong--;
                } else {
                    StringBuilder x = new StringBuilder("NV");
                    x.append(maNV.substring(2));
                    maNV = x.toString();
                }
            }
//            System.out.println(maNV + " " + res);
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
            String cv = sc.nextLine().trim();
            for (NhanVien x : nv) {
                //System.out.println(x.maCV());
                if (x.maCV().equals(cv)) {
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
//TP
//PP

//6
//GD08001 Nguyen Kim Loan
//GD05002 Hoang Thanh Tuan
//TP05001 Tran Binh Nguyen
//TP06002 Phan Trung Tuan
//TP06001 Tran Quoc Huy
//TP04003 Vo Van Lan
//3
//TP
//GD
//NV