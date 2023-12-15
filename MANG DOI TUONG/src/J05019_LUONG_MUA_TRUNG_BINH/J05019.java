package J05019_LUONG_MUA_TRUNG_BINH;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class J05019 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<TramDo> td = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        int cnt = 1;
        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            String a = sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            String d = sc.nextLine();
            if (!set.contains(a)) {
                set.add(a);
                String[] q = b.trim().split(":");
                String[] h = c.trim().split(":");
                long thoiGian = Long.parseLong(h[0]) * 60 + Long.parseLong(h[1]) - Long.parseLong(q[0]) * 60 - Long.parseLong(q[1]);
                TramDo x = new TramDo("T" + String.format("%02d", cnt), a);
                x.setThoiGian(x.getThoiGian() + thoiGian / 60.0);
                x.setLuongMua(x.getLuongMua() + Long.parseLong(d));
                td.add(x);
                cnt++;
            } else {
                String[] q = b.trim().split(":");
                String[] h = c.trim().split(":");
                long thoiGian = Long.parseLong(h[0]) * 60 + Long.parseLong(h[1]) - Long.parseLong(q[0]) * 60 - Long.parseLong(q[1]);
                for (TramDo qhoa : td) {
                    if (qhoa.getTenTram().equals(a.trim())) {
                        qhoa.setLuongMua(qhoa.getLuongMua() + Long.parseLong(d));
                        qhoa.setThoiGian(qhoa.getThoiGian() + thoiGian / 60.0);
                        break;
                    }
                }
            }
        }
        for (TramDo x : td) {
            System.out.println(x);
        }
    }
}

//10
//Dong Anh
//07:30
//08:00
//60
//Cau Giay
//07:45
//08:12
//50
//Soc Son
//08:00
//09:15
//78
//Dong Anh
//18:50
//20:00
//88
//Cau Giay
//19:01
//20:00
//77
//Soc Son
//19:06
//20:21
//66
//Dong Anh
//21:00
//21:40
//49
//Cau Giay
//21:50
//22:20
//68
//Dong Anh
//22:15
//23:45
//30
//Cau Giay
//22:50
//23:45
//35