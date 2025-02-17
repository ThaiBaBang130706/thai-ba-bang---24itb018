package Linesub;
import java.awt.Point;
public class TestLineSub {
    public static void main(String[] args) {
        // Test 1: Create LineSub with constructor using integer coordinates
        LineSub line1 = new LineSub(1, 2, 4, 6);

        // Test 2: Create LineSub with constructor using Point objects
        Point begin = new Point(2, 3);
        Point end = new Point(5, 7);
        LineSub line2 = new LineSub(begin, end);

        // Print out the lines
        System.out.println("Line 1: " + line1.toString());
        System.out.println("Line 2: " + line2.toString());

        // Test 3: Get length and gradient of Line 1
        System.out.println("Line 1 Length: " + line1.getLength());
        System.out.println("Line 1 Gradient: " + line1.getGradient());

        // Test 4: Get length and gradient of Line 2
        System.out.println("Line 2 Length: " + line2.getLength());
        System.out.println("Line 2 Gradient: " + line2.getGradient());

        // Test 5: Modify the end point of Line 1
        line1.setEndXY(7, 8);
        System.out.println("Modified Line 1: " + line1.toString());
        System.out.println("Modified Line 1 Length: " + line1.getLength());
    }
}

