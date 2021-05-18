package HARRY_2021;

class Employee{
    int id;
    int salary;
    String name;
    public  void printDetails(){
        System.out.println("My name is "+name);
        System.out.println("My id is "+id);
        System.out.println("MY salary is "+salary);
    }
    public int getSalary(){
        return salary;
    }
}

public class CWH_38_CREATING_OUR_OWN_CLASS {
    //IT can also works 
    static class Employee1{
        int id;
        int salary;
        String name;
        public  void printDetails(){
            System.out.println("My name is "+name);
            System.out.println("My id is "+id);
            System.out.println("MY salary is "+salary);
        }
        public int getSalary(){
            return salary;
        }
    }
    public static void main(String[] args) {
        System.out.println("This is our custom class");
        Employee harry = new Employee();    //Instantiating a new Employee object
        Employee1 john = new Employee1();    //Instantiating a new Employee object
        //Setting attribute or property of harry
        harry.id=12;
        harry.salary=34;
        harry.name="codeWithHarry";
        //Setting attribute or property of john
        john.id=13;
        john.salary=12;
        john.name="John Kumar";
        //Printing attribute
        //System.out.println(harry.id);
        //System.out.println(harry.name);
        harry.printDetails();
        john.printDetails();
        int salary= john.getSalary();
        System.out.println(salary);
    }
}
