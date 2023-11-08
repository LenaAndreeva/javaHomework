package school.lesson6.Variant1;

import school.lesson6.Variant1.AppData;

public class Main {
    public static void main(String[] args) {

        AppData appData = new AppData();

        appData.setHeader(new String[]{"Value 1", "Value 2", "Value 3"});
        appData.setData(new int[][] {{100, 200, 123}, {300, 400, 500}});

        appData.saveFile("newFile.csv");
        appData.loadFile("newFile.csv");

        System.out.println(String.join("; ", appData.getHeader()));

        for (int[] row : appData.getData()) {
            for (int i = 0; i < row.length; i++) {
                System.out.print(row[i]);
                if (i < row.length - 1) {
                    System.out.print("; ");
                }
            }
            System.out.println();
        }
    }
}
