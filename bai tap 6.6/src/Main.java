//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Cat myCat = new Cat("Whiskers");
        Dog myDog = new Dog("Buddy");
        BigDog myBigDog = new BigDog("Max");

        myCat.greets(); // Output: Meow
        myDog.greets(); // Output: Woof
        myDog.greets(myDog); // Output: Woooof
        myBigDog.greets(); // Output: Wooow
        myBigDog.greets(myDog); // Output: Wooooooow
        myBigDog.greets(myBigDog); // Output: Woo0000000w
    }
}