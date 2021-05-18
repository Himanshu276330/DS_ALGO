package HARRY_2021;

class A{
    public int a;
    public int harry(){
        return 4;
    }
    public void meth2(){
        System.out.println("I am method 2 of class A");
    }
    public void meth2(int a){       //this is method overloading
        System.out.printf("I am overloaded method 2 of class A, value of integer=%d\n",a);
    }
}
class B extends A{
    @Override      //with out this there is no error it only denote about overriding
    public void meth2(){
        System.out.println("I am method 2 of class B");
    }
    @Override
    public void meth2(int a){
        System.out.printf("I am  overloaded method 2 of class B, value of integer=%d \n",a);
    }
    public  void meth3(){
        System.out.println("I am method 3 of class B");
    }
}

public class CWH_48_METHOD_OVERRIDING {
    public static void main(String[] args) {

        A a=new A();
        a.meth2(4);
        B b=new B();
        b.meth2();
        b.meth2(5);
        b.meth3();

    }
}
