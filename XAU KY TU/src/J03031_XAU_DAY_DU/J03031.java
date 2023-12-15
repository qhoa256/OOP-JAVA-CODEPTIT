package J03031_XAU_DAY_DU;

import java.util.HashSet;
import java.util.Scanner;

public class J03031 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- >0){
            String s = sc.nextLine();
            HashSet<Character> set = new HashSet<>();
            for(char x:s.toCharArray()){
                set.add(x);
            }
            int k = Integer.parseInt(sc.nextLine());
            int res = s.length() - set.size();
            int num = 26 - set.size();
            if(num <= k && res >= k){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}

//2
//qwqqwqeqqwdsdadsdasadsfsdsdsdasasas
//4
//qwqqwqeqqwdsdadsdasadsfsdsdsdasasas
//24