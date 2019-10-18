package lab2;

import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import au.com.bytecode.opencsv.CSVReader;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.io.LongWritable;

public class MapperAiports extends Mapper<LongWritable, Text, TextPair, Text> {
    @Override
    protected void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException {
        SystemInfo system = new SystemInfo(value);
        context.write(new TextPair(system.getSystemCode().toString(),"0"), new Text(system.toString()));
    }
}
