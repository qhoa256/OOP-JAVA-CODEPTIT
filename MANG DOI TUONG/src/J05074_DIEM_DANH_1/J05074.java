package J05074_DIEM_DANH_1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class J05074 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<sinhVien> sv = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < t; i++) {
            String id = sc.nextLine();
            sinhVien x = new sinhVien(id, sc.nextLine(), sc.nextLine());
            sv.add(x);
            map.put(id, i);
        }
        for (int i = 0; i < t; i++) {
            String[] x = (sc.nextLine()).split("\\s+");
            int pos = map.get(x[0]);
            for (int j = 0; j < t; j++) {
                if (sv.get(pos).getMaSV().equals(x[0])) {
                    sv.get(pos).setDiemDanh(x[1]);
                    break;
                }
            }
        }
        for (sinhVien x : sv) {
            System.out.println(x);
        }
    }
}

//3
//B19DCCN999
//Le Cong Minh
//D19CQAT02-B
//B19DCCN998
//Tran Truong Giang
//D19CQAT02-B
//B19DCCN997
//Nguyen Tuan Anh
//D19CQCN04-B
//B19DCCN998 xxxmxmmvmx
//B19DCCN997 xmxmxxxvxx
//B19DCCN999 xvxmxmmvvm