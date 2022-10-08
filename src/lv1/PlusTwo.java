package lv1;

import java.util.*;

public class PlusTwo {
    public Integer[] solution(int[] numbers) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                int sum = numbers[i] + numbers[j];
                list.add(sum);
            }
        }
        Set<Integer> set = new HashSet<>(list);
        List<Integer> newList = new ArrayList<>(set);
        Collections.sort(newList);
        return newList.toArray(new Integer[0]);
    }
}
