package J04020_LOP_PAIR;

public class Pair<T1, T2> {
    public static boolean prime(int x) {
        for (int i = 2; i <= (int) Math.sqrt(x); i++) {
            if (x % i == 0)
                return false;
        }
        return x > 1;
    }

    private T1 first;
    private T2 second;

    public Pair(T1 first, T2 second) {
        this.first = first;
        this.second = second;
    }

    public boolean isPrime() {
        if (prime((Integer) this.first) && prime((Integer) this.second))
            return true;
        else
            return false;
    }

    public String toString() {
        return this.first + " " + this.second;
    }
}
