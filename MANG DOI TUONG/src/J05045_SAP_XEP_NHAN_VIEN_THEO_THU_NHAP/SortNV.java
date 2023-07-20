package J05045_SAP_XEP_NHAN_VIEN_THEO_THU_NHAP;

import java.util.Comparator;

public class SortNV implements Comparator<nhanVien> {
    public int compare(nhanVien a, nhanVien b){
        if(a.thuNhap()!=b.thuNhap()){
            if(a.thuNhap()<b.thuNhap()){
                return 1;
            }else{
                return -1;
            }
        }else{
            return a.getMaNV().compareTo(b.getMaNV());
        }
    }
}
