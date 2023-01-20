package laba4;

import java.util.Arrays;
import java.util.Scanner;

public class Zadanie9 {
    public static void main(String[] args) {
        char alphabet[] = {'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж', 'з', 'и',
                'й', 'к', 'л', 'м', 'н', 'о', 'п', 'р', 'с', 'т', 'у', 'ф',
                'х', 'ц', 'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я'};
        Scanner in = new Scanner(System.in);
        System.out.println("Введите текст для шифрования");
        String value = in.nextLine().toLowerCase();
        System.out.println("Введите ключ для шифрования");
        int key = in.nextInt();

        //Шифрование
        char[] chars = value.toCharArray();
        int[] ints = new int[value.length()];
        for (int i = 0; i < chars.length; i++) {
            for (int j = 0; j < alphabet.length; j++) {
                if (chars[i] == alphabet[j]) {
                    ints[i] = alphabet[(j + key) % 33];
                }
            }
        }
        for (int i = 0; i < chars.length; i++) {
            chars[i] = (char) ints[i];
        }
        System.out.println("Текст после преобразования: ");
        System.out.println(Arrays.toString(chars).toLowerCase());
        boolean question = false;
        System.out.println("Выполнить обратное преобразование? (y/n)");
        while (!question) {
            String answer = in.next();
            if (answer.toLowerCase().equals("y")) {
                for (int i = 0; i < chars.length; i++) {
                    for (int j = 0; j < alphabet.length; j++) {
                        if (chars[i] == alphabet[j]) {
                            ints[i] = alphabet[(j - key) % 33];
                        }
                    }
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
