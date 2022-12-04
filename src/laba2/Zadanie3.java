package laba2;

import java.util.Scanner;

public class Zadanie3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число:");
        float x = in.nextFloat();
        if (x % 4 == 0 && x >= 10) {
            System.out.println("Введенное число делится на 4 и при этом больше 10");
        } else {
            System.out.println("Введенное число не делится на 4 и при этом больше 10");
        }
    }
}
