package laba3;

public class Zadanie7 {
    public static void main(String[] args) {
        int count = 10;
        char[] letters = new char[count];
        char letter = 'A';
        for (int i = 0; i < count; i++) {
            letters[i] = letter;
            if (letter == 'Y') letter = 'A';
            else letter += 2;
        }
        for (int i = 0; i < letters.length; i++) {
            System.out.print(letters[i] + " ");
        }
        System.out.println();
        for (int i = letters.length-1; i >= 0; i--) {
            System.out.print(letters[i] + " ");
        }
    }
}
