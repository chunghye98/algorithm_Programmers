import lv1.*;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        AddPlusMinus a = new AddPlusMinus();
        int[] absolutes = {4, 7, 12};
        boolean[] signs = {true, false, true};
        System.out.println(a.solution(absolutes, signs));
    }
}
