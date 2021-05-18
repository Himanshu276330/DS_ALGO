package HARRY_2021;

import java.text.MessageFormat;
import java.util.Scanner;

public class CWH_81_HANDLING_SPECIAL_EXCEPTION {
    public static void main(String[] args) {

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
    }
}
