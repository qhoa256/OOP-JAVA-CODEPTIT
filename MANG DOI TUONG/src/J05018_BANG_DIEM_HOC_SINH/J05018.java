package J05018_BANG_DIEM_HOC_SINH;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J05018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        ArrayList<bangDiem> bd = new ArrayList<>();
        for (int i = 0; i < t; i++) {
            sc.nextLine();
            bd.add(new bangDiem("HS" + String.format("%02d", i + 1), sc.nextLine(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble(),
                    sc.nextDouble(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble()));
        }
        Collections.sort(bd, new SortBD());
        for (bangDiem x : bd) {
            System.out.println(x);
        }
    }
}
