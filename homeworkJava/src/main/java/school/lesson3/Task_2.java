package school.lesson3;

public class Task_2 {

    public static String task2(int a) {

        if (a >= 0) {
            return "Число положительное";
        } else {
            return "Число отрицательное";
        }
    }

    public static void main(String[] args) {

        System.out.println(task2(-10));
    }
}
