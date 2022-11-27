package laba1;

import java.util.Scanner;

public class Zadanie4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите название месяца: ");
        String month = in.nextLine();
        System.out.println("Введите количество дней месяца: ");
        int day = in.nextInt();
        System.out.println(day + " дней в месяце " + month);
    }
}
