package school.lesson5.Figures;

public class MainApp {
    public static void main(String[] args) {
        Circle circle1 = new Circle(5, "Red", "Black");
        circle1.info();

        System.out.println();

        Rectangle rectangle1 = new Rectangle(5, 7, "Blue", "Yellow");
        rectangle1.info();

        System.out.println();

        Triangle triangle1 = new Triangle(5,5, 8, "Pink", "Green");
        triangle1.info();
    }
}
