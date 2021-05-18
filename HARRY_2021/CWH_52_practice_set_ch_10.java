package HARRY_2021;

class Circle12{
    public int radius;
    Circle12(){
        System.out.println("I am non parametric constructor");
    }
    Circle12(int r){
        System.out.println("I am  parametric constructor");
       this.radius=r;
    }
    public double area(){
        return 3.14*radius*radius;
    }
}
class Cylinder12 extends Circle12{
    public int height;
    Cylinder12(int r,int h){
        super(r);
        System.out.println("I am  parametric constructor of cylinder");
        this.height=h;
    }

    public double volume(){
        return Math.PI*this.radius*this.radius*height;
    }
}
class rectangle12{
    int length;
    int breadth;
    rectangle12(){
        System.out.println("I am a non parametric constructor");
    }
    rectangle12(int l,int b){
        System.out.println("I am a parametric constructor");
        this.length=l;
        this.breadth=b;
    }
    public double area(){
        return length*breadth;
    }
}
class  cuboid extends rectangle12{
    int height;
    cuboid(int l,int b,int h){
        super(l,b);
        this.height=h;
    }
    public double volume(){
        return length*breadth*height;
    }
}

public class CWH_52_practice_set_ch_10 {
    public static void main(String[] args) {
    //Question 1 &  2
       /* Circle12 c= new Circle12(5);
        System.out.println(c.area());
        Cylinder12 cy=new Cylinder12(5,6);
        System.out.println(cy.volume());*/
    //Question 03 & 4
        rectangle12 r=new rectangle12();
        System.out.println(r.area());
        rectangle12 r2=new rectangle12(4,6);
        System.out.println(r2.area());
        cuboid c= new cuboid(4,5,6);
        System.out.println(c.volume());


    }
}
