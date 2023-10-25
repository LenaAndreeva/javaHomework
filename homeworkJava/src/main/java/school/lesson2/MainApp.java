package school.lesson2;

public class MainApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    // Task 1
    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    // Task 2
    public static void checkSumSign() {
        int a = 5;
        int b = 10;
        int c = a + b;

        if (c >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    // Task 3

    public static void printColor() {
        int value = 100;

        if(value <= 0) {
            System.out.println("Красный");
        }
        else if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    // Task 4

    public static void compareNumbers() {
        int a = 25;
        int b = 18;

        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

}
