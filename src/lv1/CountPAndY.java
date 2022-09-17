package lv1;

import java.util.Locale;

public class CountPAndY {

    public boolean solution(String s) {
        s = s.toUpperCase(Locale.ROOT);
        int pCount = 0;
        int yCount = 0;
        char[] arr = s.toCharArray();
        for (char a : arr) {
            if(a == 'P') pCount++;
            else if(a == 'Y') yCount++;
        }
        if(pCount == yCount) return true;
        else return false;
    }
}
