package laba1;

import java.util.Scanner;

public class Zadanie9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число: ");
        float x = in.nextFloat();
        float a = x - 1;
        float b = x + 1;
        double c = Math.pow(a + x + b, 2);
        System.out.printf("%.3f %.3f %.3f %.3f", a, x, b, c);
    }
}
