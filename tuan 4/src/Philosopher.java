import java.util.concurrent.Semaphore;

public class Philosopher extends Thread {
private int id;
private Semaphore leftChopstick;
private Semaphore rightChopstick;
private Semaphore table;
private SharedResource foodResource;

public Philosopher(int id, Semaphore leftChopstick, Semaphore rightChopstick, Semaphore table, SharedResource foodResource) {
    this.id = id;
    this.leftChopstick = leftChopstick;
    this.rightChopstick = rightChopstick;
    this.table = table;
    this.foodResource = foodResource;
}

private void think() {
    System.out.println("Triết gia " + id + " đang suy nghĩ...");
    try {
        Thread.sleep((long) (Math.random() * 3000)); // Suy nghĩ ngẫu nhiên
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
}

private void eat() {
    System.out.println("Triết gia " + id + " đang ăn...");
    try {
        Thread.sleep(3000); // Ăn trong 3 giây
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
}

public void run() {
    while (true) {
        // Kiểm tra nếu hết đồ ăn
        if (foodResource.getFoodCount() <= 0) {
            System.out.println("Không còn đồ ăn! Triết gia " + id + " dừng lại.");
            break;
        }

        think();
        try {
            table.acquire(); // Kiểm soát số triết gia có thể vào bàn cùng lúc
            leftChopstick.acquire();
            System.out.println("Triết gia " + id + " đã lấy đũa bên trái.");

            rightChopstick.acquire();
            System.out.println("Triết gia " + id + " đã lấy đủ 2 đũa và bắt đầu ăn.");

            eat();

            // Giảm số lượng đồ ăn
            foodResource.decreaseFood();

            leftChopstick.release();
            rightChopstick.release();
            table.release(); // Giải phóng quyền vào bàn ăn

            System.out.println("Triết gia " + id + " đã ăn xong và thả đũa.");

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
}