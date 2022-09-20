package lv1;

import java.util.Arrays;
import java.util.Collections;

public class AddMissingNum {
    public int solution(int[] numbers) {
        int total = 0;
        int numSum = 0;

        for(int i=0; i<10; i++) total += i;
        for(int i=0; i<numbers.length; i++) numSum += numbers[i];

        return total-numSum;
    }
}
