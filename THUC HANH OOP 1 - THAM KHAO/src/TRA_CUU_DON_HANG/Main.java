package TRA_CUU_DON_HANG;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        donHang []a = new donHang[n];
        for(int i = 0;i<n;i++){
            sc.nextLine();
            a[i] = new donHang(sc.nextLine(), sc.nextLine(), sc.nextLong(), sc.nextLong());
        }
        for(donHang x: a)
            System.out.println(x);
    }
}
