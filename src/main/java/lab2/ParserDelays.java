package lab2;

public class ParserDelays {
    String[] mainString;

    public ParserDelays(String str){
        String[] string = str.split(",[\"]");
        mainString = string;
    }

    public String getKey(){
        if (mainString.length > 15 && !mainString[14].isEmpty())
            return mainString[14];
        else
            return String.valueOf(0.0);
    }

    public String getValue(){
        if (mainString.length > 19 && !mainString[18].isEmpty())
            return mainString[18];
        else
            return String.valueOf(0.0);
    }

}
