package HARRY_2021;

class MyFirstEmployee{
    private int id;
    private String name;

    public MyFirstEmployee(){  //--->Constructor n java ,
        id=45;
        name ="Your name here";
    }
    public MyFirstEmployee(String MyName){  //--->Constructor n java ,
        id=50;
        name =MyName;
    }
    public MyFirstEmployee(String MyName, int MyId){  //--->Constructor n java ,overloaded
        id=MyId;
        name =MyName;
    }

    public void setId(int i){
        this.id=i;  //same as id=i
    }
    public int getId(){
        return id;
    }

    public String  getName(){
        return name;
    }
    public void setName(String n){
        name = n;   //same as this.name=n
    }
}

public class CWH_42_CONSTRUCTOR_IN_JAVA {
    public static void main(String[] args) {

        MyFirstEmployee harry=new MyFirstEmployee();
        //harry.setId(14);
        //harry.setName("codeWithHarry");
        System.out.println( harry.getId());
        System.out.println(harry.getName());

        MyFirstEmployee harry1=new MyFirstEmployee("harry",42);
        System.out.println( harry1.getId());
        System.out.println(harry1.getName());

        MyFirstEmployee harry2=new MyFirstEmployee("harry2");
        System.out.println( harry2.getId());
        System.out.println(harry2.getName());

    }
}
