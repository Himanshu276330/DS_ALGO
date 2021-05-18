package HARRY_2021;

public class CWH_08_OPERATERS {
    public static void main(String[] args) {
        int a=4;
        int b=7;
        int c=a % b;  //Modulo operators
        System.out.println(c);
        b*=3;
        System.out.println(b);
        int a1= 7;
        int a2 = 7;
        System.out.println("sum is : "+(a1+a2));
        int a3 =7*a2;
        int a4 = 8/a1;
        int a5 = 8%5;    //Modulo Operater
        a2 += 8;         //b me 8 add kar do
        //System.out.println(a3);
        //System.out.println(a5);
        //System.out.println(a2);
        //System.out.println(8==7);
        //System.out.println(4>=8);
        //System.out.println(8<=8);
        //System.out.println(4<5 && 5>2);  // &&----and operator
        //System.out.println(4<5 || 8>6);   //  ||----or operator
        double f1 = 4.8%1.1;
        System.out.println(f1);
        // bit wise operators
        System.out.println(2&3);
        // 2--->-10
        // 3---->11
        //    --------
        //       10>----2
        System.out.println(2|3);
    }
}
