package DATA_STRUCTURE.CollectionFramework.L_37_39_40_41_Lists.L_41_Stack_Vector;

import java.util.Vector;

public class Vector_Class {
    public static void main(String[] args) {

        //method is just same as ArrayList but it method is Synchronised{Thread safe }
        Vector<Integer> v=new Vector<>();
        v.add(45);
        v.add(98);
        System.out.println(v);
    }
}
