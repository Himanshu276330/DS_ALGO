package OOPS.packages;

import OOPS.packages.A.B;
import OOPS.packages.A.C;

public class L_27_Static_keyword{

    static {
        System.out.println("In block 1");
    }
    static {
        System.out.println("In block 2");
    }
    public static void main(String[] args) {

        System.out.println("In Main");

        A objA=new A();
        B objB= objA.new B();

        C objC=new A.C();
    }
    static {
        System.out.println("In block 3");
    }
}
