package J05008_DIEN_TICH_DA_GIAC;

import java.io.File;
import java.util.Scanner;

public class J05008 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int n = in.nextInt();
            Point[] p = new Point[n];
            for (int i = 0; i < n; i++) {
                p[i] = new Point(in.nextInt(), in.nextInt());
            }
            Polygon poly = new Polygon(p);
            System.out.println(poly.getArea());
        }
    }
}


//2
//3
//0 0
//1 0
//0 1
//4
//0 0
//2 0
//2 2
//0 2