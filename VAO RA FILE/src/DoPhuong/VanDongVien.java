package DoPhuong;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class VanDongVien {
    private String ma, name;
    private String ngaySinh;
    private Date time1, time2;
    private long soGiay;
    private String thucTe, uuTien, mien;
    private int xepHang;
    public VanDongVien(int i,String name, String ngaySinh, Date time1, Date time2) {
        this.ma = "VDV" + String.format("%02d", i);
        this.name = name;
        this.ngaySinh = ngaySinh;
        this.time1 = time1;
        this.time2 = time2;
        long tmp = time2.getTime() - time1.getTime();
        soGiay = TimeUnit.SECONDS.convert(tmp, TimeUnit.MILLISECONDS);

        //System.out.println(soGiay);
        thucTe = setThoiGian(soGiay);
        int tuoi = 2021 - Integer.parseInt(ngaySinh.substring(6));
        int temp = setTime(tuoi);
        uuTien = setThoiGian(soGiay - temp);
        soGiay = soGiay - temp;
        mien = "00:00:0" + temp;
    }

    private int setTime(int a)
    {
        if(a >= 32) return 3;
        else if(a >= 25) return 2;
        else if(a >= 18) return 1;
        return 0;
    }

    private String setThoiGian(long a)
    {
        long gio = a / 3600;
        long phut = (a % 3600) / 60;
        long giay = a - gio * 3600 - phut * 60;
        //System.out.println("" + gio + " " +  phut  + " "+ giay);
        return String.format("%02d:%02d:%02d", gio, phut, giay);
    }

    public long getSoGiay() {
        return soGiay;
    }

    public int getXepHang() {
        return xepHang;
    }

    public void setXepHang(int xepHang) {
        this.xepHang = xepHang;
    }

    public String getUuTien() {
        return uuTien;
    }

    public String getMa() {
        return ma;
    }

    public String toString()
    {
        return ma + " " + name + " " + thucTe + " " + mien + " " + uuTien + " " + xepHang;
    }
}
