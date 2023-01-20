package laba5.Zadanie5;

import java.util.Scanner;

public class Zadanie5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int a = in.nextInt();

        System.out.println("\nИспользуемые конструкты:");
        task t1 = new task();
        task t2 = new task(a);

        System.out.println("\nСодержимое первого объекта:");
        t1.task2();
        System.out.println("Содержимое второго объекта:");
        t2.task2();

        System.out.println("\nПрименение методов на объекты:");
        t1.task1(a);
        t2.task1();

        System.out.println("\nСодержимое первого объекта:");
        t1.task2();
        System.out.println("Содержимое второго объекта:");
        t2.task2();
    }
}
class task {
    private int int1;

    task(){
        int1 = 0;
    }
    task(int tmp){
        if(tmp <= 100){
            int1 = tmp;
        }
        else{
            int1 = 100;
        }
    }

    public void task1(){
        int1 = 0;
    }

    public void task1(int tmp){
        if(tmp <= 100){
            int1 = tmp;
        }
        else{
            int1 = 100;
        }
    }

    public void task2(){
        System.out.println("Значение поля = " + int1);
    }
}
