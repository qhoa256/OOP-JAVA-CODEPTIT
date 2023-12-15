package J04014_TINH_TOAN_PHAN_SO;

public class PhanSo {
    private long tuSo, mauSo;

    public PhanSo(long tuSo, long mauSo) {
        this.tuSo = tuSo;
        this.mauSo = mauSo;
    }

    public long gcd(long a, long b) {
        if (b == 0) return a;
        else return gcd(b, a % b);
    }

    public long lcm(long a, long b){
        return a / gcd(a, b) * b;
    }

    public void rutGon(){
        long mc = gcd(this.tuSo, this.mauSo);
        this.tuSo /= mc;
        this.mauSo /= mc;
        if(this.mauSo < 0){
            this.mauSo = Math.abs(this.mauSo);
            this.tuSo *= -1;
        }
    }

    public PhanSo phepTinhC(PhanSo b){
        long CTu = this.tuSo * b.mauSo + b.tuSo * this.mauSo;
        long CMau = this.mauSo * b.mauSo;
        CTu *= CTu;
        CMau *= CMau;
        PhanSo res = new PhanSo(CTu, CMau);
        res.rutGon();
        return res;
    }

    public PhanSo phepTinhD(PhanSo b, PhanSo c){
        long DTu = this.tuSo * b.tuSo * c.tuSo;
        long DMau = this.mauSo * b.mauSo * c.mauSo;
        PhanSo res = new PhanSo(DTu, DMau);
        res.rutGon();
        return res;
    }

    public String toString(){
        return this.tuSo + "/" + this.mauSo;
    }
}
