package CollectionFramework.L_48_Hash_Map;

import java.util.*;
import java.util.Map.Entry;


public class MainClass {
    public static void main(String[] args) {

        Map<String,Integer> no=new  HashMap<>();
        no.put("one",1);
        no.put("two",2);
        no.put("three",3);

        no.put("one",10);
        System.out.println(no.put("two",20));
        System.out.println(no.putIfAbsent("three",30));

        System.out.println(no);
//        System.out.println(no.get("four"));
//        System.out.println(no.getOrDefault("four",40));
//        System.out.println(no.getOrDefault("one",40));

        Set<Entry<String,Integer>> entries =no.entrySet();

        for(Entry<String ,Integer> entry:entries){
            System.out.println(entry);
            entry.setValue(entry.getValue()*100);
        }
        System.out.println(no);

        System.out.println(no.values());

//        System.out.println(getHash("cat"));
//        System.out.println(getHash("Cat"));
//        System.out.println(getHash("CAT"));
//        System.out.println(getHash("DOG"));
//        System.out.println(getHash("BALL"));
//        System.out.println(getHash("GOD"));

    }
      //Creating our own hash function not so effective but ok
    public static int getHash(String s){
        int hash=0;
        for (int i=0;i<s.length();i++){
            hash+=s.charAt(i);
        }
        return hash;
    }
}
