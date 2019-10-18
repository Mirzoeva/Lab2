package lab2;

public class Parser {
    String[] mainString;

    public Parser(String str){
        String[] string = str.split((",[\"]"));
        mainString = string;
    }

    public String getKey(){
        if (mainString[0] != "")
            return mainString[0];
        return "0";
    }

    public String getValue(){
        if (mainString[1] != "")
            return mainString[1];
        return "0";
    }

}