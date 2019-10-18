package lab2;

import org.apache.hadoop.io.WritableComparator;

public class FirstComparator extends WritableComparator {
    @Override
    public int compare(TextPair a, TextPair b){
        return a.compareTo(b);
    }
}
