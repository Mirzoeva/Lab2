package lab2;
import org.apache.hadoop.mapreduce.lib.partition.HashPartitioner;
import org.w3c.dom.Text;


public class FirstPartitioner extends HashPartitioner<FirstComparator, >{
    public int getPartition(Text key, Text value, int numReduceTasks){
        return (key.hashCode()&Integer.MAX_VALUE)% numReduceTasks;
    }
}
