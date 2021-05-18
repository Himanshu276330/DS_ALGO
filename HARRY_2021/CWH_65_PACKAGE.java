package HARRY_2021;

//import java.util.Scanner;
import java.util.*;      //-->import all package in java.util

public class CWH_65_PACKAGE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input=sc.nextInt();
        System.out.println("User input is :"+input);

        java.util.Scanner sc2=new Scanner(System.in);   //-->both works well
        int input2=sc.nextInt();
        System.out.println("User input is :"+input2);
    }
}
