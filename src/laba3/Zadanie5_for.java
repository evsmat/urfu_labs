package laba3;

import java.util.Scanner;

public class Zadanie5_for {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int summ = 0;
        for (int i = 0; i < n; i++) {
            if (i % 5 == 2 || i % 3 == 1) {
                System.out.println(i);
                summ += i;
            }
        }
        System.out.println("Сумма чисел: " + summ);
    }
}
