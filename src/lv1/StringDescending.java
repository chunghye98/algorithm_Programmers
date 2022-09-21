package lv1;

import java.util.Arrays;
import java.util.Collections;

public class StringDescending {
    public String solution(String s) {
        String answer = "";
        char[] arr = s.toCharArray();
        char temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-1; j++) {
                if (arr[j] < arr[j+1]) {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        answer = new String(arr);
        return answer;

    }
}
