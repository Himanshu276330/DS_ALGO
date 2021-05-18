package HARRY_2021;

abstract class Pen{
    Pen(){System.out.println("mai abstract class Pen ka constructor hu  ");}
    abstract public void write();
    abstract public void refill();
}
class FoundationPen extends Pen{
    public void write() {System.out.println("Writing");}
    public void refill(){System.out.println("Refilling"); }
    public void changeNib(){System.out.println("Changing nib"); }
}
class Monkey{
    public void jump(){ System.out.println("Jumping..");}
    public void bite(){ System.out.println("Bite...");}
}
interface BasicAnimal{
    public void eat();
    public void sleep();
}
class Human extends Monkey implements BasicAnimal{
    public void speak(){
        System.out.println("Hello gi");
    }
    @Override
    public void eat(){System.out.println("Eating..");}
    @Override
    public void sleep(){System.out.println("Sleeping...");}
}
abstract class Telephone{
    abstract public void ring();
    abstract public void lift();
    abstract public void disconnect();
}
class SmartTelephone extends Telephone{
    public void ringTone(){
        System.out.println("Pee Pee Poo Poo");
    }
    public void ring(){
        System.out.println("Ringing...");
    }public void lift(){
        System.out.println("Lifting...");
    }public void disconnect(){
        System.out.println("Disconnecting...");
    }
}
interface TvRemote{
    void redButton();
    void greenButton();
    void soundButton();
}
interface SmartTvRemote extends TvRemote{
    void mic();
    void wifi();
}
class Tv implements SmartTvRemote{
    public void redButton(){
        System.out.println("Off the tv");
    }
    public void greenButton(){
            System.out.println("On the tv");
        }
    public void soundButton(){
            System.out.println("Increasing or decreasing sound");
        }
    public void mic(){
        System.out.println("Speak....");
    }
    public void wifi(){
        System.out.println("Wireless connectivity");
    }

}
public class CWH_60_PRACTICE_SET_CH_11 {
    public static void main(String[] args) {
        //Question 01
        FoundationPen p=new FoundationPen();
        p.changeNib();
        p.refill();
        p.write();
        Human harry=new Human();
        harry.eat();
        harry.speak();

        //Question 04
        Telephone t=new SmartTelephone();
        // t.ringTone();   -->Cant used ringTone method because the reference is Telephone which does not ringTone method
        t.ring();
        t.disconnect();

        //Question 05
        Monkey m1=new Human();
        // mi.speak();    -->Cant used speak method because the reference is monkey which does not speak method

        //

    }
}
