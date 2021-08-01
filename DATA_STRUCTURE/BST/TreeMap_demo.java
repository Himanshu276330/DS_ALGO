package DATA_STRUCTURE.BST;

import java.util.Map;
import java.util.TreeMap;

public class TreeMap_demo {
    public static void main(String[] args) {
    //Implementing red Black self Balancing tree.

        TreeMap<Integer,String> map=new TreeMap<>();
        map.put(10,"geeks");
        map.put(15,"ide");
        map.put(5,"courses");
        map.put(100,"delete");
        System.out.println(map);
        System.out.println(map.containsKey(10));
        System.out.println(map.ceilingEntry(10));

        for(Map.Entry<Integer,String> e:map.entrySet()){
            System.out.println(e.getKey()+" "+e.getValue());
        }

        System.out.println(map.remove(100));

        System.out.println(map.higherKey(5));
        System.out.println(map.higherEntry(5));
        System.out.println(map.higherEntry(5).getValue());
        System.out.println(map.higherEntry(5).getClass());

        System.out.println(map.lowerKey(10));
        System.out.println(map.lowerEntry(10));

        System.out.println(map.floorKey(12));
        System.out.println(map.floorEntry(12));

        System.out.println(map.ceilingKey(12));
        System.out.println(map.ceilingEntry(12));



    }
}
