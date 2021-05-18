package HARRY_2021;

class Print1 extends Thread{
    @Override
    public void run() {
        int i=0;
        while(i<20){
            System.out.println("Good Morning");
            i++;
            try {
                Print2.sleep(1);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
class Print2 extends Thread{
    @Override
    public void run() {
        int i=0;
        while(i<20){
            System.out.println("Welcome");
            i++;
            try {
                Print2.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    private static void sleep() {
    }
}

public class CWH_76_PS_CH_13 {
    public static void main(String[] args) {

        Print1 p1=new Print1();
        Print2 p2=new Print2();
        p2.setPriority(Thread.MAX_PRIORITY);    //also in place of max_priority fill  10
        p1.setPriority(1);
        System.out.println(p1.getState());
        System.out.println(p2.getState());
        p1.start();
        p2.start();
        System.out.println(p1.getState());
        System.out.println(p2.getState());
        System.out.println(p1.getPriority());
        System.out.println(Thread.currentThread().getState());

    }
}
