package HARRY_2021;

public class CWH_33_VARIABLE_ARGUMENT_IN_JAVA {
   static int sum(int a, int b){
        return a+b;
    }
    static int sum(int a, int b,int c){
        return a+b+c;
    }
    static int sum(int a, int b,int c,int d){
        return a+b+c+d;
    }

    // Above all method is done by below varargs method
    static int sum3(int ...array){       //Available as int [] arr
        int result=0;
        for (int i=0;i< array.length;i++){
            result+=array[i];
        }
        return result;
    }
    //This method require Atleast one integer
    static int sum4(int x, int ...array){       //Available as int [] arr
        int result=x;
        for (int i=0;i< array.length;i++){
            result+=array[i];
        }
        return result;
    }
    public static void main(String[] args) {

        System.out.println("Welcome to Varargs Tutorial");
        System.out.println("The sum of 4 and 5 : "+sum(4,5));
        System.out.println("The sum of 4 , 3 and 5 : "+sum(4,3,5));
        System.out.println("The sum of 4 , 3 ,2 and 5 : "+sum(4,3,2,5));
        //System.out.println("Sum of nothing : "+sum4());        // using by second arg method  it gives error
                                                                  // ,because in second arg method one integer required
        System.out.println("Sum of nothing : "+sum4(4));

    }
}
