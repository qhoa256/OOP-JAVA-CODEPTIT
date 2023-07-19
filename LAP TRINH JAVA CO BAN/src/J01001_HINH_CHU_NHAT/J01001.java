package J01001_HINH_CHU_NHAT;

import java.util.Scanner;

public class J01001 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        if (a <= 0 || b <= 0) {
            System.out.println(0);
        } else {
            int P = (a + b) * 2;
            int S = a * b;
            System.out.print(P + " " + S);
        }
    }
}
