package lab2;

public class ParserDelays {
    String[] mainString;

    public ParserDelays(String str){
        String[] string = str.split(",");
        for (int i = 0; i < str.length(); i++){
            string[i] = string[i].replaceAll("\"", "");
        }
        mainString = string;
    }

    public String getKey(){
        return mainString[];
    }

}
