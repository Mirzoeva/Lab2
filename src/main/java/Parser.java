import java.io.FileReader;
import java.util.Arrays;
import au.com.bytecode.opencsv.CSVReader;


public class Parser {
    @SuppressWarnings("resource")
    public static void main(String[] args) throws Exception {
        CSVReader reader = new CSVReader(new FileReader("/Users/umamirzoeva/Parallel/Lab2/src/main/resources/L_AIRPORT_ID.csv"), ',' , '"' , 0);
        //Read CSV line by line and use the string array as you want
        String[] nextLine;
        while ((nextLine = reader.readNext()) != null) {
            if (nextLine != null) {

                String[] parts = Arrays.toString(nextLine).split( ",");
                Arrays.toString(parts).split(Pattern.quote("], ["))
                System.out.println(parts[0] + "   aiport   " + parts[1]);
                //System.out.println(Arrays.toString(nextLine));
            }
        }
//        CSVReader reader2 = new CSVReader(new FileReader("/Users/umamirzoeva/Parallel/Lab2/src/main/resources/664600583_T_ONTIME_sample.csv"), ',' , '"' , 0);
//        //Read CSV line by line and use the string array as you want
//        String[] nextLine2;
//        while ((nextLine2 = reader2.readNext()) != null) {
//            if (nextLine2 != null) {
//                //Verifying the read data here
//                System.out.println(Arrays.toString(nextLine2));
//            }
//        }
    }
}
