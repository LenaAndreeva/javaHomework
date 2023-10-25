package school.lesson3;

public class Task_4 {

    public static void printTheString(String str, int num) {
        String result = "";
        for (int i = 0; i < num; i++) {
            result += str + "\n";
        }
        System.out.println(result);
    }

    public static void main(String[] args) {

        printTheString("Hi", 5);
    }
}
