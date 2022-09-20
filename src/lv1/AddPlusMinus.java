package lv1;

public class AddPlusMinus {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        String sign = "";
        String[] intStrings = new String[absolutes.length];

        for (int i = 0; i < absolutes.length; i++) {
            if(signs[i] == true) sign = "+";
            else sign = "-";
            intStrings[i] = sign + absolutes[i];
        }

        for (int i = 0; i < intStrings.length; i++)
            answer += Integer.parseInt(intStrings[i]);

        return answer;

    }
}
