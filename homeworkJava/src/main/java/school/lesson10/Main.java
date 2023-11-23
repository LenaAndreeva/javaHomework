package school.lesson10;

public class Main {
    public static void main(String[] args) {

        Box<Apple> appleBox1 = new Box<>();
        BoxFiller.fillBoxWithApples(appleBox1, 5);

        System.out.println("Apple box weight: " + appleBox1.getWeight());

        Box<Orange> orangeBox = new Box<>();
        BoxFiller.fillBoxWithOranges(orangeBox, 5);

        System.out.println("Orange box weight: " + orangeBox.getWeight());

        System.out.println("Comparison of apples and oranges boxes: " + appleBox1.compare(orangeBox));

        Box<Apple> appleBox2 = new Box<>();
        appleBox1.transferFruitsToAnotherBox(appleBox2);

        System.out.println("After transferring fruit from apple box 1 to apple box 2:");
        System.out.println("Weight of box 1 with apples: " + appleBox1.getWeight());
        System.out.println("Weight of box 2 with apples: " + appleBox2.getWeight());
    }
}
