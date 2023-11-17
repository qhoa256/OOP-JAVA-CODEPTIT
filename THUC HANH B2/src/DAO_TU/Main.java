package DAO_TU;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String[] x = (sc.nextLine()).trim().split("\\s+");
            for (int i = x.length - 1; i >= 0; i--) {
                System.out.print(x[i] + " ");
            }
            System.out.println();
        }
    }
}
