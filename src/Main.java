import lv1.*;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        SecretMap s = new SecretMap();
        int[] arr1 = {9, 20, 28, 18, 11};
        int[] arr2 = {30, 1, 21, 17, 28};
        System.out.println(Arrays.toString(s.solution(5, arr1, arr2)));
    }
}
