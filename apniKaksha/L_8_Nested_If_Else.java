package apniKaksha;

public class L_8_Nested_If_Else {
    public static void main(String[] args) {

        int a=8, b=9, c=30;
        if (a>b){
            if (c>a){
                System.out.println("The greatest no is: "+c);
            }
            else{
                System.out.println("The greatest no is: "+a);
            }
        }
        else{
            if (b>c){
                System.out.println("The greatest no is: "+b);
            }
            else{
                System.out.println("The greatest no is: "+c);
            }
        }

        //Nested in Ternary operators
        int greatestInteger = a>b ? (a>c ? a:c) : (b>c ? b:c);
        System.out.println("The greatest integer is: "+greatestInteger);



    }
}
