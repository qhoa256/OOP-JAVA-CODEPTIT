package J04014_TINH_TOAN_PHAN_SO;

import java.util.Scanner;

public class J04014 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            long x1 = sc.nextLong(), y1 = sc.nextLong(), x2 = sc.nextLong(), y2 = sc.nextLong();
            PhanSo A = new PhanSo(x1, y1);
            PhanSo B = new PhanSo(x2, y2);
            PhanSo C = A.phepTinhC(B);
            PhanSo D = A.phepTinhD(B, C);
            System.out.print(C);
            System.out.print(" ");
            System.out.println(D);
        }
    }
}
