package apniKaksha;

class cat{
    boolean hasFur;
    int legs,eyes;
    public void walk(){
        System.out.println("Cat is walking");
    }
    public void eat(){
        System.out.println("Cat is eating");
    }
    public void description(){
        System.out.println("MY cat has "+legs+" legs and "+eyes+" eyes ");
    }
    public void description(boolean hasFur, int legs,int eyes){
        System.out.println("MY cat has "+legs+" legs and "+eyes+" eyes ");
        System.out.println("It has fur: "+hasFur);
    }
}
class dog{

}
public class L_22_OOPS_INTRO {
    public static void main(String[] args) {

        //newCat1 & newCat2 allocated diff memory

        cat newCat1=new cat();
        newCat1.walk();
        newCat1.legs=3;
        newCat1.eyes=2;
        newCat1.description();
        newCat1.description(true,4,2);

        cat newCat2=new cat();
        newCat2.eat();
    }
}
