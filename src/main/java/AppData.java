import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
public class AppData {
    private String[] header;
    private int[][] data;

    void writeToFile() {
        File csvOutputFile = new File("file.csv");
        try (PrintWriter pw = new PrintWriter(csvOutputFile)) {
            for (String str : header)
                pw.print(str + ";");
            pw.println();
            for (int i = 0; i < data.length; i++) {
                for (int j = 0; j < data[i].length; j++) {
                    pw.print(data[i][j] + ";");
                }
                if (i != data.length - 1)
                    pw.println();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    void print() {
        for (String head : header) {
            System.out.print(head + " ");
        }
        System.out.println();

        for (int[] datum : data) {
            for (int i : datum) {
                System.out.print(i + " ");
            }

            System.out.println();
        }
    }

    public void readToFile() {
        List<List<String>> records = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("file.csv"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(";");
                records.add(Arrays.asList(values));
            }

            String[] header2 = new String[records.get(0).size()];
            for (int i = 0; i < records.get(0).size(); i++) {
                header2[i] = records.get(0).get(i);
            }

            int[][] mas2 = new int[records.size() - 1][];
            for (int i = 0; i < mas2.length; i++) {
                List<String> list = records.get(i + 1);
                mas2[i] = new int[list.size()];
                for (int j = 0; j < mas2[i].length; j++) {
                    mas2[i][j] = Integer.parseInt(list.get(j));
                }
            }

            this.header = header2;
            this.data = mas2;
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}