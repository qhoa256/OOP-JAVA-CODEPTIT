package J04010_DIEN_TICH_HINH_TRON_NGOAI_TIEP_TAM_GIAC;

import java.util.Scanner;

public class J04010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            Point p1 = new Point(sc.nextDouble(), sc.nextDouble());
            Point p2 = new Point(sc.nextDouble(), sc.nextDouble());
            Point p3 = new Point(sc.nextDouble(), sc.nextDouble());
            double a = p1.distance(p2), b = p1.distance(p3), c = p2.distance(p3);
            if (a > 0 && b > 0 && c > 0 && a + b > c && a + c > b && b + c > a) {
                double S = Math.sqrt((a + b + c) * (a + b - c ) * (-a + b + c) * (a - b + c)) * 1/4;
                double r = (a * b * c) / (4 * S);
                double res = Math.PI * r * r;
                System.out.printf("%.3f\n", res);
            } else {
                System.out.println("INVALID");
            }
        }
    }
}

//3
//0 0 0 5 0 199
//1 1 1 1 1 1
//0 0 0 5 5 0