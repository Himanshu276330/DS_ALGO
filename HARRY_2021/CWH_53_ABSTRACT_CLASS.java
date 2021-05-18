package HARRY_2021;

abstract class Parents2{      //we not make object for it because it is a abstract class
    Parents2(){
        System.out.println("Mai parents2 ka constructor hu");
    }
    public void sayHello(){
        System.out.println("Hello");
    }
    abstract public void greet();
    abstract public void greet2();
}
class Child2 extends Parents2{
    @Override
    public void greet(){
        System.out.println("Good Morning");
    }
    @Override
    public void greet2(){
        System.out.println("Good After Noon");
    }
}
abstract class Child3 extends Parents2{
    public void th(){
        System.out.println("I am good");
    }

}

public class CWH_53_ABSTRACT_CLASS {
    public static void main(String[] args) {

        //Parents2 p=new Parents2();  ---> thrown error because it is a abstract class
        Child2 c=new Child2();
        //Child3 c1=new Child2();    ---> thrown error because it is also a abstract class
        c.greet();
        c.greet2();
    }
}
