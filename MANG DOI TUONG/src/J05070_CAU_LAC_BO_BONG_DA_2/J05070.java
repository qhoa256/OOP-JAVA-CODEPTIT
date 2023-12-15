package J05070_CAU_LAC_BO_BONG_DA_2;

import java.util.*;

public class J05070 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<CLB> clb = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < t; i++) {
            String id = sc.nextLine();
            CLB x = new CLB(id, sc.nextLine(), Integer.parseInt(sc.nextLine()));
            map.put(id, i);
            clb.add(x);
        }
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            String[] x = (sc.nextLine()).split("\\s+");
            String maCLB = x[0].substring(1, 3);
            int soLuong = Integer.parseInt(x[1]);
            for (int j = 0; j < t; j++) {
                int pos = map.get(maCLB);
                if (clb.get(pos).getMaCLB().equals(maCLB)) {
                    clb.get(pos).setSoLuong(soLuong);
                    clb.get(pos).setMaTran(x[0]);
                    break;
                }
            }
        }
        Collections.sort(clb, new Comparator<CLB>() {
            @Override
            public int compare(CLB o1, CLB o2) {
                if (o1.tongTien() != o2.tongTien()) {
                    return o2.tongTien() - o1.tongTien();
                } else {
                    return o1.getTenCLB().compareTo(o2.getTenCLB());
                }
            }
        });
        for (CLB x : clb) {
            System.out.println(x);
        }
    }
}


//2
//AC
//AC Milan
//12
//MU
//Manchester United
//10
//2
//IAC1 80000
//EMU2 60000