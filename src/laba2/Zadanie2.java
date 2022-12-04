package laba2;

import java.util.Scanner;

public class Zadanie2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число:");
        float x = in.nextFloat();
        if (x % 5 == 2) {
            System.out.println("При делении на 5 введенное число имеет остаток 2");
        } else {
            System.out.println("При делении на 5 введенное число не имеет остаток 2");
        }
        if (x % 7 == 1) {
            System.out.println("При делении на 7 введенное число имеет остаток 1");
        } else {
            System.out.println("При делении на 7 введенное число не имеет остаток 1");
        }
    }
}
