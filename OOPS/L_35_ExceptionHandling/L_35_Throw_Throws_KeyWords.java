package OOPS.L_35_ExceptionHandling;

class NegativeAreaException extends Exception{
    @Override
    public String toString() {
        return  " Radius cant be negative";
    }
    @Override
    public String getMessage() {
        return " Provide valid Radius";
    }
}

class NegativeAreaException2 extends Exception{
    @Override
    public String toString() {
        return  " Radius cant be negative";
    }

    @Override
    public String getMessage() {
        return " Provide valid Radius";
    }
}

public class L_35_Throw_Throws_KeyWords {

    //Some Methods
    public static int divide(int a,int b) throws ArithmeticException {
        //Made by harry
        int result=a/b;
        return result;
    }
    public static double area(int radius) throws  NegativeAreaException{
        if(radius<0) {
            throw new NegativeAreaException();
        }
        double area=Math.PI*radius*radius;
        return area;
    }
    //Iss ko bhi used kar sakte ho
    public static double area2(int radius2) {
        if(radius2<0) {
            try {
                throw new NegativeAreaException();
            } catch (NegativeAreaException e) {
                System.out.println(e.getMessage());
                System.out.println(e.toString());
            }
        }
        else {
        double area2=Math.PI*radius2*radius2;
        return area2;
        }
        return 0;
    }

    public static void main(String[] args) {

        //Shiv used method created by harry
        try {
            int c = divide(4, 0);
            System.out.println(c);
        }catch (Exception e){
            System.out.println(e);
        }

        try {
            double FindArea=area(-4);
            System.out.println(FindArea);
        } catch (NegativeAreaException e) {
            System.out.println(e.getMessage());
            System.out.println(e.toString());
        }

        double FindArea2=area2(-8);   //IN THIS WE NOT REQUIRED TRY CATCH BLOCK BECAUSE WE ADD IN METHOD
        System.out.println(FindArea2);
        double FindArea3=area2(5);
        System.out.println(FindArea3);
    }
}
