package lab2;

import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import au.com.bytecode.opencsv.CSVReader;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.io.LongWritable;

public class SystemsJoinMapper extends Mapper<LongWritable, Text, TextPair, Text> {
    @Override
    protected void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException {
        SystemInfo system = new SystemInfo(value);
        context.write(new TextPair(system.getSystemCode().toString(),"0"), new Text(system.toString()));
    }
}

public class MapperAiports extends Mapper<LongWritable, Text, TextPair, Text> {
    @Override
    protected void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException {
        ServiceCall call = new ServiceCall(value);
        context.write(new TextPair(call.getSystemA().toString(),"1"),
                new Text(call.toString()));
    }
}

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
