package laba3;

import java.util.Scanner;

public class Zadanie2_if {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите название дня недели: ");
        String day = in.nextLine().toLowerCase();
        if (day.equals("понедельник")) {
            System.out.println("Порядковый номер понедельника - 1");
        } else if (day.equals("вторник")) {
            System.out.println("Порядковый номер вторника - 2");
        } else if (day.equals("среда")) {
            System.out.println("Порядковый номер среды - 3");
        } else if (day.equals("четверг")) {
            System.out.println("Порядковый номер четверга - 4");
        } else if (day.equals("пятница")) {
            System.out.println("Порядковый номер пятницы - 5");
        } else if (day.equals("суббота")) {
            System.out.println("Порядковый номер субботы - 6");
        } else if (day.equals("воскресенье")) {
            System.out.println("Порядковый номер воскресенье - 7");
        } else System.out.println("Введено некорректное значение!");
    }
}
