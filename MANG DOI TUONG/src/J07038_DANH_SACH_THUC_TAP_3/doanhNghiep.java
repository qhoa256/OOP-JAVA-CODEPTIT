package J07038_DANH_SACH_THUC_TAP_3;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class doanhNghiep {
    private String maDN, tenDN;
    private int soLuong;

    public doanhNghiep(String maDN, String tenDN, int soLuong) {
        this.maDN = maDN;
        this.tenDN = tenDN;
        this.soLuong = soLuong;
    }

    public int getSoLuong() {
        return soLuong;
    }
}
