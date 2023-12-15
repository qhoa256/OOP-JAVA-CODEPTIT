package J07038_DANH_SACH_THUC_TAP_3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class J07038 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        ArrayList<sinhVien> sv = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < t; i++) {
            String msv = sc.nextLine();
            sinhVien x = new sinhVien(msv, sc.nextLine().trim(), sc.nextLine(), sc.nextLine());
            sv.add(x);
        }
        sc.close();
        sv.sort(new Comparator<sinhVien>() {
            @Override
            public int compare(sinhVien o1, sinhVien o2) {
                return o1.getMaSV().compareTo(o2.getMaSV());
            }
        });
        HashMap<String, String> map = new HashMap<>();
        HashMap<String, Integer> sttDN = new HashMap<>();
        sc = new Scanner(new File("DN.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<doanhNghiep> dn = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String maDN = sc.nextLine();
            String tenDN = sc.nextLine();
            doanhNghiep x = new doanhNghiep(maDN, tenDN, Integer.parseInt(sc.nextLine()));
            dn.add(x);
            map.put(maDN, tenDN);
            sttDN.put(maDN, i);
        }
        sc.close();
        sc = new Scanner(new File("THUCTAP.in"));
        int m = Integer.parseInt(sc.nextLine());
        while (m-- > 0) {
            String[] x = (sc.nextLine()).trim().split("\\s+");
            for(sinhVien tmp : sv){
                if(tmp.getMaSV().equals(x[0])){
                    tmp.thucTap.add(x[1]);
                }
            }
        }
        int q = Integer.parseInt(sc.nextLine());
        while (q-- > 0) {
            String s = sc.nextLine();
            int soLuong = dn.get(sttDN.get(s)).getSoLuong();
            System.out.println("DANH SACH THUC TAP TAI " + map.get(s) + ":");
            for (sinhVien x : sv) {
                if (x.thucTap.size() != 0) {
                    for (int i = 0; i < x.thucTap.size(); i++) {
                        if(x.thucTap.get(i).equals(s) && soLuong > 0){
                            System.out.println(x);
                            soLuong --;
                            break;
                        }
                    }
                }
            }
        }
    }
}
