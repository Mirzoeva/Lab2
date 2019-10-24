package lab2;

import java.io.IOException;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.io.LongWritable;

public class MapperAirports extends Mapper<LongWritable, Text, TextPair, Text> {
    @Override
    protected void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException {
        if (key.get() == 0) {
            return;
        }
        TextPair airportID = new TextPair(new ParserAirports(value.toString()).getKey(), "0");
        Text airportName = new Text(new ParserAirports(value.toString()).getValue());
        context.write(airportID, airportName);
    }
}
