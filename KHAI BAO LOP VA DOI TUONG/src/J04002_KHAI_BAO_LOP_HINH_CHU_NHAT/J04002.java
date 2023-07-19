package J04002_KHAI_BAO_LOP_HINH_CHU_NHAT;

import java.util.Scanner;

public class J04002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double w = sc.nextDouble(), h = sc.nextDouble();
        String c = sc.next();
        if (w <= 0 || h <= 0) {
            System.out.println("INVALID");
        } else {
            Rectange a = new Rectange(w, h, c);
            System.out.println(a);
        }
    }
}
