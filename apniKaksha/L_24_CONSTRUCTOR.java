package apniKaksha;

class vehicle{
    int wheels;
    int headLight;
    String color;
    vehicle(){
    }
//    vehicle(int noOfWheels){
//        wheels=noOfWheels;
//        headLight=2;
//    }

      //Uses of this , this keyword current object ko point kar raha hota h
    vehicle(int wheels){
        this.wheels=wheels;
        headLight=2;
    }
    vehicle(int wheels,String color){
        headLight=2;
        this.wheels=wheels;
        this.color=color;
    }
}

public class L_24_CONSTRUCTOR {
    L_24_CONSTRUCTOR(){      //Constructor of Main public class
        System.out.println("Object is now created");
    }
    public static void main(String[] args) {

        L_24_CONSTRUCTOR obj=new L_24_CONSTRUCTOR();

        vehicle car=new vehicle();
        System.out.println(car.wheels+" wheels");
        vehicle car2=new vehicle(4);
        System.out.println(car2.wheels+" wheels");
        vehicle scotty=new vehicle(2);
        System.out.println(scotty.wheels+" wheels");

        vehicle eRikshaw = new vehicle(3,"Yellow");
        System.out.println(eRikshaw.wheels+" wheels and color is "+eRikshaw.color);

        vehicle Rikshaw = new vehicle();
        //Rikshaw.color;
    }
}
