package CollectionFramework.L_50_Group_Anagram_Question;

import java.util.*;

public class MainClass {
    public static void main(String[] args) {

        String []input={"eat" , "tea", "tan", "ate", "nat", "bat"};

        Map<String,List<String>> map=new HashMap<>();
        for(String s:input) {
            char []charArray =s.toCharArray();
            Arrays.sort(charArray);
            String sorted=new String(charArray);

            if (!map.containsKey(sorted)){
                map.put(sorted,new LinkedList<String>());
            }
            map.get(sorted).add(s);
        }
        System.out.println(map);
        System.out.println(map.values());
//        LinkedList<List<String>> li=new LinkedList<>(map.values());
//        System.out.println(li);




    }

}
