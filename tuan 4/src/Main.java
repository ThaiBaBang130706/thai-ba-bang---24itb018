//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.concurrent.Semaphore;
public class Main {
    public static void main(String[] args) {
        int numPhilosophers = 5;
        int initialFoodCount = 10; // Tổng số phần ăn
        Semaphore[] chopsticks = new Semaphore[numPhilosophers];
        Semaphore table = new Semaphore(numPhilosophers - 1); // Tối đa 4 triết gia có thể lấy đũa cùng lúc
        SharedResource foodResource = new SharedResource(initialFoodCount);

        // Khởi tạo Semaphore cho từng đũa
        for (int i = 0; i < numPhilosophers; i++) {
            chopsticks[i] = new Semaphore(1);
        }

        // Tạo và chạy luồng cho từng triết gia
        Philosopher[] philosophers = new Philosopher[numPhilosophers];
        for (int i = 0; i < numPhilosophers; i++) {
            philosophers[i] = new Philosopher(i, chopsticks[i], chopsticks[(i + 1) % numPhilosophers], table, foodResource);
            philosophers[i].start();
        }
    }
}