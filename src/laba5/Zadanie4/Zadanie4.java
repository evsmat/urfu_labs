package laba5.Zadanie4;

import java.util.Scanner;

public class Zadanie4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите символ: ");
        char a = in.nextLine().charAt(0);
        System.out.print("Введите целочисленное число: ");
        int b = in.nextInt();
        System.out.print("Введите число с плавающей точкой: ");
        double c = in.nextDouble();
        in.close();

        System.out.println("Результат работы программы:");
        task task1 = new task();
        System.out.println("v1 = " + task1.ch1);
        System.out.println("v2 = " + task1.int1);

        task task2 = new task(a);
        System.out.println("v1 = " + task2.ch1);
        System.out.println("v2 = " + task2.int1);

        task task3 = new task(b);
        System.out.println("v1 = " + task3.ch1);
        System.out.println("v2 = " + task2.int1);

        task task4 = new task(a,b);
        System.out.println("v1 = " + task4.ch1);
        System.out.println("v2 = " + task4.ch1);

        task task5 = new task(c);
        System.out.println("v1 = " + task5.ch1);
        System.out.println("v2 = " + task5.int1);
    }
}
class task {
    char ch1;
    int int1;

    task(){
        System.out.println("Выбран конструкт без передачи аргументов");

    }
    task(char ch2){
        System.out.println("Выбран конструкт с передачей символьного аргумента");
        ch1 = ch2;
    }
    task(int int2){
        System.out.println("Выбран конструкт с передачей целочисленного аргумента");
        int1 = int2;
    }
    task(char ch2, int int2){
        System.out.println("Выбран конструкт с передачей двух аргументов");
        ch1 = ch2;
        int1 = int2;
    }
    task(double a){
        System.out.println("Выбран конструкт с передачей double аргумента");
        ch1 = (char) (a / 1);
        int1 = (int) (a % 1 * 100);
    }
}
