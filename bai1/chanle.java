package bai1;

public class chanle {
    private int max;
    private int number = 1;
    private final Object lock = new Object();

    public chanle(int max) {
        this.max = max;
    }

    public void printOdd() {
        synchronized (lock) {
            while (number < max) {
                if (number % 2 == 0) {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("Lẻ: " + number);
                number++;
                lock.notify();
            }
        }
    }

    public void printEven() {
        synchronized (lock) {
            while (number <= max) {
                if (number % 2 == 1) {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("Chẵn: " + number);
                number++;
                lock.notify();
            }
        }
    }
}

