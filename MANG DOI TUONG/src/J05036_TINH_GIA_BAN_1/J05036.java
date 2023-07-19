package J05036_TINH_GIA_BAN_1;

import java.util.ArrayList;
import java.util.Scanner;

public class J05036 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<matHang> mh = new ArrayList<>();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            sc.nextLine();
            mh.add(new matHang("MH" + String.format("%02d", i + 1), sc.nextLine(), sc.nextLine(), sc.nextInt(), sc.nextInt()));
        }
        for (matHang x : mh) {
            System.out.println(x);
        }
    }
}
