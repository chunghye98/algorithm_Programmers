package lv1;

import java.util.ArrayList;
import java.util.List;

public class NumSpacedByX {
    public List<Long> solution(int x, int n) {
        List<Long> list = new ArrayList<>();
        long i = 1;
        while(list.size() != n) {
            list.add(x * i);
            i++;
        }
        return list;
    }
}
