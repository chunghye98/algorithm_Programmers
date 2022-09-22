package lv1;

import java.util.Scanner;

public class Star {
    public void solution() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String star = "*";
        String n = star.repeat(a)+"\n";
        System.out.print(n.repeat(b));
    }
}
