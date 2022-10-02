import lv1.*;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        BruteForce b = new BruteForce();
        int[][] sizes = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
        System.out.println(b.solution(sizes));
    }
}
