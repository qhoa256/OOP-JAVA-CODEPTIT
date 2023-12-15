package J05072_TINH_CUOC_DIEN_THOAI_CO_DINH_2;

import java.util.*;

public class J05072 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, String> mp1 = new HashMap<>();
        HashMap<String, Integer> mp2 = new HashMap<>();
        int t = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < t; i++) {
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            int s3 = Integer.parseInt(sc.nextLine());
            mp1.put(s1, s2);
            mp2.put(s1, s3);
        }
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<DienThoai> dt = new ArrayList<>();
        while (n-- > 0) {
            String[] x = (sc.nextLine()).trim().split("\\s+");
            String tinh = "";
            String sdt = x[0];
            String batDau = x[1];
            String ketThuc = x[2];
            if (sdt.charAt(0) == '0') {
                tinh = mp1.get(sdt.substring(1, 3));
            } else {
                tinh = "Noi mang";
            }
            String[] q = batDau.split(":");
            String[] h = ketThuc.split(":");
            int a = Integer.parseInt(q[0]), b = Integer.parseInt(q[1]), c = Integer.parseInt(h[0]), d = Integer.parseInt(h[1]);
            long soPhut = (long) c * 60 + d - (long) a * 60 - b;
            long soTien = 0;
            if (tinh.equals("Noi mang")) {
                soPhut = Math.round(1.0 * soPhut / 3.0);
                soTien = (long) 800 * Math.round(soPhut);
            } else {
                soTien = (long) mp2.get(sdt.substring(1, 3)) * soPhut;
            }
            dt.add(new DienThoai(sdt, tinh, soPhut, soTien));
        }
        Collections.sort(dt, new Comparator<DienThoai>() {
            @Override
            public int compare(DienThoai o1, DienThoai o2) {
                if (o1.getSoTien() < o2.getSoTien()) {
                    return 1;
                } else {
                    return -1;
                }
            }
        });
        for (DienThoai x : dt) {
            System.out.println(x);
        }
    }
}
