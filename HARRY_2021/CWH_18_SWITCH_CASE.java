package HARRY_2021;

import java.util.Scanner;

public class CWH_18_SWITCH_CASE {
    public static void main(String[] args) {
        System.out.print("Enter your age : ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if (age > 56) {                 //
            System.out.println("You are experienced");
        } else if (age > 46) {
            System.out.println("You are semi-experienced");
        } else if (age > 36) {
            System.out.println("You are semi-semi-experienced");
        } else {
            System.out.println("You are not experienced");
        }

        if (age > 2) {
            System.out.println("You are a baby");
        }

        switch (age) {
            case 18:
                System.out.println("You are going to become an adult");
                break;
            case 23:
                System.out.println("You are going to join a job");
                break;
            case 60:
                System.out.println("You are going to retired");
                break;
            default:
                System.out.println("Enjoy your life");
        }

        switch (age) {
            case 18:       //if break is missed then all statement ,matched and below matched are given by java
                System.out.println("You are going to become an adult");
            case 23:
                System.out.println("You are going to join a job");
            case 60:
                System.out.println("You are going to retired");
            default:
                System.out.println("Enjoy your life");
        }

        // Enhanched switch not support in this


        String STR = "HAPPY";
        switch (STR) {
            case "HAPPY":
                System.out.println("You are going to become an adult");
                break;
            case "gas":
                System.out.println("You are going to join a job");
                break;
            case "hat":
                System.out.println("You are going to retired");
                break;
            default:
                System.out.println("Enjoy your life");
        }
    }
}
