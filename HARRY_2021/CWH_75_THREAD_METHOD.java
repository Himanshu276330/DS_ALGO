package HARRY_2021;

class MyThr3 extends Thread{
    @Override
    public void run() {
        int i=0;
        while(i<10){
            System.out.println("Hello gi ");
            i++;
        }
    }
}
class MyThr4 extends Thread{
    @Override
    public void run() {
        int i=0;
        while(i<10){
            System.out.println("thanks you ");
            i++;
        }
    }
}
class MyThr5 extends Thread{
    @Override
    public void run() {
        int i=0;
        while(true){
            System.out.println("ooo bhi ");
            try{
                Thread.sleep(455);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}


public class CWH_75_THREAD_METHOD {
    public static void main(String[] args) {

        MyThr3 t1=new MyThr3();
        MyThr4 t2=new MyThr4();
        MyThr5 t3=new MyThr5();
        t3.start();
        t1.start();

        try{
            t1.join();
        }catch (Exception e){
            System.out.println(e);
        }
        t2.start();
    }
}
