package CHU_SO_NGUYEN_TO;

import java.util.*;

public class Main {
    public static int n;
    public static ArrayList<String> a = new ArrayList<>();

    public static boolean check(String s) {
        if (Integer.parseInt(s) % 2 == 0) return false;
        int cnt2 = 0, cnt3 = 0, cnt5 = 0, cnt7 = 0;
        for (char c : s.toCharArray()) {
            if (c == '2') cnt2++;
            else if (c == '3') cnt3++;
            else if (c == '5') cnt5++;
            else if (c == '7') cnt7++;
        }
        return cnt2 > 0 && cnt3 > 0 && cnt5 > 0 && cnt7 > 0;
    }

    public static void Try(String s) {
        if (s.length() >= 4 && check(s)) {
            a.add(s);
        }
        if (s.length() < n) {
            Try(s + "2");
            Try(s + "3");
            Try(s + "5");
            Try(s + "7");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        Try("");
        Collections.sort(a, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() != o2.length()) {
                    return o1.length() - o2.length();
                }
                return o1.compareTo(o2);
            }
        });
        for (String x : a) {
            System.out.println(x);
        }
    }
}
