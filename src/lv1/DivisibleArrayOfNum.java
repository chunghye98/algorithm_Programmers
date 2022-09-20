package lv1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DivisibleArrayOfNum {
    public List<Integer> solution(int[] arr, int divisor) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                list.add(arr[i]);
                Collections.sort(list);
            }
        }
        if(list.isEmpty()) list.add(-1);

        return list;
    }
}
