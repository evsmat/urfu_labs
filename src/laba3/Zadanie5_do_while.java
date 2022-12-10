package laba3;

import java.util.Scanner;

public class Zadanie5_do_while {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int summ = 0;
        int i = 0;
        do {
            if (i % 5 == 2 || i % 3 == 1) {
                System.out.println(i);
                summ += i;
            }
            i++;
        }
        while (i < n);
        System.out.println("Сумма чисел: " + summ);
    }
}
