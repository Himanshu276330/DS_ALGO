package HARRY_2021;

class EkClass{
    int a;
    EkClass(int a){
        //a=a;  --->this gives error
        this.a=a;
    }
    public int getA() {
        return a;
    }
}
class DoClass extends EkClass{
    DoClass(){
        super(4);  //if we removed super keyword then it give error because in parent class method required atLeast one int
        System.out.println("I am a constructor");
    }
}

public class CWH_47_THIS_AND_SUPER_KEYWORDS {
    public static void main(String[] args) {

        //EkClass e=new EkClass(4);
        //System.out.println(e.getA());

        DoClass d=new DoClass();
        System.out.println(d.getA());



    }
}
