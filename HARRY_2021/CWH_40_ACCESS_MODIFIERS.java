package HARRY_2021;

class MyEmployee{
    private int id;
    private String name;

    public void setId(int i){
        id=i;
    }
    public int getId(){
        return id;
    }

    public String  getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
}
class circle1{
    private double radius;
    private double area;

    public void setRadius(double r){
        radius=r;
    }
    public double getRadius(){
        return radius;
    }
    public void setArea(double a){
        if (area!=(22/7d)*radius){
            System.out.println("Set correct area");
            area=0;
        }else
        area =a;
    }

    public double getArea() {
        return area;
    }
}

public class CWH_40_ACCESS_MODIFIERS {
    public static void main(String[] args) {

        MyEmployee harry = new MyEmployee();
        //harry.id=14;
        //harry.name="codeWithHarry";  -->Thrown error due to private access modifier

        harry.setId(14);
        harry.setName("codeWithHarry");
        System.out.println(harry.getId());
        System.out.println(harry.getName());

        circle1 c=new circle1();
        c.setRadius(4);
        c.setArea(54.25);
        System.out.println(c.getArea());


    }
}
