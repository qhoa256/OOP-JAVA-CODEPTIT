package TAP_TU_KHAC_NHAU;

import java.util.TreeSet;

public class WordSet {
    private TreeSet<String> set;

    public WordSet(String s) {
        this.set = new TreeSet<>();
        String[] a = s.trim().toLowerCase().split("\\s+");
        for (String x : a) {
            this.set.add(x);
        }
    }

    public WordSet union(WordSet b) {
        WordSet res = new WordSet("");
        for (String x : this.set) {
            res.set.add(x);
        }
        for (String x : b.set) {
            res.set.add(x);
        }
        return res;
    }

    public WordSet intersection(WordSet b) {
        WordSet res = new WordSet("");
        for (String x : this.set) {
            if (b.set.contains(x)) {
                res.set.add(x);
            }
        }
        return res;
    }

    public String toString() {
        String res = "";
        for (String x : set) {
            res += x + " ";
        }
        return res.trim();
    }
}
