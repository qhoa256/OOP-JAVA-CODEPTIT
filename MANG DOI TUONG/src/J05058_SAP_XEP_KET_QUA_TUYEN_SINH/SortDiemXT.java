package J05058_SAP_XEP_KET_QUA_TUYEN_SINH;

import java.util.Comparator;

public class SortDiemXT implements Comparator<thiSinh> {
    public int compare(thiSinh a, thiSinh b) {
        if (a.diemXT() != b.diemXT()) {
            if (a.diemXT() < b.diemXT()) {
                return 1;
            } else {
                return -1;
            }
        } else {
            return a.getMaThiSinh().compareTo(b.getMaThiSinh());
        }
    }
}
