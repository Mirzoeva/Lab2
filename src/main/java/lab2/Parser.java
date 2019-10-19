package lab2;

public class Parser {
    private String[] mainString;

    public Parser(String str){
        System.out.println("-------------------------------");
        String[] string = str.split(",[\"]");
        for (int i = 0; i < string.length; i++){
            System.out.println("SUKA" + string[i] + "\n");
        }
        mainString = string;
        System.out.println("__________________________________________");

    }

    public String getKey(){
            return mainString[0];
    }

    public String getValue(){
            return mainString[1];
    }

}