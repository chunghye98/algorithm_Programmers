package lv1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Trit {
    public int solution(int n) {
        int answer = 0;
        List<Integer> list = new ArrayList<>();

        while (n > 0) {
            list.add(n % 3);
            n /= 3;
        }
        Collections.reverse(list);

        for (int i = 0; i < list.size(); i++)
            answer += list.get(i) * Math.pow(3, i);
        return answer;
    }
}
