public class Main {
    public static void main(String[] args) {
        Circle myCircle = new Circle(5, "green");
        System.out.println(myCircle.toString());
        double area = myCircle.getArea();
        System.out.println("Area: " + area);
    }
}