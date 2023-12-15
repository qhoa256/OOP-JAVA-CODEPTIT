package J06005_QUAN_LY_BAN_HANG_1;

import java.util.ArrayList;
import java.util.Scanner;

public class J06005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<KhachHang> kh = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 1; i <= n; i++) {
            KhachHang x = new KhachHang("KH" + String.format("%03d", i), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            kh.add(x);
        }
        ArrayList<MatHang> mh = new ArrayList<>();
        int m = Integer.parseInt(sc.nextLine());
        for (int i = 1; i <= m; i++) {
            MatHang x = new MatHang("MH" + String.format("%03d", i), sc.nextLine(), sc.nextLine(), Long.parseLong(sc.nextLine()), Long.parseLong(sc.nextLine()));
            mh.add(x);
        }
        ArrayList<HoaDon> hd = new ArrayList<>();
        int k = Integer.parseInt(sc.nextLine());
        for (int i = 1; i <= k; i++) {
            String[] x = (sc.nextLine()).trim().split("\\s+");
            HoaDon qh = new HoaDon("HD" + String.format("%03d", i), x[0].trim(), x[1].trim(), Long.parseLong(x[2]), kh, mh);
            hd.add(qh);
        }
        for (HoaDon x : hd) {
            System.out.println(x);
        }
    }
}


//2
//Nguyen Van Nam
//Nam
//12/12/1997
//Mo Lao-Ha Dong-Ha Noi
//Tran Van Binh
//Nam
//11/14/1995
//Phung Khoang-Nam Tu Liem-Ha Noi
//2
//Ao phong tre em
//Cai
//25000
//41000
//Ao khoac nam
//Cai
//240000
//515000
//3
//KH001 MH001 2
//KH001 MH002 3
//KH002 MH002 4