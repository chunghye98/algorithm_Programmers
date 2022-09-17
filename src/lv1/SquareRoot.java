package lv1;

public class SquareRoot {
    public long solution(long n) {
        double root = Math.sqrt(n);
        if ((long) root == root) {
            return (long) ((root + 1) * (root + 1));
        } else {
            return -1;
        }
    }
}
