package DANH_SACH_CANH_SU_DUNG_LOP_PAIR_GENERIC;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] a = new int[n + 1][n + 1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        ArrayList<Pair<Integer, Integer>> edge = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (a[i][j] == 1 && i < j) {
                    Pair<Integer, Integer> pair = new Pair<>(i, j);
                    edge.add(pair);
                }
            }
        }
        for(Pair<Integer, Integer> x:edge){
            System.out.println(x);
        }
    }
}
