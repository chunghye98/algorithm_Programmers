import lv1.*;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        DotProduct d = new DotProduct();
        int[] a = {1,2,3,4};
        int[] b = {-3, -1, 0, 2};
        System.out.println(d.solution(a, b));
    }
}
