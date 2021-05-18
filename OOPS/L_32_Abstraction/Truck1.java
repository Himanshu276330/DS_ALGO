package OOPS.L_32_Abstraction;

public class Truck1 extends Truck{
    @Override
    public void accelerate(){
        System.out.println("Truck1 is accelerating");
    }
    @Override
    public void breaking(){
        System.out.println("Truck1 is braking");
    }
}
