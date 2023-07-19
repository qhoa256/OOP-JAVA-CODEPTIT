package J05032_TRE_NHAT_GIA_NHAT;

import java.util.Scanner;

public class J05032 {
    public static String tuoi(String s) {
        String[] a = s.split("/");
        String tmp = "";
        for (int i = a.length - 1; i >= 0; i--) {
            tmp += a[i];
        }
        return tmp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String tre = "", gia = "", Max = "", Min = "Z";
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            String ten = sc.next();
            String ns = sc.next();
            String age = tuoi(ns);
            if (Max.compareTo(age) < 0) {
                Max = age;
                gia = ten;
            }
            if (Min.compareTo(age) > 0) {
                Min = age;
                tre = ten;
            }
        }
        System.out.println(gia + "\n" + tre);
    }
}
