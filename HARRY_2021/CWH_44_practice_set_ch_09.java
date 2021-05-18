package HARRY_2021;

class cylinder{
    private int radius;
    private int height;

    public cylinder(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    public double volume(){
         return 2*(22d/7d)*radius*height;
    }
    public double surfaceArea(){
         return 2*(22d/7d)*radius*radius+2*(22d/7d)*radius*height;
    }
}
class rectangle1{
    private int length;
    private int breadth;

    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }

    public rectangle1(){
        this.length=4;
        this.breadth=5;
    }
    public rectangle1(int length, int breadth){
        this.length=length;
        this.breadth=breadth;
    }
}

public class CWH_44_practice_set_ch_09 {
    public static void main(String[] args) {
        //Question 01
        cylinder myCylinder=new cylinder(4,4);
        //myCylinder.setHeight(4);
        //myCylinder.setRadius(4);
        System.out.println(myCylinder.getHeight());
        System.out.println(myCylinder.getRadius());

        //Question 02
        System.out.println(myCylinder.surfaceArea());
        System.out.println(myCylinder.volume());

        //Question 03
        cylinder c=new cylinder(5,5);
        System.out.println(c.getRadius());
        System.out.println(c.getHeight());

        //Question 04
        rectangle1 r=new rectangle1();
        System.out.println(r.getBreadth());
        System.out.println(r.getLength());
        rectangle1 r2=new rectangle1(5,5);
        System.out.println(r2.getLength());
        System.out.println(r2.getBreadth());

    }
}
