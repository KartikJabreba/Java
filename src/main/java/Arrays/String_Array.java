package Arrays;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class String_Array {
    public static void main(String[] args) {
        String[] name = {"Kartik", "Aman", "Risabh"};
        HashMap<String,Integer> age=new HashMap<>();
        age.put(name[0],24);
        age.put(name[1],25);
        age.put(name[2],26);
        System.out.println(age.get(24));

    }



}
