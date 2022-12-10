package laba3;

import java.util.Random;

public class Zadanie9 {
    public static void main(String[] args) {
        int count = 10;
        int[] numbers = new int[count];
        int min_number = 0;
        Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(0 + 20) - 10;
            if (i == 0) min_number = numbers[i];
            if (numbers[i] < min_number) {
                min_number = numbers[i];
            }
        }
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == min_number) System.out.println("Число: " + numbers[i] + " индекс: " + i);
        }
    }
}
