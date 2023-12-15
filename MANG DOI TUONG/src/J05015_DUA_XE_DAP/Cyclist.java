package J05015_DUA_XE_DAP;

import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Cyclist {
    private String hoTen, diaDiem, denDich;

    public Cyclist(String hoTen, String diaDiem, String denDich) {
        this.hoTen = hoTen;
        this.diaDiem = diaDiem;
        this.denDich = denDich;
    }

    public String getMa() {
        StringBuilder sb = new StringBuilder("");
        String[] y = diaDiem.trim().split("\\s+");
        for (int j = 0; j < y.length; j++) {
            sb.append(y[j].charAt(0));
        }
        String[] x = hoTen.trim().split("\\s+");
        for (int i = 0; i < x.length; i++) {
            sb.append(x[i].charAt(0));
        }
        return sb.toString();
    }

    public long vanToc() {
        String[] x = this.denDich.trim().split(":");
        double res = Double.parseDouble(x[0]) + Double.parseDouble(x[1]) / 60.0 - 6.0;
        return Math.round(120.0 / res);
    }

    public double thoiGian(){
        String[] x = this.denDich.trim().split(":");
        return Double.parseDouble(x[0]) + Double.parseDouble(x[1]) / 60.0 - 6.0;
    }
    public String toString() {
        return getMa() + " " + this.hoTen + " " + this.diaDiem + " " + vanToc() + " Km/h";
    }
}
