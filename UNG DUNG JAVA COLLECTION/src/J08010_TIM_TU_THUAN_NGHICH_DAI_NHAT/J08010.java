package J08010_TIM_TU_THUAN_NGHICH_DAI_NHAT;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class J08010 {
    public static boolean check(String s) {
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        return s.equals(sb.toString());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> a = new ArrayList<>();
        HashMap<String, Integer> mp = new HashMap<>();
        int max_len = -100000;
        while (sc.hasNext()) {
            String s = sc.next();
            if (check(s)) {
                max_len = Math.max(max_len, s.length());
                if (mp.containsKey(s)) {
                    mp.put(s, mp.get(s) + 1);
                } else {
                    a.add(s);
                    mp.put(s, 1);
                }
            }
        }
        for (String x : a) {
            if (x.length() == max_len) {
                System.out.println(x + " " + mp.get(x));
            }
        }
    }
}
