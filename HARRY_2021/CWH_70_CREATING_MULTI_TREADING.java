package HARRY_2021;

class MyThread extends Thread{
    public void run() {
        int i = 0;
        while (i < 40000) {
            System.out.println("My thread is running");
            System.out.println("I am happy");
            i++;
        }
    }
}
class MyThread2 extends Thread{
    public void run() {
        int i = 0;
        while (i < 40000) {
            System.out.println("My thread2 is running");
            System.out.println("I am sad!");
            i++;
        }
    }
}

public class CWH_70_CREATING_MULTI_TREADING {
    public static void main(String[] args) {

        MyThread m1=new MyThread();
        MyThread2 m2=new MyThread2();
        m1.start();
        m2.start();

    }
}
