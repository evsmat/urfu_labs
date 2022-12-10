package laba3;

import java.util.Random;
import java.util.Scanner;

public class Zadanie6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n > 0) {
            int[] numbers = new int[n];
            int counter = 0;
            int i = 0;
            while (counter < n) {
                if (i % 5 == 2) {
                    numbers[counter] = i;
                    System.out.print(numbers[counter] + " ");
                    counter++;
                }
                i++;
            }
        } else System.out.println("Введено некорректное значение!");
    }
}
