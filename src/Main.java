import lv1.*;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Budget b = new Budget();
        int[] d = {1, 3, 2, 5, 4};
        int budget = 9;
        System.out.println(b.solution(d, budget));
    }
}
