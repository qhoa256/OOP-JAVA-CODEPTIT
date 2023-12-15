package J04022_WORDSET;

import java.util.Scanner;
import java.util.TreeSet;

public class WordSet {
    private String s;

    private TreeSet<String> set = new TreeSet<>();

    public WordSet(String s) {
        String[] x = s.trim().split("\\s+");
        for (String qhoa : x) {
            StringBuilder sb = new StringBuilder("");
            sb.append(Character.toLowerCase(qhoa.charAt(0)));
            for (int i = 1; i < qhoa.length(); i++) {
                sb.append(Character.toLowerCase(qhoa.charAt(i)));
            }
            set.add(sb.toString());
        }
        this.s = s;
    }

    public WordSet union(WordSet b) {
        TreeSet<String> res = new TreeSet<>();
        StringBuilder sb = new StringBuilder("");
        for (String x : this.set) {
            res.add(x);
        }
        for (String x : b.set) {
            res.add(x);
        }
        for (String x : res) {
            sb.append(x);
            sb.append(" ");
        }
        return new WordSet(sb.toString());
    }

    public WordSet intersection(WordSet b) {
        TreeSet<String> res = new TreeSet<>();
        StringBuilder sb = new StringBuilder("");
        for (String x : this.set) {
            if (b.set.contains(x)) {
                res.add(x);
            }
        }
        for (String x : res) {
            sb.append(x);
            sb.append(" ");
        }
        return new WordSet(sb.toString());
    }

    public String toString() {
        return this.s;
    }
}
