package HARRY_2021;

public class CWH_32_METHOD_OVERLOADING {
    static void tellJoke(){
        System.out.println("I invented a new word!\n"
                +"  plagiarism");
    }

    static void change (int a) {
        a = 98;
    }

    static void change2(int [] arr){
        arr[0]=98;
    }
    
    static void foo(){
        System.out.println("GOOD MORNING BRO!");
    }
    static void foo(int a1){
        System.out.println("GOOD MORNING "+a1+" BRO!");
    }
    static void foo(int a1,int b1){
        System.out.println("GOOD MORNING "+a1+" BRO!");
        System.out.println("GOOD MORNING "+b1+" BRO!");
    }
    

    public static void main(String[] args) {
        tellJoke();
        //CASE-1  CHANGING THE  INTEGER
        int x=45;
        change(x);
        System.out.println("The value of x after change is : "+x); //this means x not change but array change see below
        
        //CASE--2 CHANGING THE ARRAY
        int[] marks={54,85,56,98,87,52};
        change2(marks);
        System.out.println("The value of marks after change is : "+marks[0]);
        //IN CASE OF ARRAY ,THE REFERENCE IS PASSED .SAME IS THE CASE FOR OBJECT PASSING TO METHOD.
        
        //METHOD OVER LOADING
        int a1=500;
        int b1= 400;
        foo();
        foo(a1);
        foo(a1,b1);
        foo(400);   //for this just type no
        foo(400,500);
        //ARGUMENTS ARE ACTUAL
        //METHOD OVERLOADING CANT BE PERFORMED BY CHANGING THE RETURN TYPE OF METHOD .
    }
}
