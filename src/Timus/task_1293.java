package Timus;

import java.util.Scanner;

public class task_1293 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество панелей:");
        int n = in.nextInt();
        System.out.println("Введите длину панелей:");
        int a = in.nextInt();
        System.out.println("Введите ширину панелей:");
        int b = in.nextInt();
        System.out.println(a*b*n*2);
    }
}
