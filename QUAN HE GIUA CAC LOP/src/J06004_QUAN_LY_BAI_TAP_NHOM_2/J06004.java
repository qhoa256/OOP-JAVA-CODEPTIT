package J06004_QUAN_LY_BAI_TAP_NHOM_2;

import java.util.*;

public class J06004 {
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
        for (int i = 1; i <= m; i++) {
            String btap = sc.nextLine();
            for (SinhVien h : sv) {
                if (h.getStt().equals(i + "")) {
                    h.setBaiTapNhom(btap);
                }
            }
        }
        Collections.sort(sv, new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                return o1.getMaSV().compareTo(o2.getMaSV());
            }
        });
        for (SinhVien qh : sv) {
            System.out.println(qh);
        }
    }
}
