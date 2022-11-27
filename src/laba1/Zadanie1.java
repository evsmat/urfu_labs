package laba1;

import java.util.Scanner;

public class Zadanie1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите фамилию: ");
        String familiya = in.nextLine();
        System.out.println("Введите имя: ");
        String imya = in.nextLine();
        System.out.println("Введите отчество: ");
        String otchestvo = in.nextLine();
        System.out.println("Hello " + familiya + " " + imya + " " + otchestvo);
    }
}
