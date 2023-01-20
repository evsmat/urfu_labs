package laba4;

import java.util.Scanner;

public class Zadanie7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество столбцов массива");
        int a = in.nextInt();
        System.out.println("Введите количество строк массива");
        int b = in.nextInt();
        int[][] mass = new int[a][b];
        int c = 0;
        int d = 0;
        int e = 0;
        for (int i = 0; e < mass.length; e++) {
            for (int j = 0; j < (mass[i].length - c); j++) {
                mass[i][j] = d;
                d++;
            }
            i++;
            for (int k = i; k < mass.length; k++) {
                mass[k][mass[i].length - 1 - c] = d;
                d++;
            }
            c++;
        }
        int z = 0;
        for (int i = 0; i < mass.length; i++) {
            System.out.print("Номер строки: " + i + " | ");
            for (int j = 0; j < mass[i].length; j++) {
                System.out.print(mass[i][j] + " ");
                z++;
            }
            System.out.println("Количество символов в строке " + z);
        }
    }
}
