package J05010_SAP_XEP_DANH_SACH_MAT_HANG;

import java.util.Comparator;

public class SortMH implements Comparator<matHang> {
    public int compare(matHang mh1, matHang mh2){
        if(mh1.loiNhuan()<mh2.loiNhuan()){
            return 1;
        }else return -1;
    }
}
