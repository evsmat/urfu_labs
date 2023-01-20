package laba5.Zadanie2;

public class Zadanie2 {
    public static void main(String[] args) {
        task task2 = new task();
        task2.setChars('A' , 'Z');
        task2.showChars();
    }
}
class task {
    private char ch1;
    private char ch2;

    public void setChars(char ch1, char ch2) {
        this.ch1 = ch1;
        this.ch2 = ch2;
    }

    public void showChars() {
        int int1 = ch1;
        int int2 = ch2;
        if (ch1>ch2) {
            int1 = ch2;
            int2 = ch1;
        }
        for (int i = int1; i<=int2; i++) {
            System.out.println((char) i);
        }
    }
}
