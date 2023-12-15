package J07051_TINH_TIEN_PHONG;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class KhachHang {
    private String maKH, hoTen, soPhong;
    Date ngayDen, ngayDi;
    private long dichVu;

    public KhachHang(String maKH, String hoTen, String soPhong, String ngayDen, String ngayDi, long dichVu) throws ParseException {
        this.maKH = maKH;
        this.hoTen = hoTen;
        chuanHoa();
        this.soPhong = soPhong.trim();
        this.ngayDen = new SimpleDateFormat("dd/MM/yyyy").parse(ngayDen);
        this.ngayDi = new SimpleDateFormat("dd/MM/yyyy").parse(ngayDi);
        this.dichVu = dichVu;
    }

    public long soNgay() throws ParseException {
        long timeDiff = this.ngayDi.getTime() - this.ngayDen.getTime();
        return timeDiff / (1000 * 60 * 60 * 24) + 1;
    }

    public long tongTien() throws ParseException {
        String x = this.soPhong.substring(0, 1);
        if (x.equals("1")) {
            return soNgay() * (long) 25 + (long) this.dichVu;
        } else if (x.equals("2")) {
            return soNgay() * (long) 34 + (long) this.dichVu;
        } else if (x.equals("3")) {
            return soNgay() * (long) 50 + (long) this.dichVu;
        } else {
            return soNgay() * (long) 80 + (long) this.dichVu;
        }
    }

    public void chuanHoa() {
        String[] x = this.hoTen.trim().split("\\s+");
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < x.length; i++) {
            sb.append(Character.toUpperCase(x[i].charAt(0)));
            for (int j = 1; j < x[i].length(); j++) {
                sb.append(Character.toLowerCase(x[i].charAt(j)));
            }
            if (i != x.length - 1) {
                sb.append(" ");
            }
        }
        this.hoTen = sb.toString();
    }

    public String toString() {
        try {
            return this.maKH + " " + this.hoTen + " " + this.soPhong + " " + soNgay() + " " + tongTien();
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
