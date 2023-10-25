package school.lesson3;

public class Task_1 {

    public static boolean task1(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }

    public static void main(String[] args) {

        System.out.println(task1(5, 5));

    }

}
