package J07035_BANG_DIEM_THEO_MON_HOC;

import java.util.ArrayList;
import java.util.Scanner;

public class bangDiem implements Comparable<bangDiem> {
    private double diem;
    private sinhVien sv;
    private monHoc mh;

    public bangDiem(String tmp, ArrayList<sinhVien> dsSV, ArrayList<monHoc> dsMH) {
        String []s = tmp.trim().split("\\s+");
        String maSV = s[0];
        String maMH = s[1];
        this.diem = Double.parseDouble(s[2]);
        for (sinhVien x : dsSV) {
            if (x.getMaSV().contains(maSV)) {
                this.sv = x;
                break;
            }
        }
        for (monHoc x : dsMH) {
            if (x.getMaMon().contains(maMH)) {
                this.mh = x;
                break;
            }
        }
    }

    public monHoc getMh() {
        return mh;
    }

    @Override
    public String toString() {
        String diem = String.format("%.1f", this.diem);
        if (this.diem == (int) this.diem) diem = String.format("%.0f", this.diem);
        return this.sv.getMaSV() + ' ' + this.sv.getHoTen() + ' ' + this.sv.getLop() + ' ' + diem;
    }

    @Override
    public int compareTo(bangDiem bd) {
        if (this.diem < bd.diem) return 1;
        if (this.diem > bd.diem) return -1;
        return this.sv.getMaSV().compareTo(bd.sv.getMaSV());
    }
}
