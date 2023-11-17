package J05011_TINH_GIO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class J05011 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<gameThu> gt = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            gt.add(new gameThu(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(gt, new Comparator<gameThu>() {
            @Override
            public int compare(gameThu o1, gameThu o2) {
                if (o1.soPhut() < o2.soPhut()) {
                    return 1;
                } else {
                    return -1;
                }
            }
        });
        for (gameThu x : gt) {
            System.out.println(x);
        }
    }
}

//3
//01T
//Nguyen Van An
//09:00
//10:30
//06T
//Hoang Van Nam
//15:30
//18:00
//02I
//Tran Hoa Binh
//09:05
//10:00
