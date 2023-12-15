package J05015_DUA_XE_DAP;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class J05015 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Cyclist> cl = new ArrayList<>();
        while (n-- > 0) {
            Cyclist x = new Cyclist(sc.nextLine(), sc.nextLine(), sc.nextLine());
            cl.add(x);
        }
        Collections.sort(cl, new Comparator<Cyclist>() {
            @Override
            public int compare(Cyclist o1, Cyclist o2) {
                if (o1.thoiGian() < o2.thoiGian()) {
                    return -1;
                } else {
                    return 1;
                }
            }
        });
        for (Cyclist x : cl) {
            System.out.println(x);
        }
    }
}


//3
//Tran Vu Minh
//Ha Noi
//8:30
//Vu Ngoc Hoang
//Hoa Binh
//8:20
//Pham Dinh Tan
//An Giang
//8:45