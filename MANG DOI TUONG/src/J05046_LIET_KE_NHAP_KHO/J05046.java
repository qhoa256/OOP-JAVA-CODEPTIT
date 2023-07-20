package J05046_LIET_KE_NHAP_KHO;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class J05046 {
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
        for (matHang x : mh) {
            System.out.println(x);
        }
    }
}
