package J05014_TUYEN_GIAO_VIEN;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class J05014 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<GiaoVien> gv = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 1; i <= n; i++) {
            GiaoVien x = new GiaoVien("GV" + String.format("%02d", i), sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()));
            gv.add(x);
        }
        Collections.sort(gv, new Comparator<GiaoVien>() {
            @Override
            public int compare(GiaoVien o1, GiaoVien o2) {
                if (o1.tongDiem() != o2.tongDiem()){
                    if(o1.tongDiem() < o2.tongDiem()) return 1;
                    else return -1;
                }
                else return o1.getMaGV().compareTo(o2.getMaGV());
            }
        });
        for (GiaoVien x : gv) {
            System.out.println(x);
        }
    }
}

//3
//Le Van Binh
//A1
//7.0
//3.0
//Tran Van Toan
//B3
//4.0
//7.0
//Hoang Thi Tam
//C2
//7.0
//6.0