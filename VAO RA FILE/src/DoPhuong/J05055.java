package DoPhuong;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class J05055 {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<VanDongVien> list = new ArrayList<>();
        TreeSet<Long> se = new TreeSet<>();
        SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss");
        for (int i = 0; i < n; ++i) {
            VanDongVien a = new VanDongVien(i + 1, sc.nextLine(), sc.nextLine(),
                    sdf.parse(sc.nextLine()), sdf.parse(sc.nextLine()));
            list.add(a);
            //System.out.println(a.getSoGiay());
            se.add(a.getSoGiay());
        }
        Collections.sort(list, new Comparator<VanDongVien>() {
            @Override
            public int compare(VanDongVien o1, VanDongVien o2) {
                if (o1.getSoGiay() < o2.getSoGiay()) {
                    return -1;
                } else {
                    return 1;
                }
            }
        });
        list.get(0).setXepHang(1);
        for (int i = 1; i < n; i++) {
            if (list.get(i).getUuTien().equals(list.get(i - 1).getUuTien())) {
                list.get(i).setXepHang(list.get(i - 1).getXepHang());
            } else {
                list.get(i).setXepHang(i + 1);
            }
        }
        Collections.sort(list, new Comparator<VanDongVien>() {
            @Override
            public int compare(VanDongVien o1, VanDongVien o2) {
                return o1.getMa().compareTo(o2.getMa());
            }
        });
        for (VanDongVien x : list) {
            System.out.println(x);
        }
    }
}


//3
//Nguyen Van Thanh
//20/03/1990
//07:00:00
//07:10:01
//Nguyen Hoa Binh
//01/10/1993
//07:02:00
//07:11:20
//Le Thanh Van
//15/03/1998
//07:05:00
//07:15:30