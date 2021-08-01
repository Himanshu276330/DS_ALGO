package HARRY_2021;
import java.util.Scanner;

public class CWH_13_STRING_CH_03 {
    public static void main(String[] args) {

        String name = new String("Harry");
        String name2 = "Harry";
        System.out.println(name);
        System.out.print("The name is : ");
        System.out.println(name2);

        int a= 6;
        float b = 5.6454f;
        String c = "HIMANSHU";
        char d= 'd';
        System.out.printf("a %d \n",a);
        System.out.printf("The value of a is %d and value of b is %f\n",a,b);
        System.out.printf("The value of c is %S and value of d is %c\n",c,d);   // printf is same as format
        System.out.format("The value of a is %d and value of b is %.2f\n",a,b);
        System.out.format("The value of c is %S and value of d is %c\n",c,d);
        System.out.printf("a is %d and b is %2f\n",a,b);
        System.out.format("a is %4d and b is %17.3f\n",a,b);   //-->17.3 meaning 7 space chorna h and 3 digits tak value dena h

        Scanner sc = new Scanner(System.in);

//        DATA_STRUCTURE.String st = sc.next();
//        System.out.println(st);

        String st2 = sc.nextLine();
        System.out.println(st2);

    }
}
