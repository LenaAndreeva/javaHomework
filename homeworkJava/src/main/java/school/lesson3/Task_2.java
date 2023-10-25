package school.lesson3;

public class Task_2 {

    public static String positiveOrNegativeNum(int a) {

        if (a >= 0) {
            return "Число положительное";
        } else {
            return "Число отрицательное";
        }
    }

    public static void main(String[] args) {

        System.out.println(positiveOrNegativeNum(-10));
    }
}
