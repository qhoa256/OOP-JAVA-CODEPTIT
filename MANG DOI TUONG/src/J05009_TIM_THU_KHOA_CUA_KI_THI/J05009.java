package J05009_TIM_THU_KHOA_CUA_KI_THI;

import java.util.ArrayList;
import java.util.Scanner;

public class J05009 {
    private static int n;
    private static double res;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<thiSinh> ts = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            sc.nextLine();
            ts.add(new thiSinh(String.format("%1d", i + 1), sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble()));
        }
        double res = 0.0;
        for (thiSinh x : ts) {
            res = Math.max(res, x.tongDiem());
        }
        for (thiSinh x : ts) {
            if (x.tongDiem() == res) {
                System.out.println(x);
            }
        }
    }
}
