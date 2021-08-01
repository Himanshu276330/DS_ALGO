package HARRY_2021;

interface Camera2{
    void takeSnap();
    void recordVideo();
    private void greet(){
        System.out.println("Good Morning");
    }
    default void recording4kVideo(){
        greet();
        System.out.println("Recording in 4k  ");
    }
}
interface wifi2{
    String[] availableNetwork();
    void connectToNetwork(String network);
}
class myCellPhone2{
    void callNumber(int phoneNumber){
        System.out.println("Calling "+phoneNumber);
    }
    void takeCall(){
        System.out.println("Connecting....");
    }
}
class mySmartPhone2 extends myCellPhone2 implements wifi2,Camera2{
    public void takeSnap(){
        System.out.println("Taking Snap");
    }
    public void recordVideo(){
        System.out.println("Recording video");
    }
    public String[] availableNetwork() {
        System.out.println("Available networks list");
        String[] availableNetwork = {"jio wifi", "airtel wifi", "redmi"};
        return availableNetwork;
    }
    public void connectToNetwork(String network) {
        System.out.println("Connecting to network "+network);
    }
    public void sample2(){
        System.out.println("meth");
    }

    //@Override
    //public void recording4kVideo() {
    //System.out.println("Taking snap and recording 4k video");
    //}
}
public class CWH_59_POLYMORPHISM {
    public static void main(String[] args) {

        Camera2 cam=new mySmartPhone2();
        //cam.DATA_STRUCTURE.String[] availableNetwork();   --->not allowed,you only used camera
        cam.recording4kVideo();   //-->allowed

        mySmartPhone2 ms=new mySmartPhone2();
        ms.callNumber(993468695);
        ms.sample2();
    }
}
