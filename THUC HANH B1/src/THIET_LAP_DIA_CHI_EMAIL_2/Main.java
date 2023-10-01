package THIET_LAP_DIA_CHI_EMAIL_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static String getEmail(String[] words) {
        String email = words[words.length - 1];
        for (int i = 0; i < words.length - 1; i++) {
            email += words[i].charAt(0);
        }
        return email;
    }

    public static String getName(String[] words) {
        String name = "";
        for (String x : words) {
            name += x + " ";
        }
        return name;
    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DANHSACH.in"));
        Map<String, Integer> mName = new HashMap<>();
        Map<String, Integer> mEmail = new HashMap<>();

        while (sc.hasNextLine()) {
            String[] words = sc.nextLine().trim().toLowerCase().split("\\s+");
            String name = getName(words);
            String email = getEmail(words);
            if (!mName.containsKey(name)) {
                mName.put(name, 1);
                int stt;
                if (mEmail.containsKey(email)) {
                    stt = mEmail.get(email) + 1;
                } else {
                    stt = 1;
                }
                mEmail.put(email, stt);
                if (stt > 1) email += "" + stt;
                System.out.println(email + "@ptit.edu.vn");
            }
        }
    }
}
