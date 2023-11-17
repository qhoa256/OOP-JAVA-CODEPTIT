package J07045_LOAI_PHONG;

public class LoaiPhong implements Comparable<LoaiPhong>{
    private String kyHieu, tenPhong;
    private int donGia;
    private double phiPV;

    public LoaiPhong(String s) {
        String []x = s.trim().split("\\s+");
        this.kyHieu = x[0];
        this.tenPhong = x[1];
        this.donGia = Integer.parseInt(x[2]);
        this.phiPV = Double.parseDouble(x[3]);
    }

    @Override
    public int compareTo(LoaiPhong o) {
        return this.tenPhong.compareTo(o.tenPhong);
    }

    public String toString(){
        return this.kyHieu+" "+this.tenPhong+" "+this.donGia+" "+this.phiPV;
    }
}
