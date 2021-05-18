package OOPS.L_28_INHERITANCE;

public class Person {
    protected String name;         //it is accessed by child class
    protected Person(String name){
        this.name=name;
        System.out.println("inside person constructor");
    }
    public void walk(){
        System.out.println("person"+name+" is walking");
    }
    public void eat(){
        System.out.println("person "+name+" is eating");
    }
    public static void laughing(){
        System.out.println("person is laughing");
    }
}
