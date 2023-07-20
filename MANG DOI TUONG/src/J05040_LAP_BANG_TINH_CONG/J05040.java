package J05040_LAP_BANG_TINH_CONG;

import java.util.ArrayList;
import java.util.Scanner;

public class J05040 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<nhanVien> nv = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            sc.nextLine();
            nv.add(new nhanVien("NV" + String.format("%02d", i + 1), sc.nextLine(), sc.nextInt(), sc.nextInt(), sc.next()));
        }
        for (nhanVien x : nv) {
            System.out.println(x);
        }
    }
}
