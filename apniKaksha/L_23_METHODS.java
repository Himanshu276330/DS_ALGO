package apniKaksha;

class Dog1{
    int legs;
    public void eat(){
        System.out.println("eating");
    }
//    int eyes;
}

public class L_23_METHODS {
    public static int maxOfNumber(int a,int b){
        if (a>b) {
            return a;
        }
        else{
            return b;
        }
    }
    public static void swap(int x,int y){
        int temp=x;
        x=y;
        y=temp;
    }
    public static void swap2(Dog1 a,Dog1 b){
        Dog1 temp=a;
        a=b;
        b=temp;
    }
    public static void change(Dog1 a){
        a.legs=6;
    }
    public static void main(String[] args) {

//        System.out.println(maxOfNumber(2,2));
//        System.out.println(maxOfNumber(6,2));

           //This indicate that only copy of no is given to method it actual value not change
//        int a=4 , b=6;
//        swap(a,b);
//        System.out.println(a+" "+b);

            //Reference is pass in this case
            //Primitive data type me copy pass hota h but non primitive me reference pass hota h
        Dog1 d=new Dog1();
        d.legs=3;
        Dog1 d2=new Dog1();
        d2.legs=4;
        swap2(d,d2);
        System.out.println(d.legs+" "+d2.legs);

          //Value is change because reference is pass not it copy
        Dog1 d3=new Dog1();
        d3.legs=3;
        change(d3);
        System.out.println(d3.legs);



    }
}
