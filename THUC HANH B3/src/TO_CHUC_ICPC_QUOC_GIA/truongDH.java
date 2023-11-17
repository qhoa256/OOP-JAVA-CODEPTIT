package TO_CHUC_ICPC_QUOC_GIA;

import java.util.ArrayList;
import java.util.Collections;

public class truongDH {
    private  String maTruong, tenTruong;
    private ArrayList<String> doiThi = new ArrayList<>();
    public truongDH(String maTruong, String tenTruong) {
        this.maTruong = maTruong;
        this.tenTruong = tenTruong;
    }

    public void sapXep(){
        Collections.sort(doiThi);
    }

    public void setDoiThi(ArrayList<String> doiThi) {
        this.doiThi = doiThi;
    }

    public String getTenTruong() {
        return tenTruong;
    }

    public ArrayList<String> getDoiThi() {
        return doiThi;
    }
}
