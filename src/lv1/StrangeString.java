package lv1;

import java.util.ArrayList;
import java.util.List;

public class StrangeString {
    public String solution(String s) {
        String answer = "";
        List<String> list = new ArrayList<>();
        String[] arr = s.split(" ", -1);
        for (int i = 0; i < arr.length; i++) {
            char[] a = arr[i].toCharArray();
            for (int j = 0; j < a.length; j++) {
                if (j % 2 == 0) {
                    a[j] = Character.toUpperCase(a[j]);
                } else {
                    a[j] = Character.toLowerCase(a[j]);
                }
            }
            list.add(String.valueOf(a));
        }
        String[] result = list.toArray(new String[0]);
        answer = String.join(" ",result);
        return answer;
    }
}
