package J03016_CHIA_HET_CHO_11;

import java.math.BigInteger;
import java.util.Scanner;

public class J03016 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
            BigInteger x = new BigInteger(sc.nextLine());
            BigInteger y = new BigInteger("11");
            BigInteger res = x.mod(y);
            if(res.toString().compareTo("0")==0){
                System.out.println("1");
            }else{
                System.out.println("0");
            }
        }
    }
}
