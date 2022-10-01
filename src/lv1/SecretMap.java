package lv1;

import java.util.ArrayList;
import java.util.List;

public class SecretMap {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        List<char[]> list1 = createBinary(arr1, n);
        List<char[]> list2 = createBinary(arr2, n);
        List<String> list3 = new ArrayList<>();

        char[] chars = new char[n];
        for (int i = 0; i < list1.size(); i++) {
            for (int j = 0; j < list1.get(i).length; j++) {
                if (list1.get(i)[j] == '1' || list2.get(i)[j] == '1')
                    chars[j] = '#';
                else chars[j] = ' ';
            }
            list3.add(String.valueOf(chars));
        }
        return list3.toArray(new String[0]);
    }

    private List<char[]> createBinary(int[] arr, int n) {
        List<char[]> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            String s = Integer.toBinaryString(arr[i]);
            while(s.length() != n) {
                s = '0' + s;
            }
            char[] cArr = s.toCharArray();
            list.add(cArr);
        }
        return list;
    }
}
