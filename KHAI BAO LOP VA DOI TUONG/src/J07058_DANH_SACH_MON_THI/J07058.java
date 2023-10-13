package J07058_DANH_SACH_MON_THI;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class J07058 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MONHOC.in"));
        int t = sc.nextInt();
        sc.nextLine();
        ArrayList<monThi> mt = new ArrayList<>();
        for(int i=0;i<t;i++){
            monThi x = new monThi(sc.nextLine(), sc.nextLine(), sc.nextLine());
            mt.add(x);
        }
        Collections.sort(mt, new Comparator<monThi>() {
            @Override
            public int compare(monThi o1, monThi o2) {
                return o1.getMaMon().compareTo(o2.getMaMon());
            }
        });
        for(monThi x:mt){
            System.out.println(x);
        }
    }
}
