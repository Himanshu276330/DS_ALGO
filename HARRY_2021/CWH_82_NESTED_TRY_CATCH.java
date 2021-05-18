package HARRY_2021;

import java.util.Scanner;

public class CWH_82_NESTED_TRY_CATCH {
    public static void main(String[] args) {

        int [] marks =new int[5];
        marks[0]=7;
        marks[1]=70;
        marks[2]=60;
        Scanner sc=new Scanner(System.in);

        boolean flag=true;
        while(flag){
            System.out.print("Enter the Array index : ");
            int ind= sc.nextInt();
            try{
                System.out.println("Welcome to video no 82");
                try{
                    System.out.println(marks[ind]);
                    flag=false;
                }catch (ArrayIndexOutOfBoundsException e){
                    System.out.println("Sorry this index does not exist");
                    System.out.println("Exception in level 2");
                }
            }catch (Exception e){
                System.out.println("Exception in level 1");
            }
        }
        System.out.println("Thanks for using the program");

    }
}
