package J01026_SO_CHINH_PHUONG;

import java.util.Scanner;

public class J01026 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            int n = sc.nextInt();
            int x = (int)Math.sqrt(n);
            if(x * x == n){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
