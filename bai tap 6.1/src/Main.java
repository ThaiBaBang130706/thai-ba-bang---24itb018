public class Main {
    public static void main(String[] args) {
        // Upcasting Circle lên Shape
        Shape s1 = new Circle(5.5, "red", false);
        System.out.println(s1);
        System.out.println(s1.getArea());
        System.out.println(s1.getPerimeter());
        System.out.println(s1.getColor());
        System.out.println(s1.isFilled());

        // Ép kiểu xuống Circle để gọi getRadius()
        if (s1 instanceof Circle) {
            Circle c1 = (Circle) s1;
            System.out.println(c1.getRadius());
        }

        // Lỗi: Không thể khởi tạo một lớp trừu tượng
        // Shape s2 = new Shape();  // Sẽ gây lỗi biên dịch

        // Upcasting Rectangle lên Shape
        Shape s3 = new Rectangle(1.0, 2.0, "red", false);
        System.out.println(s3);
        System.out.println(s3.getArea());
        System.out.println(s3.getPerimeter());
        System.out.println(s3.getColor());

        // Ép kiểu xuống Rectangle để gọi getLength()
        if (s3 instanceof Rectangle) {
            Rectangle r1 = (Rectangle) s3;
            System.out.println(r1.getLength());
        }

        // Upcasting Square lên Shape
        Shape s4 = new Square(6.6);
        System.out.println(s4);
        System.out.println(s4.getArea());
        System.out.println(s4.getColor());

        // Ép kiểu xuống Rectangle
        if (s4 instanceof Rectangle) {
            Rectangle r2 = (Rectangle) s4;
            System.out.println(r2);
            System.out.println(r2.getArea());
            System.out.println(r2.getColor());
            System.out.println(r2.getLength()); // Sử dụng getLength() thay vì getSide()
        }

        // Ép kiểu xuống Square
        if (s4 instanceof Square) {
            Square sq1 = (Square) s4;
            System.out.println(sq1);
            System.out.println(sq1.getArea());
            System.out.println(sq1.getColor());
            System.out.println(sq1.getSide());
            System.out.println(sq1.getLength());
        }
    }
}
