package lab2;

public class Parser {
    private String[] mainString;

    public Parser(String str){
        String[] string = str.split("\"");
        for (int i = 0; i < cols.length; i++){
            cols[i] = cols[i].replaceAll("\"", "");
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