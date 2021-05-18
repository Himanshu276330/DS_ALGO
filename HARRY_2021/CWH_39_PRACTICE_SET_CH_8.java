package HARRY_2021;

class Employee2{
    int salary;
    String name;
    public int getSalary(){
        return salary;
    }
    public String getName() {
        return name;
    }
    public void setName(String str){
        name=str;
    }
}
class cellPhone{
    public void ring(){
        System.out.println("Ringing");
    }
    public  void vibrate(){
        System.out.println("VIBRATING");
    }
}

class square{
    int side;
    public int area(){
        return side*side;
    }
    public int perimeter(){
        return 4*side;
    }
}
class rectangle{
    int length;
    int breath;
    public int area(){
        return length*breath;
    }
    public int perimeter(){
        return 2*(length+breath);
    }
}
class circle{
    float radius;
    public float area(){
        return (22f/7f)*radius*radius;
    }
    public float perimeter(){
        return 2*(22/7f)*radius;
    }
}

class TommyvVecetti{
    public void hit(){
        System.out.println("Hitting the enemy");
    }
    public void fire(){
        System.out.println("Firing the enemy");
    }
}

public class CWH_39_PRACTICE_SET_CH_8 {
    public static void main(String[] args) {
        //Question 01
        Employee2 harry = new Employee2();
        harry.salary=14;
        harry.setName("codeWithHarry");
        System.out.println(harry.name);
        System.out.println(harry.getName());
        System.out.println(harry.getSalary());

        //Question 02
        cellPhone asus = new cellPhone();
        asus.ring();
        asus.vibrate();

        //Question 03
        square s=new square();
        s.side=4;
        System.out.println(s.area());
        System.out.println(s.perimeter());
        System.out.println(s.side);

        //Question 04
        rectangle r=new rectangle();
        r.length=5;
        r.breath=8;
        System.out.println(r.area());
        System.out.println(r.perimeter());

        //Question 05
        TommyvVecetti tom=new TommyvVecetti();
        tom.fire();
        tom.hit();

        //Question 06
        circle c=new circle();
        c.radius=3;
        System.out.println(c.area());
        System.out.println(c.perimeter());
    }
}
