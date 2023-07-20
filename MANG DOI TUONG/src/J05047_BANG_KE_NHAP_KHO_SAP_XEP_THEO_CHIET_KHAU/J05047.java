package J05047_BANG_KE_NHAP_KHO_SAP_XEP_THEO_CHIET_KHAU;

import java.util.*;

public class J05047 {
    public static String id(String s) {
        String res = "";
        String[] a = s.split("\\s+");
        for (int i = 0; i < a.length - 1; i++) {
            res += Character.toUpperCase(a[i].charAt(0));
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<matHang> mh = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            sc.nextLine();
            String s = sc.nextLine();
            int so;
            String tmp = id(s);
            if (map.containsKey(tmp)) {
                so = map.get(tmp) + 1;
            } else {
                so = 1;
            }
            map.put(tmp, so);
            mh.add(new matHang(tmp + String.format("%02d", so), s, sc.nextInt(), sc.nextInt()));
        }
        Collections.sort(mh, new Comparator<matHang>() {
            @Override
            public int compare(matHang o1, matHang o2) {
                return o2.chietKhau() - o1.chietKhau();
            }
        });
        for (matHang x : mh) {
            System.out.println(x);
        }
    }
}
