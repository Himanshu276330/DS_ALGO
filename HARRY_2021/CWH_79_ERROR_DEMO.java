package HARRY_2021;

import java.util.Scanner;

public class CWH_79_ERROR_DEMO {
    public static void main(String[] args) {
        //Logical Error Demo

        //Write a program to print all prime no b/w 1 to 10
        System.out.println(2);
        for (int i=1;i<5;i++){
            System.out.println(2*i+1);  //In this 9 is print but it is not a prime no so it is a logical error
        }

        //Run Time Error
        int k;
        Scanner sc=new Scanner(System.in);
        k= sc.nextInt();
        System.out.println("Integer part of 1000 divided by k is"+1000/k);


    }
}
