package lab2;

public class ParserDelays {
    private String[] mainString;

    public ParserDelays(String str){
        String[] string = str.split(",");
//        for (int i = 0; i < string.length; i++){
//            System.out.println("SUKA" + string[i] + "\n");
//        }
        for(int i = 0; i < string.length; i++){
            string[i] = string[i].stripLeading("s")
        }
        mainString = string;
    }

    public String getKey(){
        String res;
        if (mainString.length > 15 && !mainString[14].isEmpty())
            res = mainString[14];
        else
            res = "";

        System.out.println("ParserDel, Key"+res);
        return res;
    }

    public String getValue(){
        String res;
        if (mainString.length > 19 && !mainString[18].isEmpty())
            res = mainString[18];
        else
            res = "";

        System.out.println("ParserDel, Value"+res);
        return res;
    }

}
