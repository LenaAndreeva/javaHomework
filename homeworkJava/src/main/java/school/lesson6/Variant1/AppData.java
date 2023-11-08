package school.lesson6.Variant1;

import java.io.*;
public class AppData {
    private String[] header;
    private int[][] data;

    public void setHeader(String[] header) {
        this.header = header;
    }

    public void setData(int[][] data) {
        this.data = data;
    }

    public String[] getHeader() {
        return header;
    }

    public int[][] getData() {
        return data;
    }

    // methods

    public void saveFile(String filename) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(filename, false))) {

            for (int i = 0; i < header.length; i++) {
                writer.print(header[i]);
                if (i < header.length - 1) {
                    writer.print(";");
                }
            }
            writer.println();

            for (int[] row : data) {
                for (int i = 0; i < row.length; i++) {
                    writer.print(row[i]);
                    if (i < row.length - 1) {
                        writer.print(";");
                    }
                }
                writer.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void loadFile(String filename) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {

            String headerLine = reader.readLine();
            header = headerLine.split(";");
            data = new int[linesCount(filename) - 1][header.length];

            String line;
            int rowIndex = 0;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(";");
                int[] rowData = new int[header.length];
                for (int i = 0; i < header.length; i++) {
                    rowData[i] = Integer.parseInt(parts[i]);
                }
                data[rowIndex] = rowData;
                rowIndex++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private int linesCount(String filename) throws IOException {
        int lines = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            while (reader.readLine() != null) {
                lines++;
            }
        }
        return lines;
    }
}
