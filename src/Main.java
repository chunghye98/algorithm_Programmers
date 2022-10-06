import lv1.*;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        StringSort s = new StringSort();
        String[] strings1 = {"sun","bed","car"};
        String[] strings2 = {"abce","abcd","cdx"};
        int n1 = 1;
        int n2 = 2;
//        System.out.println(s.solution(strings1, n1));
        System.out.println(Arrays.toString(s.solution(strings2, n2)));
    }
}
