package J05025_SAP_XEP_DANH_SACH_GIANG_VIEN;

import java.util.Comparator;

public class SortGV implements Comparator<giangVien> {
    public int compare(giangVien a, giangVien b) {
        if (a.getTen().compareTo(b.getTen()) != 0) {
            return a.getTen().compareTo(b.getTen());
        } else {
            return a.getMaGV().compareTo(b.getMaGV());
        }
    }
}
