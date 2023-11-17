package LIET_KE_VA_DEM;

import java.io.IOException;
import java.util.*;

public class Main {
    public static boolean check(String s) {
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) < s.charAt(i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        ArrayList<String> a = new ArrayList<>();
        while (sc.hasNext()) {
            String s = sc.next();
            if (check(s)) {
                if (map.containsKey(s)) {
                    map.put(s, map.get(s) + 1);
                } else {
                    map.put(s, 1);
                    a.add(s);
                }
            }
        }
        Collections.sort(a, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return map.get(o2) - map.get(o1);
            }
        });
        for (String x : a) {
            System.out.println(x + " " + map.get(x));
        }
    }
}
