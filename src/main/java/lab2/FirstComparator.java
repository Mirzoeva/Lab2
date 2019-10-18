package lab2;
import org.apache.hadoop.io.WritableComparator;

public class FirstComparator extends WritableComparator {
    public FirstComparator(){
        super(TextPair.class, true);
    }
    @Override
    public int compare(WritableComparable a, WritableComparable b){
        return a.compareTo(b);
    }
}
