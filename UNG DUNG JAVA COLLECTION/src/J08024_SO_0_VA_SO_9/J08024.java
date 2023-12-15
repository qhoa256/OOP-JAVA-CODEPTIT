package J08024_SO_0_VA_SO_9;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class J08024 {
    public static long[] res = new long[256];

    public static void sinh() {
        Queue<String> q = new LinkedList<>();
        ArrayList<Long> v = new ArrayList<>();
        q.add("9");
        v.add((long) 9);

        while (true) {
            String x = q.poll();
            if (x.length() > 10) break;
            String x1 = x + "0";
            String x2 = x + "9";
            q.add(x1);
            q.add(x2);
            v.add(Long.parseLong(x1));
            v.add(Long.parseLong(x2));
        }

        for (int i = 1; i <= 100; i++) {
            for (long x : v) {
                if (x % i == 0) {
                    res[i] = x;
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        sinh();
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            System.out.println(res[n]);
        }
    }
}
