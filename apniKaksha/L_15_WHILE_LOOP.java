package apniKaksha;
import java.util.Scanner;

public class L_15_WHILE_LOOP {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

           //Question 01
        int n= sc.nextInt();
        int temp=n;
        int sum=0;

        while(temp>0){
            int lastDigit=temp%10;
            temp=temp/10;
            sum=sum+lastDigit;
            System.out.println(lastDigit+" "+temp+" "+sum);
        }
        System.out.println("The sum of digits: "+sum);


              //to find no of digits of random no
//        int n= sc.nextInt();
//        int numberOfDigits= (int)Math.log10(n) +1;
//        System.out.println(numberOfDigits);




          //  Question 02  "Palindrome  number
        int n2 = sc.nextInt();
        int no = n2;
        int no2 = 0;
        while(no>0){
            int lastDigitNo=no%10;
             no=no/10;
             no2= no2*10+lastDigitNo;
            System.out.println(lastDigitNo+" "+no+" "+no2);
        }
        System.out.println(no2);
        if (no2==n2){
            System.out.println("It is a Palindrome no: "+n2);
        }
        else{
            System.out.println("not");
        }

    }
}
