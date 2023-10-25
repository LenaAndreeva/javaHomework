package school.lesson3;

public class Task_5 {

    public static boolean leapYearOrNot(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }

    public static void main(String[] args) {

        System.out.println(leapYearOrNot(2024));
    }
}
