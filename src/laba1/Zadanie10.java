package laba1;

import java.util.Scanner;

public class Zadanie10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        float x = in.nextFloat();
        System.out.println("Введите второе число: ");
        float y = in.nextFloat();
        float a = x + y;
        float b = x - y;
        System.out.printf("%.2f + %.2f = %.2f\n", x, y, a);
        System.out.printf("%.2f - %.2f = %.2f", x, y, b);
    }
}
