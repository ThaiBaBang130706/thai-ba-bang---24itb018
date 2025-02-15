//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
       Circle circle = new Circle();
        System.out.println(circle.toString());
        Circle circle1 = new Circle(2.2);
        System.out.println(circle1.toString());
        double area = circle.getArea();
        double area1 = circle1.getArea();
        System.out.println("Area is "  + area);
        System.out.println("Area1 is " + area1);
        double circum = circle.getCircumference();
        double circum1 = circle1.getCircumference();
        System.out.println("Circumference is " + circum);
        System.out.println("Circumference1 is " + circum1);
    }
}