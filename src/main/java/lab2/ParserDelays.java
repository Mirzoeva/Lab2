package lab2;

public class ParserDelays {
    String[] mainString;

    public ParserDelays(String str){
        String[] string = str.split(",[\"]");
        mainString = string;
    }

    public String getKey(){
        return mainString[14];
    }

    public String getValue(){
        if (mainString.length > 19 && !mainString[18].isEmpty())
            return mainString[18];
        else
            return String.valueOf(0.0);
    }

}
