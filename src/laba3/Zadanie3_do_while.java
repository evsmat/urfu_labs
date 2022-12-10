package laba3;

import java.util.Scanner;

public class Zadanie3_do_while {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int x = 0;
        int y = 1;
        int number;
        int i = 0;
        do {
            System.out.print(y + " ");
            number = x + y;
            x = y;
            y = number;
            i++;
        }
        while (i < n);
    }
}
