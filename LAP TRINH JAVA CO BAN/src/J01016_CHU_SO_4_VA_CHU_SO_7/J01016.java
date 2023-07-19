package J01016_CHU_SO_4_VA_CHU_SO_7;

import java.util.Scanner;

public class J01016 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = 0;
        String s = sc.nextLine();
        for (char x : s.toCharArray()) {
            if (x == '7' || x == '4') {
                cnt++;
            }
        }
        if (cnt == 4 || cnt == 7) System.out.println("YES");
        else System.out.println("NO");
    }
}
