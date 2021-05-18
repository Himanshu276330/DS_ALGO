package apniKaksha;
import java.util.Scanner;

public class L_9_Calculater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1st no: ");
        int a1 = sc.nextInt();
        System.out.println("Enter 2nd no: ");
        int a2 = sc.nextInt();
        System.out.println("Enter operation: ");
        sc.nextLine();
        char operation = sc.nextLine().charAt(0);

        switch (operation){
            case '+':
                System.out.println("Result is: "+(a1+a2));
                break;
            case '-':
                System.out.println("Result is: "+(a1-a2));
                break;
            case '*':
                System.out.println("Result is: "+(a1*a2));
                break;
            case '/':
                System.out.println("Result is: "+(a1/a2));
                break;
            default:
                System.out.println("Enter valid operation");
        }

        String operation2 =sc.next();
        switch (operation2){
            case "+":
                System.out.println("Result is: "+(a1+a2));
                break;
            case "-":
                System.out.println("Result is: "+(a1-a2));
                break;
            case "*":
                System.out.println("Result is: "+(a1*a2));
                break;
            case "/":
                System.out.println("Result is: "+(a1/a2));
                break;
            default:
                System.out.println("Enter valid operation");
        }



    }
}
