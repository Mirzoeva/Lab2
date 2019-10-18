package lab2;

import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

import java.io.IOException;

public class MapperDelays extends Mapper<LongWritable, Text, TextPair, Text> {
    @Override
    protected void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException {
        TextPair delay = new TextPair(new ParserDelays(value.toString()).getKey(), 1);
        context.write(delay, new ParserDelays(value.toString()).getValue());
    }
}
