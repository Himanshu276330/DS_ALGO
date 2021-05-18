package HARRY_2021;

import java.util.Scanner;

class InvalidNumberInputException extends Exception{
    @Override
    public String toString() {
        return "Invalid Input";
    }
    @Override
    public String getMessage() {
        return "Please Enter  input <100000";
    }
}
class InvalidOperationInputException extends Exception{
    @Override
    public String toString() {
        return "Invalid Input";
    }
    @Override
    public String getMessage() {
        return "Please Enter valid  operation input";
    }
}
class MaxMultiplicationInputException extends Exception{
    @Override
    public String toString() {
        return "Invalid Input";
    }
    @Override
    public String getMessage() {
        return "Please Enter input less than 7000";
    }
}

public class CWH_87_EXERCISE_06 {

    public static void main(String[] args) throws InvalidOperationInputException {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st no : ");
        double n1= sc.nextDouble();
        System.out.println("Enter 2nd no : ");
        double n2= sc.nextDouble();
        System.out.println("Enter the operation : ");
        String op= sc.next();
        //System.out.println(op);

        if(n1>100000 || n2>100000){
            //System.out.println("L_37_MyArray");
            try {
                throw new InvalidNumberInputException();
            } catch (InvalidNumberInputException e) {
                System.out.println(e.getMessage());
                System.out.println(e.toString());
            }
        }
        else if(op.equals("*") && (n1>7000 || n2>7000)){
            //System.out.println("L_37_MyArray");
            try {
                throw new MaxMultiplicationInputException();
            } catch (MaxMultiplicationInputException e) {
                System.out.println(e.getMessage());
                System.out.println(e.toString());
            }
        }
        else if(n2==0){
            throw new ArithmeticException("Cant not divide by 0");
        }
        else if (!op.equals("+") || op!="-"|| op!="*"|| op!="/"){
            try{
               throw new InvalidOperationInputException();
            } catch (Exception e) {
                System.out.println(e.toString());
                System.out.println(e.getMessage());
            }
        }
        else {
            switch (op) {
                case "+":
                    System.out.println("Sum of the no is : " + (n1 + n2));
                    break;
                case "*":
                    System.out.println("product of the no is : " + (n1 * n2));
                    break;
                case "-":
                    System.out.println("subtract of the no is : " + (n1 - n2));
                    break;
                case "/":
                    System.out.println("divide of the no is : " + (n1 / n2));
                    break;
            }

        }


    }
}
