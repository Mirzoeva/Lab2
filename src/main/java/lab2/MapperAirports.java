package lab2;

import java.io.IOException;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.io.LongWritable;

public class MapperAirports extends Mapper<LongWritable, Text, TextPair, Text> {
    @Override
    protected void map(LongWritable stringNumber, Text textIn, Context context) throws IOException, InterruptedException {
        if (stringNumber.get() == 0 || textIn.toString().isEmpty()) {
            return;
        }
        TextPair airportID = new TextPair(new ParserAirports(textIn).getAirportID(), "0");
        Text airportName = new Text(new ParserAirports(textIn).getValue());
        context.write(airportID, airportName);
    }
}
