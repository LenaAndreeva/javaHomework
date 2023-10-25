package school.lesson3;

import java.util.Arrays;

public class Task_10 {

    public static int[] makeArray(int len, int initialValue) {
        int[] arr = new int[len];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = initialValue;
        }
        return arr;
    }

    public static void main(String[] args) {

        System.out.println(Arrays.toString(makeArray(3, 7)));

    }
}
