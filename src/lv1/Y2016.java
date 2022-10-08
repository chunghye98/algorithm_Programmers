package lv1;

import java.util.Calendar;

public class Y2016 {
    public String solution(int a, int b) {
        String answer = "";
        String[] week = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
        Calendar date = Calendar.getInstance();
        date.set(2016, a-1,b);
        answer = week[date.get(Calendar.DAY_OF_WEEK) - 1];
        return answer;
    }
}
