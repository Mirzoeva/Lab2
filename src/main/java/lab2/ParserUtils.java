package lab2;

public class ParserUtils {
    public static String[] splitAll(String str){
        String[] string = str.split(",[\"]");
        for (int i = 0; i < string.length; i++){
            string[i] = string[i].replaceAll("\"", "");
        }
        return string;
    }

    public static String[] splitCommas(String str){ return str.split(","); }
}
