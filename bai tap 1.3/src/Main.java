//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
       Retangle retangle = new Retangle();
        System.out.println(retangle.toString());
        Retangle retangle1 = new Retangle();
        retangle1.setLength(3.4f);
        retangle1.setWidth(5.6f);
        System.out.println(retangle1);
        System.out.println("length = "+retangle1.getLength());
        System.out.println("width = "+retangle1.getWidth());
        float area = retangle1.getArea();
        float perimeter = retangle1.getPerimeter();
        System.out.println("Area = "+area);
        System.out.println("Perimeter = "+perimeter);
    }
}