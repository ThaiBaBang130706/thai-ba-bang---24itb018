

import java.util.Arrays;

public class MyIntStack {
    private int[] contents;
    private int tos; // Top of the stack

    // Constructors
    public MyIntStack(int capacity) {
        contents = new int[capacity];
        tos = -1;
    }

    // Push method with modifications
    public boolean push(int element) {
        if (isFull()) {
            // Option 1: Throw Exception
            // throw new IllegalStateException("Stack is full");

            // Option 2: Reallocate and expand capacity
            increaseCapacity();
        }
        contents[++tos] = element;
        return true;
    }

    // Pop method
    public int pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return contents[tos--];
    }

    // Peek method
    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return contents[tos];
    }

    // Check if stack is empty
    public boolean isEmpty() {
        return tos < 0;
    }

    // Check if stack is full
    public boolean isFull() {
        return tos == contents.length - 1;
    }

    // Increase capacity by reallocating a larger array
    private void increaseCapacity() {
        int newCapacity = contents.length * 2;
        contents = Arrays.copyOf(contents, newCapacity);
        System.out.println("Stack capacity increased to: " + newCapacity);
    }
}
