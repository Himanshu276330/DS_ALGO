package HARRY_2021;

interface Bicycle{
    int x=45;
    void applyBrake(int decrement);
    void speedUp(int increment);
}
interface Horn{
    void horn3kg();
    void hornMHN();
}
class AvonCycle implements Bicycle,Horn{
    void blowHorn(){
        System.out.println("PEE PEE POO POO");
    }
    public void applyBrake(int decrement){
        System.out.println("Braking");
    }
    public void speedUp(int increment){
        System.out.println("Speeding");
    }
    public void horn3kg(){
        System.out.println("Mai ho anh Po Po Po Po");
    }
    public void hornMHN(){
        System.out.println("Kavi Kushi Kavi Gam Pee Pee Pee");
    }
}

public class CWH_55_INTERFACE_ {
    public static void main(String[] args) {

        AvonCycle a=new AvonCycle();
        //You can create property in Interface
        System.out.println(a.x);
        //You cant modified property in interface
        //a.x=54;
        a.applyBrake(5);
        a.blowHorn();
        a.speedUp(5);
        a.horn3kg();
        a.hornMHN();


    }
}
