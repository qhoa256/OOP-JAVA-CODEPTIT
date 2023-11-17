package J05061_SAP_XEP_KET_QUA_XET_TUYEN;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class J05061 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<phuHo> ph = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        for (int i = 1; i <= t; i++) {
            ph.add(new phuHo("PH" + String.format("%02d", i), sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine())));
        }
        Collections.sort(ph, new Comparator<phuHo>() {
            @Override
            public int compare(phuHo o1, phuHo o2) {
                if(o1.diemTB()!= o2.diemTB()){
                    if(o1.diemTB()<o2.diemTB()){
                        return 1;
                    }else{
                        return -1;
                    }
                }else{
                    return o1.getMaPH().compareTo(o2.getMaPH());
                }
            }
        });
        for (phuHo x : ph) {
            System.out.println(x);
        }
    }
}
