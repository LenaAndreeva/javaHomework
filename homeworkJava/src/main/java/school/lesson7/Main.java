package school.lesson7;

public class Main {
    public static void main(String[] args) {
        String[][] array1 = {
                {"6", "17", "9", "1"},
                {"16", "3", "11", "13"},
                {"2", "12", "4", "14"},
                {"7", "15", "6", "5"}
        };

        String[][] array2 = {
                {"8", "19", "2", "5"},
                {"3"},
                {"2", "12", "4", "14"},
                {"5", "9", "17", "6"}
        };

        String[][] array3 = {
                {"6", "17", "9", "1"},
                {"16", "3", "11", "13"},
                {"2", "12", "4", "14"},
                {"7", "7", "6", "Hi"}
        };

        ProcessArray processArray = new ProcessArray();

        try {
            System.out.println("Sum of array elements: " + processArray.sumOfArrayElements(array1));
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            System.out.println("Sum of array elements: " + processArray.sumOfArrayElements(array2));
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            System.out.println("Sum of array elements: " + processArray.sumOfArrayElements(array3));
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }

}
