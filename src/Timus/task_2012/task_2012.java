package Timus.task_2012;

import java.util.Scanner;

public class task_2012 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = 12 - a;
        int c = 45 * b;
        if (c > 240) {
            System.out.println("NO");
        } else System.out.println("YES");
    }
}
