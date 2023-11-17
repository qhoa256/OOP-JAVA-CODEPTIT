package J04018_SO_PHUC;

public class soPhuc {
    private int thuc, ao;

    public soPhuc(int thuc, int ao) {
        this.thuc = thuc;
        this.ao = ao;
    }

    public soPhuc add(soPhuc a) {
        int x = this.thuc + a.thuc;
        int y = this.ao + a.ao;
        soPhuc res = new soPhuc(x, y);
        return res;
    }

    public soPhuc mul(soPhuc a) {
        int x = this.thuc * a.thuc - this.ao * a.ao;
        int y = this.thuc * a.ao + this.ao * a.thuc;
        soPhuc res = new soPhuc(x, y);
        return res;
    }

    public String toString() {
        String res = "";
        res += this.thuc + " ";
        if (this.ao < 0) {
            res += "- " + Math.abs(this.ao) + "i";
        } else {
            res += "+ " + Math.abs(this.ao) + "i";
        }
        return res;
    }
}
