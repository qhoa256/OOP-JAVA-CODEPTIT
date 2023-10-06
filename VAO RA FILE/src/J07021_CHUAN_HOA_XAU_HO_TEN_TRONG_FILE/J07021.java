package J07021_CHUAN_HOA_XAU_HO_TEN_TRONG_FILE;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class J07021 {
    public static String chuanHoa(String s) {
        return Character.toUpperCase(s.charAt(0)) + s.substring(1).toLowerCase();
    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        while (true) {
            String s = sc.nextLine();
            if (s.compareTo("END") == 0) break;
            String[] res = s.trim().split("\\s+");
            String ans = "";
            for (String x : res) {
                ans += chuanHoa(x) + " ";
            }
            System.out.println(ans.trim());
        }
    }
}
