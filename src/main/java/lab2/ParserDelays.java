package lab2;

public class ParserDelays {
    private String[] mainString;
    private static final int ID_ROW = 14;
    private static final int DELAY_ROW = 18;

    public ParserDelays(String str){
        mainString = ParserUtils.splitCommas(str);
    }

    public String getKey(){
        return mainString[ID_ROW];
    }

    public String getValue(){
        return mainString[DELAY_ROW];
    }

}
