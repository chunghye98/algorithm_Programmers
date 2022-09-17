package lv1;

public class IntDescending {
    public long solution(long n) {
        String str = Long.toString(n);
        char[] arr = str.toCharArray();
        char temp;

        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return Long.parseLong(String.valueOf(arr));
    }
}
