public class SharedResource {
    private int foodCount;

    public SharedResource(int foodCount) {
        this.foodCount = foodCount;
    }

    public synchronized int getFoodCount() {
        return foodCount;
    }

    public synchronized void decreaseFood() {
        if (foodCount > 0) {
            foodCount--;
            System.out.println("Còn lại " + foodCount + " phần ăn.");
        }
    }

}
