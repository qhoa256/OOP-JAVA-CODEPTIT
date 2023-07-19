package J04012_BAI_TOAN_TINH_CONG;

import java.util.Scanner;

public class J04012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String hoTen = sc.nextLine();
        int luongCB = sc.nextInt();
        int ngayCong = sc.nextInt();
        sc.nextLine();
        String chucVu = sc.nextLine();
        System.out.println(new nhanVien("NV01", hoTen, luongCB, ngayCong, chucVu));
    }
}
