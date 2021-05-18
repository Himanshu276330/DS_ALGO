package HARRY_2021;

import java.util.ArrayList;
import java.util.Scanner;

class MyGeneric<T1,T2>{  //T1 and T2 is like parameter i.e-Integer,String
    int val;
    private T1 t1;
    private T2 t2;

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public MyGeneric(int val, T1 t1, T2 t2) {
        this.t1 = t1;
        this.t2 = t2;
    }

    public T1 getT1() {
        return t1;
    }

    public void setT1(T1 t1) {
        this.t1 = t1;
    }

    public T2 getT2() {
        return t2;
    }

    public void setT2(T2 t2) {
        this.t2 = t2;
    }
}

public class CWH_110_GENERICS_IN_JAVA {
    public static void main(String[] args) {

        ArrayList arr=new ArrayList();
        arr.add("Himanshu");
        arr.add(87);
        arr.add(42);
        arr.add(45);
        arr.add(new Scanner(System.in));

        //int a=arr.get(2);            //Gives Error
        int a=(int)arr.get(2);        //uses of generic

        //array of only integer
        ArrayList<Integer> arr2=new ArrayList<>();
        arr2.add(87);
        arr2.add(42);
        arr2.add(45);
        int a2=arr2.get(2);

        MyGeneric<Integer,String> mg=new MyGeneric(45,45,"Himanshu");
        String str=mg.getT2();
        Integer int2=mg.getT1();
        System.out.println(str);
        System.out.println(int2);
    }
}
