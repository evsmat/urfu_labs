package laba4;

import java.util.Random;
import java.util.Scanner;

public class Zadanie4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество столбцов массива");
        int a = in.nextInt();
        System.out.println("Введите количество строк массива");
        int b = in.nextInt();
        int[][] mass = new int[a][b];
        Random rand = new Random();
        for (int i = 0 ; i < a ; i++) {
            System.out.print("Номер строки: " + i + " | ");
            for (int j = 0; j < b; j++) {
                mass[i][j] = rand.nextInt(100);
                System.out.print(mass[i][j] + " ");
            }
            System.out.println();
        }
        int[][] reverse = new int[b][a];
        for (int i = 0 ; i < b ; i++) {
            System.out.print("Номер строки обратного массива: " + i + " | ");
            for (int j = 0; j < a; j++) {
                reverse [i][j] = mass [j][i];
                System.out.print(reverse[i][j] + " ");
            }
            System.out.println();
        }
    }
}
