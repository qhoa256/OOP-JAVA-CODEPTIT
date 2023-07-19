package J04001_KHAI_BAO_LOP_POINT;

import java.util.Scanner;

public class J04001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            Point a = new Point(sc.nextDouble(), sc.nextDouble());
            Point b = new Point(sc.nextDouble(), sc.nextDouble());
            System.out.printf("%.4f\n", a.distance(b));
        }
    }
}
