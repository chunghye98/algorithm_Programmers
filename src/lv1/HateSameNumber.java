package lv1;

import java.util.Stack;

public class HateSameNumber {
    public Stack<Integer> solution(int[] arr) {
        int temp = -1;
        Stack<Integer> stack = new Stack<>();
        for (int a : arr) {
            if(temp != a){
                stack.push(a);
                temp = a;
            }
        }
        return stack;
    }
}
