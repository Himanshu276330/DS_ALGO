package HARRY_2021;
import java.util.Scanner;

public class CWH_19_PRACTICE_SET_CH_04 {
    public static void main(String[] args) {

/*        //Question 01
        int a = 10;
        if (a == 18) {
            System.out.println("tou are 18");
        } else {
            System.out.println("you are not 18");
        }

        //Question 02
        Scanner sc = new Scanner(System.in);

        System.out.print("Full marks in each subject: ");
        float mt = sc.nextFloat();
        System.out.print("Marks obtained in math :");
        float m1 = sc.nextFloat();
        System.out.print("Marks obtained in english :");
        float m2 = sc.nextFloat();
        System.out.print("Marks obtained in science :");
        float m3 = sc.nextFloat();
        float total;
        total = m1+m2+m3;
        float p1 = (m1/mt)*100;
        float p2 = (m2/mt)*100;
        float p3 = (m3/mt)*100;
        float pt = (total/(3*mt))*100;

        if (p1<33){
            System.out.println("You fail in exam");
        }
        else if (p2<33){
            System.out.println("You fail in exam");
        }
        else if (p3<33){
            System.out.println("You fail in exam");
        }
        else if (pt<40){
            System.out.println("You fail in exam");
        }
        else{
            System.out.println("You passed in exam");
        }

        //method 2
        System.out.println("Provide you marks out of 100");
        System.out.println("Enter your math marks: ");
        int math = sc.nextInt();
        System.out.println("Enter your english: ");
        int english = sc.nextInt();
        System.out.println("Enter your socal science: ");
        int socal = sc.nextInt();
        System.out.println("Enter your science: ");
        int science = sc.nextInt();
        System.out.println("Enter your sanskrit: ");
        int sanskrit = sc.nextInt();
        int totalmarks = math + english + socal + science + sanskrit;
        System.out.println(total);
        System.out.println("your total marks percentage: " + total / 5 + "%");
        if (total < 200) {
            System.out.println("you are fail in over all marks");
        }
        if (math < 33) {
            System.out.println("you are fail in math exam");
        }
        if (english < 33) {
            System.out.println("you are fail in english exam");
        }
        if (socal < 33) {
            System.out.println("you are fail in social exam");
        }
        if (science < 33) {
            System.out.println("you are fail in science exam");
        }
        if (sanskrit < 33) {
            System.out.println("you are fail in  sanskrit exam");
        }

        //Question 03
        System.out.print("Please provide your income in lakhs for calculation of tax:  ");
        float tax = sc.nextFloat();
        if (tax >= 10.0f) {
            System.out.println("Your tax is " + tax * 0.30 + "L_27_Static_keyword");
        } else if (tax >= 5.0f) {
            System.out.println("You tax is " + tax * 0.20 + "L_27_Static_keyword");
        } else if (tax >= 2.5f) {
            System.out.println("Your tax is " + tax * 0.05 + "L_27_Static_keyword");
        }
        else System.out.println("you have not to pay any tax");   */

       //Question 04
        Scanner sc3 = new Scanner(System.in);
        int day = sc3.nextInt();
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Chose correct options");
        }


    }
}
