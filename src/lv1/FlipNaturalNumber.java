package lv1;

import java.util.ArrayList;
import java.util.List;

public class FlipNaturalNumber {
    public List<Integer> solution(long n) {
        String str = Long.toString(n);
        char[] chars = str.toCharArray();
        List<Integer> answer = new ArrayList<>();

        for (int i = chars.length-1; i >= 0; i--) {
            answer.add((int) chars[i]-'0');
        }
        return answer;
    }
}
