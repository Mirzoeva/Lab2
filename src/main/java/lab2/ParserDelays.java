package lab2;

public class ParserDelays {
    private String[] mainString;

    public ParserDelays(String str){
        String[] string = str.split(",[\"]");
//        for (int i = 0; i < string.length; i++){
//            System.out.println("SUKA" + string[i] + "\n");
//        }
        mainString = string;
    }

    public String getKey(){
        if (mainString.length > 15 && !mainString[14].isEmpty())
            return mainString[14];
        else
            return "";
    }

    public String getValue(){
        if (mainString.length > 19 && !mainString[18].isEmpty())
            return mainString[18];
        else
            return "";
    }

}
