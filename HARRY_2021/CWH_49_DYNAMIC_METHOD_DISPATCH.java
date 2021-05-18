package HARRY_2021;

class phone{
    public void great(){
        System.out.println("Good morning");
    }
    public void showTime(){
        System.out.println("Time is 8 am");
    }
    public void name(){
        System.out.println("My name is java ");
    }
}
class smartphone extends phone{
    public void na(){
        System.out.println("Namaste");
    }
    @Override
    public void name(){
        System.out.println("My name is java in class smartphone");
    }
}

public class CWH_49_DYNAMIC_METHOD_DISPATCH {
    public static void main(String[] args) {
        //phone p=new phone();     //allowed
        smartphone sp=new smartphone();     //allowed
        //p.name();
        //sp.name();

        phone p1 = new smartphone();   //allowed
        //smartphone p12 = new phone();   //not allowed
        p1.great();
        sp.na();
        //p1.na();   //give error
        p1.name();

    }
}
