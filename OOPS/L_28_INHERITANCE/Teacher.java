package OOPS.L_28_INHERITANCE;

public class Teacher extends Person {

    public Teacher(String name){
        super(name);
        System.out.println("inside teacher constructor");
    }
    public void teach(){
        System.out.println(name+" is teaching");
    }
    public void walk(){
        System.out.println("teacher "+name+" is walking");
    }
    public void eat(){
        super.eat();     //parent class wala first call hoga
        System.out.println("teacher "+name+" is eating");
    }
    public static void laughing(){
        System.out.println("teacher is laughing");
    }
}
