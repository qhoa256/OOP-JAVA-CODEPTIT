package DANH_SACH_LIEN_LAC;

import javax.security.sasl.SaslClient;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DANHSACH.in"));
        ArrayList<sinhVien> sv = new ArrayList<>();
        while(sc.hasNextLine()){
            sv.add(new sinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(sv, new sortSV());
        for(sinhVien x:sv){
            System.out.println(x);
        }
    }
}
