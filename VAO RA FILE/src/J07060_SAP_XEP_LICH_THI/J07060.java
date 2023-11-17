package J07060_SAP_XEP_LICH_THI;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class J07060 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MONTHI.in"));
        HashMap<String, String> map = new HashMap<>();
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            String s3 = sc.nextLine();
            map.put(s1, s2);
        }
        sc = new Scanner(new File("CATHI.in"));
        ArrayList<caThi> ct = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            caThi x = new caThi("C" + String.format("%03d", i + 1), sc.nextLine(), sc.nextLine(), sc.nextLine());
            ct.add(x);
        }
        sc = new Scanner(new File("LICHTHI.in"));
        int m = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < m; i++) {
            String s = sc.nextLine();
            String[] x = s.split("\\s+");
            String mct = x[0];
            String mm = x[1];
            for (int j = 0; j < ct.size(); j++) {
                if (ct.get(j).getMaCaThi().equals(mct)) {
                    ct.get(j).setMonThi(map.get(mm));
                    ct.get(j).setNhomThi(x[2]);
                    ct.get(j).setSoLuong(Integer.parseInt(x[3]));
                    break;
                }
            }
        }
        Collections.sort(ct, new Comparator<caThi>() {
            @Override
            public int compare(caThi o1, caThi o2) {
                if (o1.getNgayThi().compareTo(o2.getNgayThi()) != 0) {
                    return o1.getNgayThi().compareTo(o2.getNgayThi());
                } else {
                    return o1.getGioThi().compareTo(o2.getGioThi());
                }
            }
        });
        for (caThi x : ct) {
            System.out.println(x);
        }
    }
}
