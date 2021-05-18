package HARRY_2021;

public class CWH_80_Error_Try_catch_block {
    public static void main(String[] args) {

        int a=6000;
        int b=9;
        int c=a/b;
        System.out.println("The integral part is : "+c);

        //With try
        try{
            int c0=a/b;
            System.out.println("The integral part is : "+c0);
        }catch (Exception x) {
            System.out.println("WE found an error: "+x);
        }
        int a1=6000;
        int b1=0;
        try{
            int c1=a1/b1;
            System.out.println("The integral part is : "+c1);
        }catch (Exception x) {
            System.out.println("WE found an error: "+x);
        }

        System.out.println("Ending the program");


    }
}
