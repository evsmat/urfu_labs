package laba3;

import java.util.Scanner;

public class Zadanie4_for {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        if (a < b) {
            for (int i = a; i <= b; i++) {
                System.out.print(i + " ");
            }
        } else {
            for (int i = b; i <= a; i++) {
                System.out.print(i + " ");
            }
        }
    }
}
