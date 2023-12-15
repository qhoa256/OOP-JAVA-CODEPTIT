package J03037_VONG_TRON;

import java.util.Scanner;

public class J03037 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int[] begin = new int[256];
        int[] end = new int[256];
        int[] used = new int[256];
        for (int i = 0; i < s.length(); i++) {
            if (used[s.charAt(i)] == 0) {
                used[ s.charAt(i)] = 1;
                begin[s.charAt(i)] = i;
            } else {
                end[s.charAt(i)] = i;
            }
        }
        int res = 0;
        for (char x = 'A'; x <= 'Z'; x++) {
            for (char y = 'A'; y <= 'Z'; y++) {
                // Xet duong cheo
                if (begin[x] < begin[y] && begin[y] < end[x] && end[x] < end[y]) {
                    res++;
                }
            }
        }
        System.out.println(res);
    }
}
