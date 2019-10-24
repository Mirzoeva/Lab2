package lab2;

import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

import java.io.IOException;

public class MapperDelays extends Mapper<LongWritable, Text, TextPair, Text> {
    @Override
    protected void map(LongWritable stringNumber, Text textIn, Context context) throws IOException, InterruptedException {
        if (stringNumber.get() == 0 || textIn.toString().isEmpty()) {
            return;
        }
        String timeString = new ParserDelays(textIn.toString()).getValue();
        if (timeString.isEmpty()){
            return;
        }
        float timeFloat = Float.parseFloat(timeString);
        Text timeText = new Text(String.valueOf(timeFloat));
        TextPair airportID = new TextPair(new Text(new ParserDelays(textIn.toString()).getKey()), new Text("1"));
        if (timeFloat > 0){
            context.write(airportID, timeText);
        }
    }
}
