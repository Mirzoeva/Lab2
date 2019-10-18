package lab2;

import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

import java.io.IOException;

public class MapperDelays extends Mapper<LongWritable, Text, TextPair, Text> {
    @Override
    protected void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException {
        if (key.get() == 0) {
            return;
        }
        if (value.toString().isEmpty()){
            return;
        }
        float time = Float.parseFloat(new ParserDelays(value.toString()).getValue());
        System.out.println(time);
        TextPair delay = new TextPair(new Text(new ParserDelays(value.toString()).getKey()), new Text("1"));
        if (time > 0){
            context.write(delay, new Text(String.valueOf(time)));
        }
    }
}
