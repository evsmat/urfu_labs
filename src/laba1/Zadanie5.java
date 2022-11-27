package laba1;

import java.util.Scanner;

public class Zadanie5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите год рождения: ");
        int birthday = in.nextInt();
        int age = 2022 - birthday;
        System.out.println("Тебе " + age + " лет");
    }
}
