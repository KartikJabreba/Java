import java.util.HashMap;

public class CharacterFrequency {
    public static void frequecny(String string){
        HashMap<Integer,Character> hashMap=new HashMap<>();
        char[] ch= new char[string.length()];
        for(int i=0;i<string.length();i++){
            hashMap.put(i,string.charAt(i));
        }

    }
    public static void main(String[] args){
        String string="qwertyuiop";
        frequecny(string);
    }
}
