package lv1;

import java.util.ArrayList;
import java.util.List;

public class DeleteMin {
    public List<Integer> solution(int[] arr) {
        List<Integer> list = new ArrayList<>();
        int min = arr[0];

        if(arr.length == 1) list.add(-1);
        else {
            for (int i = 0; i < arr.length; i++) {
                if (min > arr[i])
                    min = arr[i];
            }

            for (int a : arr) list.add(a);
            list.remove(list.indexOf(min));
        }
        return list;
    }
}
