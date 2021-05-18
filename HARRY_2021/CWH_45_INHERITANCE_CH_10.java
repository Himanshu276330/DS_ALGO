package HARRY_2021;

class Base{
    int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
    public void x(){
        System.out.println(x);
    }

    public void printMe(){
        System.out.println("I am a in base and setting x now , constructor");
    }
}

class Derived extends Base{
    int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

public class CWH_45_INHERITANCE_CH_10 {
    public static void main(String[] args) {
        Base b= new Base();
        b.printMe();
        b.x=4;
        b.x();
        b.setX(5);
        b.x();
        Derived d =new Derived();
        d.printMe();
        d.setY(4);
        System.out.println(d.getY());


    }
}
