package J03038_DANH_DAU_CHU_CAI;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class J03038 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Set<Character> set = new HashSet<>();
        for (char x : s.toCharArray()) {
            set.add(x);
        }
        System.out.println(set.size());
    }
}
