package lv1;

public class SumInt {
    public long solution(int a, int b) {
        long answer = 0;
        if (a > b) answer = func(b, a);
        else if (a < b) answer = func(a, b);
        else answer = a;
        return answer;
    }
    private long func(int a, int b) {
        long sum = 0;
        for (long i = a; i <= b; i++)
            sum += i;
        return sum;
    }
}
