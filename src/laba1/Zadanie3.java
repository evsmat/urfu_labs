package laba1;

import java.util.Scanner;

public class Zadanie3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите название дня недели: ");
        String day_of_week = in.nextLine();
        System.out.print("Введите название месяца: ");
        String month = in.nextLine();
        System.out.print("Введите день месяца: ");
        int day = in.nextInt();
        System.out.println("Сегодня " + day_of_week + ", " + day + " " + month);
    }
}
