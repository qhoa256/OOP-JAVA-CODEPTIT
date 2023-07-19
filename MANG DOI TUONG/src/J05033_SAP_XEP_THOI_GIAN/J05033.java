package J05033_SAP_XEP_THOI_GIAN;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class J05033 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Time> tm = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            tm.add(new Time(sc.nextInt(), sc.nextInt(), sc.nextInt()));
        }
        Collections.sort(tm, new SortTime());
        for(Time x:tm){
            System.out.println(x);
        }
    }
}
