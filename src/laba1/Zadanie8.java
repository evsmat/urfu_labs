package laba1;

import java.util.Scanner;

public class Zadanie8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        float x = in.nextFloat();
        System.out.println("Введите второе число: ");
        float y = in.nextFloat();
        float summ = x + y;
        System.out.println(x + " + " + y + " = " + summ);
    }
}
