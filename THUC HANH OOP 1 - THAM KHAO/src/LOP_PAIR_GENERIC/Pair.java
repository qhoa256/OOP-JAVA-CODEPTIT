package LOP_PAIR_GENERIC;

public class Pair<T1, T2> {
    private T1 first;
    private T2 second;

    public Pair(T1 first, T2 second) {
        this.first = first;
        this.second = second;
    }

    private boolean isPrime(Integer n) {
        for (int i = 2; i <= Math.sqrt(n); i++)
            if (n % i == 0)
                return false;
        return n > 1;
    }

    public boolean isPrime() {
        return isPrime((Integer) this.first) && isPrime((Integer) this.second);
    }

    @Override
    public String toString() {
        return String.valueOf(this.first) + ' ' + String.valueOf(this.second);
    }
}
