import lv1.*;
import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        PlusTwo p = new PlusTwo();
        int[] numbers = {2,1,3,4,1};
        System.out.println(Arrays.toString(p.solution(numbers)));
    }
}
