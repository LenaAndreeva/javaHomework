package school.lesson3;

import java.util.Arrays;

public class Task_6_7_8_9 {
    public static void main(String[] args) {

        //Task 6

        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};

        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
        }
        System.out.println(Arrays.toString(arr));


        // Task 7

        int[] arr1 = new int[100];

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = i + 1;
        }
        System.out.println(Arrays.toString(arr1));


        // Task 8

        int[] arr2 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] < 6) {
                arr2[i] *= 2;
            }
        }
        System.out.println(Arrays.toString(arr2));


        // Task 9

        int x = 4;
        int[][] arr3 = new int [x][x];

        for (int i = 0; i < arr3.length; i++) {
            for (int j = 0; j < arr3.length; x = arr3[i].length, j++, x--) {
                if (i == j || i == x - j) {
                    arr3[i][j] = 1;
                } else {
                    arr3[i][j] = 0;
                }
                System.out.println(arr3[i][j] + "\t");
            }
            System.out.println();
        }

    }
}
