package school.lesson7;

public class ProcessArray {
    public int sumOfArrayElements(String[][] arr) throws MyArraySizeException, MyArrayDataException {
        int rows = 4;
        int columns = 4;

        for (String[] strings : arr) {
            if (arr.length != rows || strings.length != columns) {
                throw new MyArraySizeException("The array size is incorrect. Expected an array of size 4x4.");
            }
        }

        int sum = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                try {
                    sum += Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Incorrect data in cell [" + i + "][" + j + "]");
                }
            }
        }

        return sum;
    }
}
