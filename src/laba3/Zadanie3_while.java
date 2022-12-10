package laba3;

import java.util.Scanner;

public class Zadanie3_while {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int x = 0;
        int y = 1;
        int number;
        int i = 0;
        while (i < n) {
            System.out.print(y + " ");
            number = x + y;
            x = y;
            y = number;
            i++;
        }
    }
}
