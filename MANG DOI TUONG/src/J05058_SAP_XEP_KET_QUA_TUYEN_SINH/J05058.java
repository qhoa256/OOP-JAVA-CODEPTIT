package J05058_SAP_XEP_KET_QUA_TUYEN_SINH;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J05058 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<thiSinh> ts = new ArrayList<>();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            sc.nextLine();
            ts.add(new thiSinh(sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble()));
        }
        Collections.sort(ts, new SortDiemXT());
        for (thiSinh x : ts) {
            System.out.println(x);
        }
    }
}
