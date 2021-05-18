package HARRY_2021;

@FunctionalInterface
interface myFunctionalInterface{
    void thisMethod();
    //void thisMethod2();    //iss comment ko hatayenge to error aye ga because FunctionalInterface me sirf 1
                             // method ho sakta  h
}

class myPhone extends phone{
    @Override
    public void showTime(){
        System.out.println("Time is 8PM");
    }
    @Deprecated
    public int add(int a,int b){
        return a + b;
    }
}
public class CWH_108_ANNOTATION_IN_JAVA {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {

        myPhone Phone=new myPhone();
        Phone.showTime();
        Phone.great();
        Phone.add(4,5);
    }
}
