package apniKaksha;

public class L_7_if_else {
    public static void main(String[] args) {

        int noOfPattern = 5;
        if(noOfPattern %2 ==0){
            System.out.println("This no is even");
            System.out.println("He love me not");
        }
        else {
            System.out.println("This no is odd");
            System.out.println("He love me");
        }

        int number = 23;
        if (number<=10){
            System.out.println("no is less than 10");
        }
        else if (number>=10 && number<=20){
            System.out.println("no is b/w 10 to 20");
        }
        else{
            System.out.println("no is more than 20");

        }

            // ternary operator
        int a = 7;
        int b = 9;
        int max = ( a>b) ? a : b;
        System.out.println("max no is "+max);

        int max2 = Math.max(a, b);
        System.out.println("max no is "+max2);

    }
}
