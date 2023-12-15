package J08011_LIET_KE_VA_DEM;

import java.util.*;

public class J08011 {
    public static boolean check(String s) {
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) < s.charAt(i - 1)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedHashMap<String, Integer> mp = new LinkedHashMap<>();
        while (sc.hasNext()) {
            String s = sc.next();
            if (check(s)) {
                if (mp.containsKey(s)) {
                    mp.put(s, mp.get(s) + 1);
                } else {
                    mp.put(s, 1);
                }
            }
        }
        List<Map.Entry<String, Integer>> res = new ArrayList<>(mp.entrySet());
        Collections.sort(res, (x1, x2) -> {
            Integer a = x1.getValue();
            Integer b = x2.getValue();
            return b.compareTo(a);
        });
        for (Map.Entry<String, Integer> qh : res) {
            System.out.println(qh.getKey() + " " + qh.getValue());
        }
    }
}
