package laba5.Zadanie3;

import java.util.Scanner;

public class Zadanie3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое число");
        int a = in.nextInt();
        System.out.println("Введите второе число");
        int b = in.nextInt();
        task task1 = new task();
        task task2 = new task(a);
        task task3 = new task(a,b);
    }
}
class task {
    private int num1;
    private int num2;

    public task() {
        System.out.println("Конструктор без аргуметнов");
    }
    public task(int num1) {
        System.out.println("Конструктор c передачей одного аргумента");
        System.out.println(num1);
    }
    public task(int num1, int num2) {
        System.out.println("Конструктор c передачей одного аргумента");
        System.out.println(num1 + " " + num2);
    }
}
