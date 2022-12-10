package laba3;

public class Zadanie8 {
    public static void main(String[] args) {
        char[] letters = new char[10];
        char letter = 'A';
        int i = 0;
        while (i < 10) {
            if (letter != 'A' && letter != 'E' && letter != 'I' && letter != 'O' && letter != 'U' && letter != 'Y') {
                letters[i] = letter;
                i++;
            }
            if (letter == 'Z') letter = 'A';
            else letter++;
        }
        for (char c : letters) {
            System.out.print(c + " ");
        }
    }
}
