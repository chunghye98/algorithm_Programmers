package lv1;

import java.util.ArrayList;
import java.util.List;

public class Caesar {
    public String solution(String s, int n) {
        List<Character> list = new ArrayList<>();
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            int a = arr[i] + n;
            if (a > 122 && (arr[i] > 96 && arr[i] < 123)) a = 97 + (n - (122 - arr[i]) - 1);
            else if(a > 90 && (arr[i] > 64 && arr[i] < 91)) a = 65 + (n - (90 - arr[i]) - 1);
            else if (arr[i] == 32) a = arr[i];
            list.add((char) a);
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++)
            sb.append(list.get(i));
        return sb.toString();
    }
}
