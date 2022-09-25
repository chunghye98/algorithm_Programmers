package lv1;

public class CalculateAmount {
    public long solution(int price, long money, int count) {
        long answer = 0;
        for (int i = 1; i <= count; i++)
            answer += price * i;
        answer = answer - money;
        if(answer < 0) answer =  0;
        return answer;
    }
}