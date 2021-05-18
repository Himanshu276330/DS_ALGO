package HARRY_2021;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

class methClass{
    @Deprecated
    public void meth(){
        System.out.println("I am a method");
    }
}
interface myInterface{
    void meth();
}
public class CWH_112_PS_CH_16 {

    @SuppressWarnings("deprecation")

    public static void main(String[] args)  {
        methClass m=new methClass ();
        m.meth();
        //Both are doing same work
        myInterface mi=new myInterface() {
            @Override
            public void meth() {
                System.out.println("Instance by anonymous class method");
            }
        };

        myInterface mi2= () -> {
            System.out.println("Instance by anonymous class method ,Lambda expression");
        };

        //Question 05
        File file=new File("file2.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        String table="";
        for (int j=2;j<=9;j++){
            int t=j;
            for (int i=1;i<=10;i++){
                table += t + " x " + i + " = " + (t * i);
                table+="\n";
            }
            table+="\n";
        }

        try {
            FileWriter fileWriter = new FileWriter("file2.txt");
            fileWriter.write(table);
            fileWriter.close();
        }catch (IOException e){
            System.out.println(e);
        }


    }
}
