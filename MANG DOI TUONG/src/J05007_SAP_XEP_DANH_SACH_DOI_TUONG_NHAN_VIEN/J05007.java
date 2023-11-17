package J05007_SAP_XEP_DANH_SACH_DOI_TUONG_NHAN_VIEN;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class J05007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<nhanVien> nv = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for(int i=1; i<=n;i++){
            nv.add(new nhanVien(String.format("%05d", i), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(nv, new Comparator<nhanVien>() {
            @Override
            public int compare(nhanVien o1, nhanVien o2) {
                return o1.getTuoi().compareTo(o2.getTuoi());
            }
        });
        for(nhanVien x:nv){
            System.out.println(x);
        }
    }
}

//3
//Nguyen Van A
//Nam
//22/10/1982
//Mo Lao-Ha Dong-Ha Noi
//8333012345
//31/12/2013
//Ly Thi B
//Nu
//15/10/1988
//Mo Lao-Ha Dong-Ha Noi
//8333012346
//22/08/2011
//Hoang Thi C
//Nu
//04/02/1981
//Mo Lao-Ha Dong-Ha Noi
//8333012347
//22/08/2011