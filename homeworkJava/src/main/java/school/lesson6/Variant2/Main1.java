package school.lesson6.Variant2;

import java.io.*;
public class Main1 {
        public static void main(String[] args) throws IOException {

            BufferedReader br = null;

            AppData1 appData = new AppData1();
            String spr = ";";
            String spr1 = "\n";

            try {
                File file = new File("newFile1.csv");

                if (!file.exists())
                    file.createNewFile();

                PrintWriter pw = new PrintWriter(file);

                pw.print(appData.getHeader()[0] + spr);
                pw.print(appData.getHeader()[1] + spr);
                pw.print(appData.getHeader()[2] + spr1);

                pw.print(appData.getData()[0][0] + spr);
                pw.print(appData.getData()[1][0] + spr);
                pw.print(appData.getData()[2][0] + spr1);

                pw.print(appData.getData()[0][1] + spr);
                pw.print(appData.getData()[1][1] + spr);
                pw.print(appData.getData()[2][1]);

                pw.close();

                br = new BufferedReader(new FileReader("newFile1.csv"));
                String line;
                while ((line = br.readLine()) != null) {
                    System.out.println(line);
                }

            } catch (IOException e) {
                System.out.println("Error " + e);

            } finally {
                try {
                    br.close();
                } catch (IOException e) {
                    System.out.println("Error " + e);
                }
            }
        }
    }
