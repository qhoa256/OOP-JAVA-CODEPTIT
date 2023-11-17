package J05011_TINH_GIO;

import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class gameThu {
    private String ma, hoTen, gioVao, gioRa;

    public gameThu(String ma, String hoTen, String gioVao, String gioRa) {
        this.ma = ma;
        this.hoTen = hoTen;
        this.gioVao = gioVao;
        this.gioRa = gioRa;
    }

    public long soPhut(){
        LocalTime x = LocalTime.parse(gioVao, DateTimeFormatter.ofPattern("HH:mm"));
        LocalTime y = LocalTime.parse(gioRa, DateTimeFormatter.ofPattern("HH:mm"));
        return Duration.between(x, y).toMinutes();
    }

    public String thoiGian(){
        long m = soPhut();
        long gio = m / 60;
        long phut = m - gio * 60;
        return gio + " gio " + phut + " phut";
    }

    public String toString(){
        return this.ma + " " + this.hoTen + " " + thoiGian();
    }
}
