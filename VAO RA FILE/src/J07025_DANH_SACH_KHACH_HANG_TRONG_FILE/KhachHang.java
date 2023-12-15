package J07025_DANH_SACH_KHACH_HANG_TRONG_FILE;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class KhachHang {
    private String maKH, hoTen, gioiTinh, diaChi;
    private Date ngaySinh;

    public KhachHang(String maKH, String hoTen, String gioiTinh, String ngaySinh, String diaChi) throws ParseException {
        this.maKH = maKH;
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = new SimpleDateFormat("dd/MM/yyyy").parse(ngaySinh);
        this.diaChi = diaChi;
        chuanHoa();
    }

    public String tuoi() {
        String tmp = new SimpleDateFormat("dd/MM/yyyy").format(this.ngaySinh);
        String[] x = tmp.split("/");
        StringBuilder sb = new StringBuilder("");
        sb.append(x[2]);
        sb.append(x[1]);
        sb.append(x[0]);
        return sb.toString();
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
        String ngaySinh = new SimpleDateFormat("dd/MM/yyyy").format(this.ngaySinh);
        return this.maKH + " " + this.hoTen + " " + this.gioiTinh + " " + this.diaChi + " " + ngaySinh;
    }
}
