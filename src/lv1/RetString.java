package lv1;

public class RetString {
    public String solution(int n) {
        String answer = "";
        String s = "수";
        String b = "박";

        if (n == 1) answer = s;
        for(int i=0; i<n; i++)
            answer = n % 2 == 0 ? (s + b).repeat((i+1)/2) : (s + b).repeat((i+1)/2) + s;
        return answer;
    }
}
