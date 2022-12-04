package Timus.task_1409;

import java.util.Scanner;

public class task_1409 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String x = in.nextLine();
        String[] result = x.split(" ");
        int a =Integer.valueOf(result[1]) - 1;
        int b =Integer.valueOf(result[0]) - 1;
        System.out.print(a + " " + b);
    }
}
