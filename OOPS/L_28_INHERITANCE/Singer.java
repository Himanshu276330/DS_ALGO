package OOPS.L_28_INHERITANCE;

public class Singer extends Person {

    public Singer(String name) {
        super(name);
        System.out.println("inside Singer Constructor");
    }
    public void sing(){
        System.out.println("Singer is singing");
    }
    public void walk(){
        System.out.println("singer "+name+" is walking");
    }
    public static void laughing(){
        System.out.println("singer is laughing");
    }
}
