package LOP_USER;

import DANH_SACH_LIEN_LAC.sinhVien;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DANHSACH.in"));
        ArrayList<sinhVien> sv = new ArrayList<>();
        while(sc.hasNext()){
            sinhVien x = new sinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            sv.add(x);
        }
        Collections.sort(sv, new Comparator<sinhVien>() {
            @Override
            public int compare(sinhVien o1, sinhVien o2) {
                if(o1.getLop().compareTo(o2.getLop())!=0){
                    return o1.getLop().compareTo(o2.getLop());
                }
                return o1.getMaSV().compareTo(o2.getMaSV());
            }
        });
        for(sinhVien x:sv){
            System.out.println(x);
        }
    }
}