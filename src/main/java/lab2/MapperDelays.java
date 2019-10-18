package lab2;

import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

import java.io.IOException;

public class MapperDelays extends Mapper<LongWritable, Text, TextPair, Text> {
    @Override
    protected void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException {
        String time = new ParserDelays(value.toString()).getValue();
        TextPair delay = new TextPair(new Text(new ParserDelays(value.toString()).getKey()), new Text("1"));
        context.write(delay, new Text();
    }
}
