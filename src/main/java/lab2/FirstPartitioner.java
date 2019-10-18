package lab2;
import org.apache.hadoop.mapreduce.lib.partition.HashPartitioner;
import org.apache.hadoop.io.Text;


public class FirstPartitioner extends HashPartitioner<TextPair, Text>{
    @Override
    public int getPartition(Text key, Text value, int numReduceTasks){
        return (key.hashCode()&Integer.MAX_VALUE)% numReduceTasks;
    }
}
