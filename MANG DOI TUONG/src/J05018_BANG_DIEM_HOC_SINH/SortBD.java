package J05018_BANG_DIEM_HOC_SINH;

import java.util.Comparator;

public class SortBD implements Comparator<bangDiem> {
    public int compare(bangDiem bd1, bangDiem bd2) {
        if (bd1.diemTB() != bd2.diemTB()) {
            if (bd1.diemTB() < bd2.diemTB()) return 1;
            else return -1;
        } else {
            return bd1.getId().compareTo(bd2.getId());
        }
    }
}
