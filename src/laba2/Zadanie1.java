package laba2;

import java.util.Scanner;

public class Zadanie1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число:");
        float x = in.nextFloat();
        if (x % 3 == 0) {
            System.out.printf("Число %.2f делится на 3", x);
        }
        else {
            System.out.printf("Число %.2f не делится на 3", x);
        }
    }
}
