package J07048_DANH_SACH_SAN_PHAM_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class J07048 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("SANPHAM.in"));
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<sanPham> sp = new ArrayList<>();
        while(t-- >0){
            sanPham x = new sanPham(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()));
            sp.add(x);
        }
        Collections.sort(sp, new Comparator<sanPham>() {
            @Override
            public int compare(sanPham o1, sanPham o2) {
                if(o1.getGiaBan()!=o2.getGiaBan()){
                    return o2.getGiaBan()-o1.getGiaBan();
                }else{
                    return o1.getMaSP().compareTo(o2.getMaSP());
                }
            }
        });
        for(sanPham x:sp){
            System.out.println(x);
        }
    }
}
