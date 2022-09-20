package lv1;

public class GetMiddleLetter {
    public String solution(String s) {
        String answer = "";
        String[] arr = String.valueOf(s).split("");
        int i = 0;

        if (arr.length % 2 == 0) {
            i = arr.length / 2 - 1;
            answer = arr[i]+""+ arr[i+1];
        } else {
            i = arr.length / 2;
            answer = arr[i];
        }
        return answer;
    }
}
