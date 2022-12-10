package laba3;

import java.util.Scanner;

public class Zadanie4_while {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        if (a < b) {
            while (a <= b) {
                System.out.print(a + " ");
                a++;
            }
        } else {
            while (b <= a) {
                System.out.print(b + " ");
                b++;
            }
        }
    }
}
