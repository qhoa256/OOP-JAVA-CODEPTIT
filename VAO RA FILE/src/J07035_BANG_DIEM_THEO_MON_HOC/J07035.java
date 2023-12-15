package J07035_BANG_DIEM_THEO_MON_HOC;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class J07035 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<SinhVien> list1 = new ArrayList<>();
        HashMap<String, Integer> mp1 = new HashMap<>();
        for (int i = 0; i < n; ++i) {
            String ID = sc.nextLine();
            String fullName = sc.nextLine();
            String classroom = sc.nextLine();
            String email = sc.nextLine();
            list1.add(new SinhVien(ID, fullName, classroom, email));
            mp1.put(ID, i);
        }
        sc.close();

        sc = new Scanner(new File("MONHOC.in"));
        int m = Integer.parseInt(sc.nextLine());
        ArrayList<MonHoc> list2 = new ArrayList<>();
        HashMap<String, Integer> mp2 = new HashMap<>();
        for (int i = 0; i < m; ++i) {
            String ID = sc.nextLine();
            String monHoc = sc.nextLine();
            String soTin = sc.nextLine();
            list2.add(new MonHoc(ID, monHoc, soTin));
            mp2.put(ID, i);
        }
        sc.close();

        sc = new Scanner(new File("BANGDIEM.in"));
        int k = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < k; ++i) {
            String s = sc.nextLine();
            String[] arr = s.trim().split("\\s+");
            int pos1 = mp1.get(arr[0]);
            list1.get(pos1).setMaMH(arr[1]);
            list1.get(pos1).setDiem(Double.parseDouble(arr[2]));
        }
        Collections.sort(list1);
        int q = Integer.parseInt(sc.nextLine());
        while (q-- > 0) {
            String s = sc.nextLine();
            System.out.println("BANG DIEM MON " + list2.get(mp2.get(s)).getTenMH() + ":");
            for (SinhVien x : list1) {
                if (x.getMaMH().equals(s)) {
                    System.out.println(x);
                }
            }
        }
    }
}
