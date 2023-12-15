package J05080_LOP_HOC_PHAN_2;

import java.util.*;

public class J05080 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<lopHoc> lh = new ArrayList<>();
        while (t-- > 0) {
            String idLop = sc.nextLine();
            String tenLop = sc.nextLine();
            lopHoc x = new lopHoc(idLop, tenLop, sc.nextLine(), sc.nextLine());
            lh.add(x);
        }
        Collections.sort(lh, new Comparator<lopHoc>() {
            @Override
            public int compare(lopHoc o1, lopHoc o2) {
                if (o1.getMaMon().compareTo(o2.getMaMon()) != 0) {
                    return o1.getMaMon().compareTo(o2.getMaMon());
                } else {
                    return o1.getNhomLop().compareTo(o2.getNhomLop());
                }
            }
        });
        int q = Integer.parseInt(sc.nextLine());
        while (q-- > 0) {
            String s = sc.nextLine().trim();
            System.out.println("Danh sach cho giang vien " + s + ":");
            for (lopHoc x : lh) {
                if (x.getGiangVien().equals(s)) {
                    System.out.println(x);
                }
            }
        }
    }
}
