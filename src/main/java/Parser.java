import java.io.FileReader;
import java.util.Arrays;
import au.com.bytecode.opencsv.CSVReader;
at java.util.regex.Pattern.error(Pattern.java:1924)
        at java.util.regex.Pattern.clazz(Pattern.java:2493)
        at java.util.regex.Pattern.sequence(Pattern.java:2030)
        at java.util.regex.Pattern.expr(Pattern.java:1964)
        at java.util.regex.Pattern.compile(Pattern.java:1665)
        at java.util.regex.Pattern.<init>(Pattern.java:1337)
        at java.util.regex.Pattern.compile(Pattern.java:1022)


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
