package laba4;

import java.util.Scanner;

public class Zadanie3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите высоту прямоугольника");
        int b = in.nextInt();
        System.out.println("Введите ширину прямоугольника");
        int c = in.nextInt();
        int i;
        int j;
        int z;
        int[][] mass = new int [b][c];

        for (i = 0; i < b; i++) {
            for (j = 0; j < c; j++) {
                mass[i][j] = 2;
            }
        }
        for (i = 0; i < b; i++) {
            System.out.print("Номер строки: " + i + " | ");
            z = 0;
            for (j = 0; j < c; j++) {
                System.out.print(mass[i][j] + " ");
                z = z + 1;
            }
            System.out.println("Количество символов в строке " + z);
        }
    }
}
