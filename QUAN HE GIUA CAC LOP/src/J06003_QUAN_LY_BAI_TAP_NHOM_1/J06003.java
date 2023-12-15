package J06003_QUAN_LY_BAI_TAP_NHOM_1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class J06003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] x = (sc.nextLine()).trim().split("\\s+");
        int n = Integer.parseInt(x[0]);
        int m = Integer.parseInt(x[1]);
        ArrayList<SinhVien> sv = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            SinhVien tmp = new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            sv.add(tmp);
        }
        HashMap<String, String> map = new HashMap<>();
        for (int i = 1; i <= m; i++) {
            map.put(i + "", sc.nextLine());
        }
        int q = Integer.parseInt(sc.nextLine());
        while (q-- > 0) {
            String h = sc.nextLine();
            System.out.println("DANH SACH NHOM " + h + ":");
            for(SinhVien qh:sv){
                if(qh.getStt().equals(h)){
                    System.out.println(qh);
                }
            }
            System.out.println("Bai tap dang ky: " + map.get(h));
        }
    }
}

//5 2
//B17DTCN001
//Nguyen Chi  Linh
//0987345543
//1
//B17DTCN011
//Vu Viet Thang
//0981234567
//1
//B17DTCN023
//Pham Trong Thang
//0992123456
//1
//B17DTCN022
//Nguyen Van  Quyet
//0977865432
//2
//B17DTCN031
//Ngo Thanh Vien
//0912313111
//2
//Xay dung website ban dien thoai truc tuyen
//Xay dung ung dung quan ly benh nhan Covid-19
//1
//1