package CollectionFramework.L_46_Sets;

import java.util.*;

public class MainClass {
    public static void main(String[] args) {

//        Set<String> fruits=new HashSet<>();
//
//            //add() Function also return boolean , return true if add, return false if not add for duplicate element [repeated]
//        fruits.add("Apple");
//        fruits.add("Banana");
//        System.out.println(fruits.add("Kiwi"));
//
//            //Duplicate element not add
//        System.out.println(fruits.add("Banana"));
//
//             //Ordered is not in sorted form or not add symmetric
//             //Order of input-->["Apple" , "Banana" , "Kiwi" ]
//        System.out.println(fruits);
//            //Order of output-->[Apple, Kiwi, Banana]




                    //Because it use LinkedList so time complexity is linear nor constant like set. but it add item in sequence
//        Set<String> fruits2=new LinkedHashSet<>();
//
//            //add() Function also return boolean , return true if add, return false if not add for duplicate element [repeated]
//        fruits2.add("Apple");
//        fruits2.add("Banana");
//        System.out.println(fruits2.add("Kiwi"));
//
//            //Duplicate element not add
//        System.out.println(fruits2.add("Banana"));
//
//             //Ordered is in sorted form or add symmetric or sequence
//             //Order of input-->["Apple" , "Banana" , "Kiwi" ]
//        System.out.println(fruits2);
//            //Order of output-->[Apple, Banana, Kiwi]




//        // time complexity is constant like set , and also addition is sequence
//          Set<String> fruits3=new TreeSet<>();
//
//            //add() Function also return boolean , return true if add, return false if not add for duplicate element [repeated]
//        fruits3.add("Apple");
//        fruits3.add("Banana");
//        System.out.println(fruits3.add("Kiwi"));
//
//            //Duplicate element not add
//        System.out.println(fruits3.add("Banana"));
//
//             //Ordered is in sorted form or add symmetric or sequence
//             //Order of input-->["Apple" , "Banana" , "Kiwi" ]
//        System.out.println(fruits3);
//            //Order of output-->[Apple, Banana, Kiwi]


        Set<Integer> x=new TreeSet<>();
        x.add(23);
        x.add(1);
        x.add(6);

        Set<Integer> y=new TreeSet<>();
        y.add(3);
        y.add(1);
        y.add(16);

//        x.addAll(y);   //It is of type union , It find [x union y].
//        System.out.println(x);

//        x.retainAll(y);  //It is of type interSection ,It find [x intersection y].
//        System.out.println(x);

        System.out.println(x.containsAll(y));  //Kaya , in x all y present or not

    }
}
