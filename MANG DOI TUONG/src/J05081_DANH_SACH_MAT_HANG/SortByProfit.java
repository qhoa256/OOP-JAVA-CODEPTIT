package J05081_DANH_SACH_MAT_HANG;

import java.util.Comparator;

public class SortByProfit implements Comparator<matHang> {
    public int compare(matHang mh1, matHang mh2) {
        if (mh1.profit() != mh2.profit()) {
            if (mh1.profit() < mh2.profit())
                return 1;
            else return -1;
        }else{
            return mh1.getMaMH().compareTo(mh2.getMaMH());
        }
    }
}
