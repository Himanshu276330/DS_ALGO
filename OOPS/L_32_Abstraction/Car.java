package OOPS.L_32_Abstraction;

public abstract class Car {

    protected abstract void accelerate();
    public  abstract void breaking();

    protected void honk(){
        System.out.println("car is honking");
    }
}
