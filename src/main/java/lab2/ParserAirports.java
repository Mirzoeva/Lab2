package lab2;

public class ParserAirports {
    private String[] mainString;
    private static final int ID_ROW = 0;
    private static final int NAME_ROW = 1;

    public ParserAirports(String str){
        mainString = ParserUtils.splitAll(str);
    }

    public String getKey(){
        return mainString[ID_ROW];
    }

    public String getValue(){
        return mainString[NAME_ROW];
    }

}