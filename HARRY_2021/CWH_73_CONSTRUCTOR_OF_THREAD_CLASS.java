package HARRY_2021;

class MyThr extends Thread{
    public MyThr(String name){
        super(name);
    }
    @Override
    public void run() {
        System.out.println("Hello bhi");
    }
}

public class CWH_73_CONSTRUCTOR_OF_THREAD_CLASS {
    public static void main(String[] args) {

        MyThr t1=new MyThr("harry");
        MyThr t2=new MyThr("happy");
        t1.start();
        t2.start();
        long id1= t1.getId();
        System.out.println("Thread name of t1 : "+t1.getName());
        System.out.printf("The id of thread t1=%d\n",id1);
        long id2=t2.getId();
        System.out.println("Thread name of t2 : "+t2.getName());
        System.out.printf("The id of thread t2=%d", id2);

    }
}
