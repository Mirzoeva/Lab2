package lab2;

public class Parser {
    String[] mainString;

    public Parser(String str){
        String[] string = str.split(",");
        for (int i = 0; i < str.length(); i++){
            string[i] = string[i].replaceAll("\"", "");
        }
        mainString = string;
    }

    public String getKey(){
        return mainString[0];
    }

    public String getValue(){
        return mainString[1];
    }

}