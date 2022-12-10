package laba3;

import java.util.Scanner;

public class Zadanie2_switch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите название дня недели");
        String day = in.nextLine();
        switch (day.toLowerCase()) {
            case "понедельник":
                System.out.println("Порядковый номер понедельника - 1");
                break;
            case "вторник":
                System.out.println("Порядковый номер вторника - 2");
                break;
            case "среда":
                System.out.println("Порядковый номер среды - 3");
                break;
            case "четверг":
                System.out.println("Порядковый номер четверга - 4");
                break;
            case "пятница":
                System.out.println("Порядковый номер пятницы - 5");
                break;
            case "суббота":
                System.out.println("Порядковый номер субботы - 6");
                break;
            case "воскресенье":
                System.out.println("Порядковый номер воскресенья - 7");
                break;
            default:
                System.out.println("Введено некорректное значение!");
                break;
        }
    }
}
