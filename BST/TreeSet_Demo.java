package BST;

import java.util.*;

public class TreeSet_Demo {
    public static void main(String[] args) {
        //TreeSet_Demo is the application of self balancing BST..

        Set<String> set=new TreeSet<>();
        set.add("gfg");
        set.add("courses");
        set.add("ide");
        System.out.println(set.add("himanshu"));

        System.out.println(set.contains("ide"));
        System.out.println(set);

        Iterator<String> it= set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        for (String s : set) {
            System.out.println(s);
        }



        TreeSet<Integer> set2=new TreeSet<>();
        set2.add(10);
        set2.add(5);
        set2.add(2);
        set2.add(15);

        System.out.println(set2.lower(5));
        System.out.println(set2.higher(5));
        System.out.println(set2.floor(5));
        System.out.println(set2.ceiling(5));
        System.out.println(set2.floor(1));

        System.out.println(set2.first());
        System.out.println(set2.last());
    }
}
