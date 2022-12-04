package laba2;

import java.util.Scanner;

public class Zadanie4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число:");
        float x = in.nextFloat();
        if (x >= 5 && x <=10) {
            System.out.println("Введенное число попадает в диапазон от 5 до 10");
        } else {
            System.out.println("Введенное число не попадает в диапазон от 5 до 10");
        }
    }
}
