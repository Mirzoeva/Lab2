package lab2;
import org.apache.hadoop.io.WritableComparable;
import org.apache.hadoop.io.WritableComparator;
import org.apache.hadoop.io.Text;

public class FirstComparator extends WritableComparator {
    public FirstComparator(){
        super(TextPair.class, true);
    }
    public int compare(TextPair a, TextPair b){
        return a.compareTo(b);
    }
}
