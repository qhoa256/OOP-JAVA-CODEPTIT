package J05033_SAP_XEP_THOI_GIAN;

public class Time {
    int gio, phut, giay;

    public Time() {
    }

    public Time(int gio, int phut, int giay) {
        this.gio = gio;
        this.phut = phut;
        this.giay = giay;
    }

    public int getGio() {
        return gio;
    }

    public int getPhut() {
        return phut;
    }

    public int getGiay() {
        return giay;
    }

    public String toString() {
        return gio + " " + phut + " " + giay;
    }
}
