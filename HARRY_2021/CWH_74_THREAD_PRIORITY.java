package HARRY_2021;

class MyThr2 extends Thread{
    public MyThr2(String name){
        super(name);
    }
    @Override
    public void run() {
        int i=0;
        while(i<10){
            System.out.println("Hello gi : "+this.getName());
            i++;
        }
    }
}

public class CWH_74_THREAD_PRIORITY {
    public static void main(String[] args) {

        MyThr2 t1= new MyThr2("harry1_maximum priority");
        MyThr2 t2= new MyThr2("harry2");
        MyThr2 t3= new MyThr2("harry3");
        MyThr2 t4= new MyThr2("harry4");
        MyThr2 t5= new MyThr2("harry5");
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);
        t4.setPriority(Thread.MIN_PRIORITY);
        t5.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

    }
}
