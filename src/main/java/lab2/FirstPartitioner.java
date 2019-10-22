package lab2;
import org.apache.hadoop.mapreduce.Partitioner;
import org.apache.hadoop.io.Text;


public class FirstPartitioner extends Partitioner<TextPair, Text>{
    @Override
    public int getPartition(TextPair key, Text value, int numReduceTasks){
        return key.getFirst().hashCode() % numReduceTasks;
    }
}
