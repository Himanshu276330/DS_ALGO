package OOPS.L_32_Abstraction;

public class RepairShop {

    public static void repairCar(Car car){
        System.out.println("Car is repaired");
    }
    public static void repairCar2(Truck t){
        System.out.println("Truck is repaired");
    }

    public static void main(String[] args) {

        WagonR wagonR=new WagonR();
        Audi audi =new Audi();
        Truck Truck1=new Truck1();

        repairCar(wagonR);
        repairCar(audi);
        repairCar2(Truck1);
        audi.honk();
        wagonR.honk();


    }
}
