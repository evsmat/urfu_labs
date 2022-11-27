package laba1;

import java.util.Scanner;

public class Zadanie6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите имя: ");
        String name = in.nextLine();
        System.out.println("Введите год рождения: ");
        int birthday = in.nextInt();
        int age = 2022 - birthday;
        System.out.println("Привет " + name + "! Тебе " + age + " лет");
    }
}
