package laba3;

import java.util.Random;

public class Zadanie10 {
    public static void main(String[] args) {
        int count = 10;
        int[] numbers = new int[count];
        Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100);
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        int temp;
        boolean ok = false;
        while (!ok) {
            ok = true;
            for (int i = 0; i < numbers.length - 1; i++) {
                if (numbers[i] < numbers[i + 1]) {
                    temp = numbers[i];
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = temp;
                    ok = false;
                }
            }
        }
        for (int n:numbers) {
            System.out.print(n + " ");
        }
    }
}
