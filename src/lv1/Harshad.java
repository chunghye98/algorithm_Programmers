package lv1;

public class Harshad {

    public boolean solution(int x) {
        String str = String.valueOf(x);
        char[] c = str.toCharArray();
        int sum = 0;

        for (int i = 0; i < c.length; i++) {
            sum += c[i] - '0';
        }

        if (x % sum == 0) return true;
        else return false;
    }
}
