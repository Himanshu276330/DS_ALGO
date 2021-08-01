package DATA_STRUCTURE.CollectionFramework.L_37_39_40_41_Lists.L_37_ArrayList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class L_37_MyArrayList {
    public static void main(String[] args) {

//        ArrayList fruits = new ArrayList();
//        fruits.add("Apple");
//        fruits.add(23);
//        System.out.println(fruits);

            //With Generic
        ArrayList<String> fruits2 = new ArrayList<>();
        fruits2.add("Apple");
        fruits2.add("Mango");
//        //fruits2.add(23);           //Give compile time error , because it is a DATA_STRUCTURE.String type ArrayList
//        System.out.println(fruits2);
//        System.out.println(fruits2.get(0));

        //Also created as
        List<Integer> marks=new ArrayList<>();
        List<Integer> mark2=new LinkedList<>();
        marks.add(45);
        marks.add(12);
        marks.add(98);

//        System.out.println(marks.get(0));

//        mark2.add(56); mark2.add(23); mark2.add(87);
           //Find length of arraylist.
        System.out.println(marks.size());

             //Index 0 se add hoga
//        marks.addAll(0,mark2);
//        System.out.println(marks);
//        marks.addAll(2,mark2);
//        System.out.println(marks);
//          //Default end se add karega
//        marks.addAll(mark2);
//        System.out.println(marks);
//
//        System.out.println(marks.get(5));
//
//        marks.set(2,458);
//        System.out.println(marks);
//
//        marks.remove(2);
//        System.out.println(marks);
//
//        marks.removeAll(mark2);
//        System.out.println(marks);
//
//        System.out.println(marks.size());
//
//        System.out.println(marks.contains(98));
//
//        Integer[] temp =new Integer[marks.size()];
//        int [] temp2 =new int[marks.size()];
//        marks.toArray(temp);
////        marks.toArray(temp2);      //This gives error ,don't know
//        for (int e:temp){
//            System.out.print(e+" ");
//        }
//        System.out.println();

              //It also used for ArrayList
//        for (int e:marks){
//            System.out.print(e+" ");
//        }


           //Creating our own generic
//        L_37_Pair<DATA_STRUCTURE.String ,Integer> p1=new L_37_Pair<>("Himanshu",21);
//        System.out.println(p1.x);
//        System.out.println(p1.y);
//        p1.getDescription();


//        L_37_Pair<Boolean,Double> p2=new L_37_Pair<>(false,21.2);
//        System.out.println(p2.x);
//        System.out.println(p2.y);
//        p2.getDescription();



     }
}
