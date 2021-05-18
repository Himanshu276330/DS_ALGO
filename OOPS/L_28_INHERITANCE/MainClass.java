package OOPS.L_28_INHERITANCE;

public class MainClass {
    public static void main(String[] args) {

        Teacher t=new Teacher("Mr Harry");

//        t.name="Mr Harry";
        t.eat();
        t.walk();
        t.teach();

//        Singer s=new Singer();
//        s.name="Oprah";
//        s.sing();
//        s.eat();
//        s.walk();

//        Person p=t;    //upcasting , it fine since Cat is also an animal

//        Person p= new Person();
//        Teacher t1=(Teacher) p;   // not give error at compile time but give error at run time

//        Teacher t2=new Teacher();      //not give error at compile time and also at run time
//        Person p=t2;
//        Teacher t=(Teacher) p;

//        Teacher t2=new Teacher();
//        Singer s1=new Singer();
//        Person p=t2;
//        Teacher t=(Teacher) p;    // not give error at compile time but give error at run time

//        System.out.println(t2 instanceof Teacher);
//        System.out.println(t2 instanceof Person);
//        System.out.println(s1 instanceof Singer);
//        System.out.println(t instanceof Person);
//        System.out.println(p instanceof Singer);
//        System.out.println(p instanceof Teacher);

    }
}
