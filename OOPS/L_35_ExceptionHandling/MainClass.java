package OOPS.L_35_ExceptionHandling;

import java.text.MessageFormat;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {

        //Case 1
        int a=4;
        int b=0;
        try{
            System.out.println(a/b);
        }catch (Exception e){
            System.out.println(e);
        }

        System.out.println("Important code ");
        System.out.println("Need to run");

        //Case 2
        int [] marks =new int[5];
        marks[0]=7;
        marks[1]=70;
        marks[2]=60;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Array index");
        int arr=sc.nextInt();
        System.out.println("Enter the number that divide array index value");
        int num= sc.nextInt();

        try{
            int d=marks[arr]/num;
            System.out.println("The value at given index is: "+marks[arr]);
            System.out.println("The resultant value is: "+d);

        }catch(ArithmeticException e) {
            System.out.println(MessageFormat.format("ArithmeticException  error happen: {0}", e));
            System.out.println("ArithmeticException  error happen:" + e);
        }catch(IndexOutOfBoundsException e) {
            System.out.println(MessageFormat.format(" IndexOutOfBoundsException error happen: {0}", e));
            System.out.println("IndexOutOfBoundsException error happen:" + e);
        }catch (Exception e){
            System.out.println(MessageFormat.format("Some error happen: {0}", e));
            System.out.println("Some error happen: "+e);
        }

        //Case 3

    }

}
