package J05033_SAP_XEP_THOI_GIAN;

import java.util.Comparator;

public class SortTime implements Comparator<Time> {
    public int compare(Time t1, Time t2) {
        if (t1.getGio() != t2.getGio()) {
            if (t1.getGio() < t2.getGio())
                return -1;
            else return 1;
        } else {
            if (t1.getPhut() != t2.getPhut()) {
                if (t1.getPhut() < t2.getPhut()) {
                    return -1;
                } else return 1;
            } else {
                if (t1.getGiay() != t2.getGiay()) {
                    if (t1.getGiay() < t2.getGiay()) {
                        return -1;
                    } else {
                        return 1;
                    }
                }
            }
        }
        return -1;
    }
}
