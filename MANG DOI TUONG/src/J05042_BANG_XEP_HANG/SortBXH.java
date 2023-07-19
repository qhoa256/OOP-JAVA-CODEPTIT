package J05042_BANG_XEP_HANG;

import java.util.Comparator;

public class SortBXH implements Comparator<bangXH> {
    public int compare(bangXH a, bangXH b) {
        if (a.getAC() != b.getAC()) {
            return b.getAC() - a.getAC();
        } else {
            if (a.getSubmit() != b.getSubmit()) {
                return a.getSubmit() - b.getSubmit();
            } else {
                return a.getName().compareTo(b.getName());
            }
        }
    }
}
