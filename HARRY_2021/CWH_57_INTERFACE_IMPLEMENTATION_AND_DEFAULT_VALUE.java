package HARRY_2021;

interface Camera{
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
interface wifi{
    String[] availableNetwork();
    void connectToNetwork(String network);
}
class myCellPhone{
    void callNumber(int phoneNumber){
        System.out.println("Calling "+phoneNumber);
    }
    void takeCall(){
        System.out.println("Connecting....");
    }
}
class mySmartPhone extends myCellPhone implements wifi,Camera{
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

    //@Override
    //public void recording4kVideo() {
        //System.out.println("Taking snap and recording 4k video");
    //}
}
public class CWH_57_INTERFACE_IMPLEMENTATION_AND_DEFAULT_VALUE {
    public static void main(String[] args) {
        mySmartPhone ms=new mySmartPhone();
        String[] ar=ms.availableNetwork();
        for (String item:ar){
            System.out.println(item);
        }
        ms.recording4kVideo();
        //ms.greet();    --->error

    }
}
