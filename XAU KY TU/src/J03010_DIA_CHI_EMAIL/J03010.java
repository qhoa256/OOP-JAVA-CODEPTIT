package J03010_DIA_CHI_EMAIL;

import java.util.Scanner;

public class J03010 {
    public static String chuanHoa(String s) {
        s = s.trim().toLowerCase();
        String []a = s.split("\\s+");
        String res = a[a.length - 1];
        for (int i = 0; i < a.length - 1; i++)
            res += a[i].charAt(0);
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        String[] res = new String[t + 1];
        for (int test = 0; test < t; test++) {
            String s = sc.nextLine();
            s = chuanHoa(s);
            int cnt = 1;
            for (int i = 0; i < test; i++)
                if (s.contentEquals(res[i])) cnt++;
            res[test] = s;
            String tmp = "";
            if (cnt > 1) tmp += cnt;
            System.out.println(s + tmp + "@ptit.edu.vn");
        }
        sc.close();
    }
}
