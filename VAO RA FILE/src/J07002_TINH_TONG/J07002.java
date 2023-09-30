package J07002_TINH_TONG;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class J07002 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        long s = 0;
        while(sc.hasNext()){
            try{
                int t = Integer.parseInt(sc.next());
                s += t;
            } catch(NumberFormatException e){

            }
        }
        System.out.println(s);
    }
}
