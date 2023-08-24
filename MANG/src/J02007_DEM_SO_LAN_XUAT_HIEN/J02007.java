package J02007_DEM_SO_LAN_XUAT_HIEN;

import java.util.*;

public class J02007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 1; i <= t; i++) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int h = 0; h < n; h++) {
                a[h] = sc.nextInt();
            }
            LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
            for (int x : a) {
                if (map.containsKey(x)) {
                    map.put(x, map.get(x) + 1);
                } else map.put(x, 1);
            }
            System.out.println("Test " + i + ":");
            Set<Map.Entry<Integer, Integer>> entrySet = map.entrySet();
            for (Map.Entry<Integer, Integer> entry : entrySet) {
                System.out.println(entry.getKey() + " xuat hien " + entry.getValue() + " lan");
            }
        }
    }
}
