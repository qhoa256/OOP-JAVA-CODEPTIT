package J03017_LOAI_BO_100;

import java.util.Scanner;

public class J03017 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- >0){
            String s = sc.nextLine();
            String tmp = "100";
            int res = 0;
            while(s.contains(tmp)){
                s = s.replace(tmp, "");
                res += 3;
            }
            System.out.println(res);
        }
    }
}

//2
//010010
//1011110000