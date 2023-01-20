package laba5.Zadanie6;

import java.util.Scanner;

public class Zadanie6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int a = in.nextInt();
        System.out.print("Введите второе число: ");
        int b = in.nextInt();
        task task1 = new task();
        task task2 = new task(a);
        task task3 = new task(a,b);
        System.out.println("До использования методов:");
        System.out.println("Содержимое первого объекта:");
        task1.task3();
        System.out.println("Содержимое второго объекта:");
        task2.task3();
        System.out.println("Содержимое третьего объекта:");
        task3.task3();

        System.out.println("После использования методов:");
        task1.task2(a,b);
        task2.task1(b);
        System.out.println("Содержимое первого объекта:");
        task1.task3();
        System.out.println("Содержимое второго объекта:");
        task2.task3();
    }
}
class task {
    private int min;
    private int max;

    task(){
        System.out.println("Выбран конструкт без передачи аргументов");
        min = 0;
        max = 0;
    }

    task(int a){
        System.out.println("Выбран конструкт с передачей одного аргумента");
        if(a > 0){
            max = a;
            min = 0;
        }
        else{
            max = 0;
            min = a;
        }
    }

    task(int a, int b){
        System.out.println("Выбран конструкт с передачей двух аргументов");
        if(a > b){
            min = b;
            max = a;
        }
        else{
            min = a;
            max = b;
        }
    }

    public void task1(int a){
        if(a > max){
            min = max;
            max = a;
        }
        if(a < min){
            min = a;
        }
    }

    public void task2(int a, int b){
        if(a > b){
            min = b;
            max = a;
        }
        else{
            min = a;
            max = b;
        }
    }

    public void task3(){
        System.out.println("min = " + min);
        System.out.println("max = " + max);
    }
}
