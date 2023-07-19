package J05010_SAP_XEP_DANH_SACH_MAT_HANG;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J05010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<matHang> mh = new ArrayList<>();
        for(int i=0;i<n;i++){
            sc.nextLine();
            mh.add(new matHang(String.format("%01d",i+1), sc.nextLine(),sc.nextLine(),sc.nextDouble(),sc.nextDouble()));
        }
        Collections.sort(mh, new SortMH());
        for(matHang x:mh){
            System.out.println(x);
        }
    }
}
