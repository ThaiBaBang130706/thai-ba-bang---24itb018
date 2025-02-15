//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        MoveablePoint point = new MoveablePoint(0, 0, 2, 3);
        System.out.println("Initial Position: " + point);

        point.moveUp();
        System.out.println("After moveUp: " + point);

        point.moveRight();
        System.out.println("After moveRight: " + point);
    }
}