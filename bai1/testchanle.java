package bai1;

public class testchanle {
    public static void main(String[] args) {
        chanle printer = new chanle(40);

        Thread t1 = new Thread(printer::printOdd);
        Thread t2 = new Thread(printer::printEven);

        t1.start();
        t2.start();
    }
}
