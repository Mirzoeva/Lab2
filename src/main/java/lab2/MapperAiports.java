package lab2;

import java.io.IOException;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.io.LongWritable;

public class MapperAiports extends Mapper<LongWritable, Text, TextPair, Text> {
    @Override
    protected void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException {
        TextPair aiport = new TextPair(new Parser(value.toString()).getKey(), "0");
        context.write(aiport, new Text(new Parser(value.toString()).getValue()));
    }
}
