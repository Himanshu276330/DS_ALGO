package HARRY_2021;

import java.sql.SQLOutput;
import java.util.Scanner;

class MyMaxRetryException extends Exception{
    @Override
    public String getMessage() {
        return "Max retry ,Try after some time";
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

public class CWH_86_PS_CH_14 {
    public static void main(String[] args) {

        //Question 01
        //int a=7      //Syntax error

//       int age=78;                    //logical error
//       int year_born=2000-78;

        //Question 02
        Scanner sc=new Scanner(System.in);

//        System.out.print("Enter 1st integer no: ");
//        int num1=sc.nextInt();
//        System.out.print("Enter 2nd integer no: ");
//        int num2=sc.nextInt();
//
//        if (num1 < 0|| num2<0) {
//            throw new IllegalArgumentException("HeHe");
//        }
//
//        try{
//            System.out.println("result of these two no is : "+num1/num2);
//        }catch (ArithmeticException e){
//            System.out.println(e);
//            System.out.println("HaHa");
//        }catch (Exception e){
//            System.out.println(e);
//        }

        //Question 03
        int marks[] = {25,84,78,98,48};

        int i=1;
        while(i<=5) {
            System.out.print("Enter index of marks array to find value: ");
            int ind= sc.nextInt();
            try {
                System.out.println("The value is: " + marks[ind]);
                //i=7;
                break;
            } catch (Exception e) {
                System.out.println(e);
                i++;
                if(i==5) {
                    try {
                        throw new MyMaxRetryException();
                    } catch (MyMaxRetryException x) {
                        System.out.println(x.getMessage());
                    }
                    System.out.println("Error, try next time");
                }
            }
        }
        if(i==5) {
            System.out.println("Error, try next time");
        }
    }
}
