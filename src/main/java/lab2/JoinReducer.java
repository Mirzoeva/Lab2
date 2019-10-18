package lab2;

import org.apache.hadoop.mapreduce.Reducer;
import org.w3c.dom.Text;

import java.io.IOException;
import java.util.Iterator;

public class JoinReducer extends Reducer<TextPair, Text, Text, Text> {
    @Override
    protected void reduce(TextPair key, Iterable<Text> values, Context context) throws IOException, InterruptedException{
        Iterator<Text> iter = values.iterator();
        long count = 0;
        Float correntTime;
        Float maxTime = Float.MIN_VALUE;
        Float minTime = Float.MAX_VALUE
        while (iter.hasNext()){
            String call = iter.next().toString();
            Text outValue = new Text(call.toString() + "\t" + systemInfo.toString());
        }
        context.write(key.getFirst(), outValue);
    }
}
