package J05052_TRA_CUU_DON_HANG;

import java.util.ArrayList;
import java.util.Scanner;

public class J05052 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<donHang> dh = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            sc.nextLine();
            dh.add(new donHang(sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextDouble()));
        }
        for (donHang x : dh) {
            System.out.println(x);
        }
    }
}
