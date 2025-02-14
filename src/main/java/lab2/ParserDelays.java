package lab2;

import org.apache.hadoop.io.Text;

public class ParserDelays {
    private String[] mainString;
    private static final int ID_ROW = 14;
    private static final int DELAY_ROW = 18;

    public ParserDelays(String str){
        mainString = ParserUtils.splitCommas(str);
    }

    public ParserDelays(Text str){
        mainString = ParserUtils.splitCommas(str.toString());
    }

    public String getAirportID(){
        return mainString[ID_ROW];
    }

    public String getValue(){
        return mainString[DELAY_ROW];
    }

}
