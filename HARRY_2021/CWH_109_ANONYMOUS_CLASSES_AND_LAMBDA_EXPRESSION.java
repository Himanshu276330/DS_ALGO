package HARRY_2021;

interface DemoAno{
    void meth();
    void meth2();
}

@FunctionalInterface
interface DemoAno2{
    void meth(int a);
}


//Old way
//class HarryFunc implements DemoAno2{
//    @Override
//    public void meth() {
//        System.out.println("I am meth in DemoAno2");
//    }
//}


/*
class AnonymousDemo implements DemoAno{
    public void display(){
        System.out.println("Hello");
    }
    @Override
    public void meth() {
        System.out.println("I am meth 1");
    }
    @Override
    public void meth2() {
        System.out.println("I am meth 2");
    }
}
*/
public class CWH_109_ANONYMOUS_CLASSES_AND_LAMBDA_EXPRESSION {

    public static void main(String[] args) {

//        AnonymousDemo obj=new AnonymousDemo();
//        obj.meth();

        //Anonymous class
        DemoAno obj=new DemoAno() {
            @Override
            public void meth() {
                System.out.println("I am meth 1 in anonymous class");
            }

            @Override
            public void meth2() {
                System.out.println("I am meth 2 in anonymous class");
            }
        };
        obj.meth();

        //Old way
//        DemoAno2 obj2= new HarryFunc();
//        obj2.meth();

        //Lambda class new way
        DemoAno2 obj2=(a)->{System.out.println("I am method 1 in lambda class "+a);};
        obj2.meth(5);


    }
}
