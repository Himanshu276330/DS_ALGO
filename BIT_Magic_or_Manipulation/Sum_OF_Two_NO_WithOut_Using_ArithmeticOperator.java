package BIT_Magic_or_Manipulation;

public class Sum_OF_Two_NO_WithOut_Using_ArithmeticOperator {
    public static void main(String[] args) {

        int a=4;
        int b=5;
        int sum=Sum_OF_Two(a,b);
        System.out.println(sum);

    }
    static int Sum_OF_Two(int a,int b){
        while(b!=0) {
            int carry = a & b;
            a = a ^ b;
            b = carry << 1;
        }
        return a;
    }
}
