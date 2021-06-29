package OOPS.L_27_Static_Class;

import OOPS.L_27_Static_Class.A.B;
import OOPS.L_27_Static_Class.A.C;

public class MainClass {

       //Static block ,that rum before Main function run
    static {
        System.out.println("In block 1");
    }
    static {
        System.out.println("In block 2");
    }
    public static void main(String[] args) {

        Person p=new Person();

//        A obj=new A();
//        B objB=obj.new B();     //B ka object create ke liye A ka obj banana must h

        C objC = new A.C();    //but C ka object create ke liye A ka obj banana must nahi  h

        System.out.println("IN Main");
    }

         //Static block ,that rum before Main function run, no matter it up or down
    static {
        System.out.println("In block 3");
    }
}
