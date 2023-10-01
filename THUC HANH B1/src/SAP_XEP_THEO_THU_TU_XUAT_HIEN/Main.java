package SAP_XEP_THEO_THU_TU_XUAT_HIEN;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            ArrayList<Integer> a = new ArrayList<>();
            HashMap<Integer, Integer> mp = new HashMap<>();
            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                if (!mp.containsKey(x)) {
                    a.add(x);
                    mp.put(x, 1);
                } else {
                    mp.put(x, mp.get(x) + 1);
                }
            }
            Collections.sort(a, new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {
                    return mp.get(o2) - mp.get(o1);
                }
            });
            for (int x : a) {
                for (int j = 0; j < mp.get(x); j++) {
                    System.out.print(x + " ");
                }
            }
            System.out.println();
        }
    }
}
