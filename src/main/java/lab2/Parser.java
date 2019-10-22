package lab2;

public class Parser {
    private String[] mainString;

    public Parser(String str){
        System.out.println("-------------------------------");
        String[] string = str.split(",[\"]");
        for (int i = 0; i < string.length; i++){
            string[i] = string[i].replaceAll("\"", "");
            System.out.println("SUKA" + string[i] + "\n");
        }
        mainString = string;
        System.out.println("__________________________________________");

    }

    public String getKey(){
        System.out.println("Parser, Key"+mainString[0]);
        return mainString[0];
    }

    public String getValue(){
        System.out.println("Parser, Value"+mainString[1]);
        return mainString[1];
    }

}