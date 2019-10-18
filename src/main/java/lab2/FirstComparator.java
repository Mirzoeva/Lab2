package lab2;

import org.apache.hadoop.io.Text;

public class FirstComparator extends Text.Comparator {
    public FirstComparator(){
        super(TextPair.class, true);
    }
    @Override
    public int compare(TextPair a, TextPair b){
        return a.compareTo(b);
    }
}
