package laba2;

import java.util.Scanner;

public class Zadanie5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число:");
        int x = in.nextInt();
        int y = x / 1000;
        System.out.println("Тысяч в числе: " + y);
    }
}
