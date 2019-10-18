package lab2;

import java.io.FileReader;
import java.util.Arrays;
import au.com.bytecode.opencsv.CSVReader;



public class MapperAiports {
    public static void main(String[] args) throws Exception {
        CSVReader reader = new CSVReader(new FileReader("/Users/umamirzoeva/Parallel/Lab2/src/main/resources/L_AIRPORT_ID.csv"), ',' , '"' , 0);
        String[] nextLine;
        while ((nextLine = reader.readNext()) != null) {
            if (nextLine != null) {
                String[] parts = Arrays.toString(nextLine).split( ",");
                Arrays.toString(parts).split("\\[");
                System.out.println(parts[0] + "   aiport   " + parts[1]);
                //System.out.println(Arrays.toString(nextLine));
            }
        }
    }
}
