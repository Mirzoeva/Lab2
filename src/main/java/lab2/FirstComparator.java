package lab2;

import org.apache.hadoop.io.WritableComparator;

public class FirstComparator extends WritableComparator {
    public FirstComparator 
    public int compare(TextPair a, TextPair b){
        return a.compareTo(b);
    }
}
