package lab2;
import jdk.internal.org.objectweb.asm.tree.analysis.Value;
import org.apache.hadoop.mapreduce.Partitioner;

import java.security.Key;

public class FirstPartitioner extends Partitioner<Key, Value> {
    public FirstPartitioner(){}
    @Override
    public int getPartition(Key key, Value value, int numReduceTasks){
        return (key.hashCode()&Integer.MAX_VALUE)% numReduceTasks;
    }

}
