package laba3;

import java.util.Scanner;

public class Zadanie4_do_while {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        if (a < b) {
            do {
                System.out.print(a + " ");
                a++;
            }
            while (a <= b);
        } else {
            do {
                System.out.print(b + " ");
                b++;
            }
            while (b <= a);
        }
    }
}
