package school.lesson3;

public class Task_1 {

    public static boolean numBetween10and20(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }

    public static void main(String[] args) {

        System.out.println(numBetween10and20(5, 5));

    }

}
