package OOPS.packages;


//import OOPS.packages.models.student;
//import OOPS.packages.models.teacher;


//Dono ke badle yak se hi kam chal jayega , import karlega sare OOPS.packages.models ke classes
import OOPS.packages.models.*;

public class MainClass {
    public static void main(String[] args) {

        student obj=new student("Tom");
        //System.out.println(obj.name);    //name is private access
        //System.out.println(obj.getPassword());

        System.out.println(obj.getName());

        teacher obj2=new teacher();
    }
}
