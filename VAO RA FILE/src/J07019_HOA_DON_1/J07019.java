package J07019_HOA_DON_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class J07019 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA1.in"));
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<SanPham> sp = new ArrayList<>();
        while (t-- > 0) {
            SanPham x = new SanPham(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()));
            sp.add(x);
        }
        sc = new Scanner(new File("DATA2.in"));
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 1; i <= n; i++) {
            String[] s = (sc.nextLine()).trim().split("\\s+");
            String maHD = s[0];
            int soLuong = Integer.parseInt(s[1]);
            for(SanPham x:sp){
                if(x.getMaLoai().equals(maHD.substring(0, 2))){
                    String loai = maHD.substring(2);
                    int gia = 0;
                    if(loai.equals("1")){
                        gia = x.getGiaLoai1();
                    }else{
                        gia = x.getGiaLoai2();
                    }
                    int thanhTien = gia * soLuong;
                    double giamGia = 0.0;
                    if(soLuong >= 150){
                        giamGia = 50.0/100.0 * thanhTien;
                    }else if(soLuong >= 100){
                        giamGia = 30.0/100.0 * thanhTien;
                    }else if(soLuong >=50){
                        giamGia = 15.0/100.0 * thanhTien;
                    }
                    double soTien = thanhTien - giamGia;
                    String ID = maHD + "-" + String.format("%03d", i);
                    System.out.println(ID + " " + x.getTenSP() + " " + String.format("%.0f", giamGia) + " " + String.format("%.0f", soTien));
                }
            }
        }
    }
}
