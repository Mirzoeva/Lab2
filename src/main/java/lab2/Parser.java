package lab2;

public class Parser {
    String[] mainString;

    public Parser(String str){
        String[] string = str.split(",[\"]");
        mainString = string;
    }

    public String getKey(){
        if (mainString.length >= 1 && !mainString[0].isEmpty())
            return mainString[0];
        else
            return String.valueOf(0.0);
    }

    public String getValue(){
        if (mainString.length >= 1 && !mainString[1].isEmpty())
            return mainString[1];
        else
            return String.valueOf(0.0);
    }

}