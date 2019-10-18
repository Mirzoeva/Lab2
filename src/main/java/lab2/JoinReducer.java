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
        int correntTime;
        int maxTime = Integer.MIN_VALUE;
        int minTime = Integer.MAX_VALUE;
        int sum = 0;
        while (iter.hasNext()){
            String call = iter.next().toString();
            correntTime = Integer.parseInt(call);
            if (correntTime > maxTime)
                maxTime = correntTime;
            if (correntTime < minTime)
                minTime = correntTime;
            sum += correntTime;
            count++;
        }
        if (count != 0){
            Text result = new Text("Min: " + minTime + "Max: " + maxTime + "Average: " + (sum / count));
            context.write(key.getFirst(), result);
        }
    }
}
