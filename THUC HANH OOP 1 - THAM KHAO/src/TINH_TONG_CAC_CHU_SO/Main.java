package TINH_TONG_CAC_CHU_SO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            String s = sc.next();
            ArrayList<Character> a = new ArrayList<>();
            int sum = 0;
            for(char x: s.toCharArray()){
                if(Character.isAlphabetic(x)){
                    a.add(x);
                }else{
                    sum += (x - '0');
                }
            }
            Collections.sort(a);
            for(char x:a){
                System.out.print(x);
            }
            System.out.println(sum);
        }
    }
}
