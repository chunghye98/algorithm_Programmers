package lv1;

public class UseString {
    public boolean solution(String s) {
        boolean answer = true;
        char[] arr = s.toCharArray();
        answer = (arr.length == 4) || (arr.length == 6) ? true : false;
        for (int i = 0; i < arr.length; i++)
            if(arr[i] >= 65) answer = false;
        return answer;
    }
}
