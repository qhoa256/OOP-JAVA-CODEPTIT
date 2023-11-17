package TO_CHUC_ICPC_QUOC_GIA;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("INSTITUTION.in"));
        HashMap<String, Integer> mp1 = new HashMap<>();
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<truongDH> tdh = new ArrayList<>();
        for (int j = 0; j < t; j++) {
            String[] s = (sc.nextLine()).split("\\s+");
            StringBuilder tenTruong = new StringBuilder("");
            String maTruong = s[0];
            for (int i = 1; i < s.length; i++) {
                tenTruong.append(s[i]);
                if (i != s.length - 1) {
                    tenTruong.append(" ");
                }
            }
            truongDH x = new truongDH(maTruong, tenTruong.toString());
            tdh.add(x);
            mp1.put(maTruong, j);
        }
        sc = new Scanner(new File("REGISTER.in"));
        int k = Integer.parseInt(sc.nextLine());
        while (k-- > 0) {
            String[] tmp = (sc.nextLine()).split("\\s+");
            String id = tmp[0];
            int stt = mp1.get(id);
            int sl = Integer.parseInt(tmp[1]);
            ArrayList<String> dt = new ArrayList<>();
            for (int j = 0; j < sl; j++) {
                String name = sc.nextLine();
                dt.add(name);
            }
            tdh.get(stt).setDoiThi(dt);
        }
        Collections.sort(tdh, new Comparator<truongDH>() {
            @Override
            public int compare(truongDH o1, truongDH o2) {
                return o1.getTenTruong().compareTo(o2.getTenTruong());
            }
        });
        int h = 1;
        for (truongDH x : tdh) {
            x.sapXep();
            for (int j = 0; j < x.getDoiThi().size(); j++) {
                System.out.println("team" + String.format("%02d", h) + " " + x.getDoiThi().get(j) + " " + x.getTenTruong());
                h++;
            }
        }
    }
}
