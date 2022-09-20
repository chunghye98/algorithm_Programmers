package lv1;

public class HideNum {
    public String solution(String phone_number) {
        String[] arr = phone_number.split("");
        for(int i=arr.length-1; i>=0; i--){
            if((arr.length-1) - i > 3)
                arr[i] = "*";
        }
        return String.join("", arr);
    }
}
