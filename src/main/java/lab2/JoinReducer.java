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
        Float minTime = Float.MAX_VALUE;
        Float sum = 0.00f;
        while (iter.hasNext()){
            String call = iter.next().toString();
            correntTime = Float.parseFloat(call);
            if (correntTime > maxTime)
                maxTime = correntTime;
            if (correntTime < minTime)
                minTime = correntTime;
            sum += correntTime;
            count++;
        }
        if (count != 0){
            context.write(key.getFirst(), new Text());
        }
    }
}
