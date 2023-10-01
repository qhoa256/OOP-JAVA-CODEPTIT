package KIEM_TRA_CHIA_HET;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        BigInteger seven = new BigInteger("7");
        BigInteger thirteen = new BigInteger("13");
        while (t-- > 0) {
            BigInteger x = sc.nextBigInteger();
            if(x.mod(seven).toString().compareTo("0")==0 && x.mod(thirteen).toString().compareTo("0")==0){
                System.out.println("Both");
            }else if(x.mod(seven).toString().compareTo("0")==0){
                System.out.println("Div 7");
            }else if(x.mod(thirteen).toString().compareTo("0")==0){
                System.out.println("Div 13");
            }else{
                System.out.println("None");
            }
        }
    }
}
