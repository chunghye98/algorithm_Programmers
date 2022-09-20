package lv1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumOfK {
    public List<Integer> solution(int[] array, int[][] commands) {
        int[] a = {};
        List<Integer> list = new ArrayList<>();

        int min = 0;
        int max = 0;
        int index = 0;

        for (int i = 0; i < commands.length; i++) {
            min = commands[i][0] - 1;
            max = commands[i][1] - 1;
            index = commands[i][2] - 1;
            a = new int[max-min+1];
            int[] arr = createArr(min, max, a, array);
            list.add(arr[index]);
        }
        return list;
    }

    private int[] createArr(int min, int max, int[] a, int[] array) {
        for (int i = min; i <= max; i++) {
            a[i-min] = array[i];
        }
        Arrays.sort(a);
        return a;
    }
}
