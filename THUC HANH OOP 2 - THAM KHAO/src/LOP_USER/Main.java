package LOP_USER;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        User[] a = new User[n];
        HashMap<String, String> mp1 = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            String[] tmp = s.trim().split("\\s+");
            a[i] = new User(tmp[0], tmp[1]);
            mp1.put(tmp[0], tmp[1]);
        }
        HashMap<String, Integer> mp2 = new HashMap<>();
        int m = Integer.parseInt(sc.nextLine());
        for (int i = 1; i <= m; i++) {
            String s = sc.nextLine();
            String[] tmp = s.trim().split("\\s+");
            if (mp1.containsKey(tmp[0])) {
                if (mp1.get(tmp[0]).equals(tmp[1])) {
                    if (!mp2.containsKey(tmp[0])) mp2.put(tmp[0], 1);
                    else mp2.put(tmp[0], mp2.get(tmp[0]) + 1);
                }
            } else {
                mp2.put(tmp[0], 0);
            }
        }
        for (User x : a) {
            if (mp2.get(x.getUsername()) == null) System.out.print(0 + " ");
            else System.out.print(mp2.get(x.getUsername()) + " ");
        }
    }
}
