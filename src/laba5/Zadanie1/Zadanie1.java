package laba5.Zadanie1;

public class Zadanie1 {
    public static void main(String[] args) {
        task task1 = new task();
        task1.setCh1('k');
        System.out.println(task1.getCh1());
        task1.showCode();
    }
}
class task {
    private char ch1;

    public void setCh1(char ch1) {
        this.ch1 = ch1;
    }

    public char getCh1() {
        return ch1;
    }

    public void showCode () {
        System.out.println((int) ch1);
        System.out.println(ch1);
    }
}
