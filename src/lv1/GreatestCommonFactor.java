package lv1;

import java.util.ArrayList;
import java.util.List;

public class GreatestCommonFactor {
    public int[] solution(int n, int m) {
        int[] answer = {};
        int divisor = 0;
        int multiple = 0;
        List<Integer> divisorList = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) divisorList.add(i);
        }

        for (int i = 1; i <= m; i++) {
            for (int j = 0; j < divisorList.size(); j++) {
                if (m % i == 0 && i == divisorList.get(j))
                    divisor = i;
            }
        }

        multiple = n * m / divisor;

        answer = new int[]{divisor, multiple};

        return answer;
    }
}
