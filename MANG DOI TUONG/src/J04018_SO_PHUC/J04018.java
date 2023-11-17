package J04018_SO_PHUC;

import java.util.Scanner;

public class J04018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            soPhuc a = new soPhuc(sc.nextInt(), sc.nextInt());
            soPhuc b = new soPhuc(sc.nextInt(), sc.nextInt());
            soPhuc c = (a.add(b)).mul(a);
            soPhuc d = (a.add(b)).mul(a.add(b));
            System.out.println(c + ", " + d);
        }
    }
}

//3
//1 2 3 4
//2 3 4 5
//1 -2 5 -6
