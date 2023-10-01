package DANH_SACH_LIEN_LAC;

import java.util.Comparator;

public class sortNV implements Comparator<sinhVien> {
    public int compare(sinhVien a, sinhVien b){
        if(a.getLop().compareTo(b.getLop())!=0){
            return a.getLop().compareTo(b.getLop());
        }else{
            return a.getMaSV().compareTo(b.getMaSV());
        }
    }
}
