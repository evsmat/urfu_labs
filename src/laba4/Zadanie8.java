package laba4;

import java.util.Arrays;
import java.util.Scanner;

public class Zadanie8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите текст для шифрования");
        String value = in.nextLine();

        System.out.println("Введите ключ для шифрования");
        int key = in.nextInt();

        //Шифрование
        char[] chars = value.toCharArray();
        int[] ints = new int[value.length()];
        for (int i = 0; i < chars.length; i++) {
            ints[i] = chars[i];
            ints[i] = ints[i] + key;
        }
        for (int i = 0; i < chars.length; i++) {
            chars[i] = (char) ints[i];
        }
        System.out.println("Текст после преобразования: ");
        System.out.println(Arrays.toString(chars));
        boolean question = false;
        System.out.println("Выполнить обратное преобразование? (y/n)");
        while (!question) {
            String answer = in.next();
            if (answer.toLowerCase().equals("y")) {
                for (int i = 0; i < chars.length; i++) {
                    ints[i] = chars[i];
                    ints[i] = ints[i] - key;
                }
                for (int i = 0; i < chars.length; i++) {
                    chars[i] = (char) ints[i];
                }
                System.out.println(Arrays.toString(chars));
                question = true;
            } else if (answer.toLowerCase().equals("n")) {
                System.out.println("До свидания!");
                question = true;
            } else {
                System.out.println("Введите корректный ответ");
                question = false;
            }
        }
    }
}
