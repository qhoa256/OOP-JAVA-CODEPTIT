package DANH_SACH_THI_ICPC;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        team[] a = new team[n];
        for (int i = 0; i < n; i++) {
            a[i] = new team("Team" + String.format("%02d", i + 1), sc.nextLine(), sc.nextLine());
        }
        HashMap<String, String> mp = new HashMap<>();
        for (team x : a) {
            String s = x.getTenTeam() + " " + x.getTenTruong();
            mp.put(x.getMaTeam(), s);
        }
        int m = sc.nextInt();
        thiSinh[] ts = new thiSinh[m];
        sc.nextLine();
        for (int i = 0; i < m; i++) {
            ts[i] = new thiSinh("C" + String.format("%03d", i + 1), sc.nextLine(), sc.nextLine());
        }

        Arrays.sort(ts, new Comparator<thiSinh>() {
            @Override
            public int compare(thiSinh o1, thiSinh o2) {
                return o1.getHoTen().compareTo(o2.getHoTen());
            }
        });
        for (thiSinh x : ts) {
            System.out.println(x + " " + mp.get(x.getMaTeam()));
        }
    }
}
