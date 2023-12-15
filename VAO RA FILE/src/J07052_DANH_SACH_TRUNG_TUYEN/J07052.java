package J07052_DANH_SACH_TRUNG_TUYEN;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class J07052 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("THISINH.in"));
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<thiSinh> ts = new ArrayList<>();
        while(t-- >0){
            thiSinh x = new thiSinh(sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()));
            ts.add(x);
        }
        Collections.sort(ts, new Comparator<thiSinh>() {
            @Override
            public int compare(thiSinh o1, thiSinh o2) {
                if(o1.xetTuyen() != o2.xetTuyen()){
                    if(o1.xetTuyen() < o2.xetTuyen()) return 1;
                    else return -1;
                }else{
                    return o1.getMaTS().compareTo(o2.getMaTS());
                }
            }
        });
        int k = Integer.parseInt(sc.nextLine());
        double diemChuan = ts.get(k-1).xetTuyen();
        System.out.printf("%.1f\n",diemChuan);
        for(thiSinh x:ts){
            System.out.print(x);
            if(x.xetTuyen() >= diemChuan){
                System.out.println("TRUNG TUYEN");
            }else{
                System.out.println("TRUOT");
            }
        }
    }
}
