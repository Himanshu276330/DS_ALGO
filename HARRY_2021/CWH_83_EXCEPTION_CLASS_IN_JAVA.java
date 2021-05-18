package HARRY_2021;

import java.util.Scanner;

class MyException extends Exception{
    @Override
    public String toString() {
        return  " I am toString()";
    }

    @Override
    public String getMessage() {
        return " I am getMessage()";
    }
}
class MyException2 extends Exception{
    @Override
    public String toString() {
        return super.toString() + " I am a toString";
    }

    @Override
    public String getMessage() {
        return super.getMessage() + " I am a getMessage";
    }
}
class MyExceptionAge extends Exception{
    @Override
    public String toString() {
        return  " Age cant be greater than 125";
    }

    @Override
    public String getMessage() {
        return " Make sure the value of age entered is correct";
    }
}

public class CWH_83_EXCEPTION_CLASS_IN_JAVA {
    public static void main(String[] args) {

//        int a;
//        Scanner sc =new Scanner(System.in);
//        a= sc.nextInt();
//        if(a<9){
//            try{
//                //throw new MyException();
//                throw new ArithmeticException("This is a exception");
//            }catch (Exception e){
//                //System.out.println(e);
//                System.out.println(e.getMessage());
//                System.out.println(e.toString());
//                System.out.println(e);
//                e.printStackTrace();
//            }
//        }
//
//        int a2;
//        Scanner sc2 =new Scanner(System.in);
//        a2= sc2.nextInt();
//        if(a2<9){
//            try{
//                throw new MyException2();
//            }catch (Exception e){
//                //System.out.println(e);
//                System.out.println(e.getMessage());
//                System.out.println(e.toString());
//                System.out.println(e);
//                e.printStackTrace();
//            }
//        }
        int age;
        boolean b=true;
        Scanner sc2 =new Scanner(System.in);
        while(b){
            System.out.print("Enter your age: ");
            age = sc2.nextInt();
            if (age > 125) {
                try {
                    throw new MyExceptionAge();
                } catch (Exception e) {
                    e.printStackTrace();
                    System.out.println(e);
                    System.out.println(e.getMessage());
                    System.out.println(e.toString());
                    System.out.println(e);
                    System.out.println();
                }
            }else b=false;
        }



    }
}
