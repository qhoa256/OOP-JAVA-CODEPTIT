package DANH_SACH_CANH_SU_DUNG_LOP_PAIR_GENERIC;

public class Pair<T1, T2> {
    private T1 first;
    private T2 second;

    public Pair(T1 first, T2 second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public String toString() {
        return '(' + String.valueOf(this.first) + ',' + String.valueOf(this.second) + ')';
    }
}
