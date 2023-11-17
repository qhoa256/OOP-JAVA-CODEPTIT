package J05060_KET_QUA_XET_TUYEN;

import java.util.ArrayList;
import java.util.Scanner;

public class J05060 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<phuHo> ph = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        for (int i = 1; i <= t; i++) {
            ph.add(new phuHo("PH" + String.format("%02d", i), sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine())));
        }
        for (phuHo x : ph) {
            System.out.println(x);
        }
    }
}

//3
//Doan Thi Kim
//13/03/1982
//8
//9.5
//Dinh Thi Ngoc Ha
//03/09/1996
//6.5
//8
//Tran Thanh Mai
//12/09/2004
//8
//9
