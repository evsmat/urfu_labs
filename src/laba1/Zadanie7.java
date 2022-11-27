package laba1;

import java.util.Scanner;

public class Zadanie7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите возраст: ");
        int age = in.nextInt();
        int birthday = 2022 - age;
        System.out.println("Ты родился в " + birthday + " году");
    }
}
