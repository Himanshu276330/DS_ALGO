package OOPS.L_31_Polymorphism;

public class MainClass {
    public static void main(String[] args) {

        Dog d=new Dog();
        Pets p=d;
        Animals a=d;

             //Example of run time polymorphism , d and p both are instance of Dogs
        d.walk();
        p.walk();

             //Variable override nahi hote h ,shirf method override hota h
        System.out.println(d.name);
        System.out.println(p.name);

//        a.walk();    //compile time error ,because walk function is not present in animal class

          //Example of compile time polymorphism
        Greeting();
        Greeting("Good Morning");
        Greeting("Good Morning",5);
    }

    public static void Greeting(){
        System.out.println("Hi ,there");
    }
    public static void Greeting(String s){
        System.out.println(s);
    }
    public static void Greeting(String s,int count){
        for (int i=0;i<count;i++){
            System.out.println(s);
        }
    }


}
