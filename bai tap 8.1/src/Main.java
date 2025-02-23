

public class Main {
    public static void main(String[] args) {
        // Khởi tạo stack với dung lượng ban đầu là 3
        MyIntStack stack = new MyIntStack(3);

        // Thêm phần tử vào stack
        stack.push(10);
        stack.push(20);
        stack.push(30);

        // Thử push khi đầy (sẽ tự động tăng dung lượng)
        stack.push(40);
        stack.push(50);

        // Lấy phần tử trên cùng mà không xóa
        System.out.println("Peek: " + stack.peek());

        // Lấy và xóa phần tử trên cùng
        System.out.println("Pop: " + stack.pop());
        System.out.println("Pop: " + stack.pop());

        // Kiểm tra stack có rỗng không
        System.out.println("Is Empty: " + stack.isEmpty());
    }
}
