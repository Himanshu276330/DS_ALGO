package HARRY_2021;

class Base1{
    Base1(){
        System.out.println("I am a constructor ");
    }
    Base1(int a){
        System.out.printf("I am a overLoaded constructor ,value of a=%d :",a);
        System.out.println();
    }
}
class derived1 extends Base1{
    derived1(){
        //super(0);
        System.out.println("I am a derived constructor");
    }
    derived1(int x, int y){
        super(x);
        System.out.printf("I am a overLoaded constructor of derived class  ,value of x=%d and value of y=%d \n",x,y);
    }
}
class childOfDerived1 extends derived1{
    childOfDerived1(){
        System.out.println("I am a childOfDerived constructor ");
    }
    childOfDerived1(int x,int y, int z){
        super(x,y);
        System.out.printf("I am a overLoaded constructor of childOfDerived class  ,value of x=%d and value of y=%d and value of z=%d \n",x,y,z);
    }
}

public class CWH_46_CONSTRUCTOR_IN_INHERITANCE {
    public static void main(String[] args) {

        Base1 b=new Base1();
        derived1 d =new derived1();
        derived1 d2 =new derived1(5,6);
        childOfDerived1 cd=new childOfDerived1();
        childOfDerived1 cd1=new childOfDerived1(12,45,54);



    }
}
