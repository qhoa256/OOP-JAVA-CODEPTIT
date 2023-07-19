package J05005_DANH_SACH_DOI_TUONG_SINH_VIEN_3;

import java.util.Comparator;

public class SortGpa implements Comparator<sinhVien> {
    public int compare(sinhVien a, sinhVien b){
        if(a.getGpa()<b.getGpa()) return 1;
        else return -1;
    }
}
