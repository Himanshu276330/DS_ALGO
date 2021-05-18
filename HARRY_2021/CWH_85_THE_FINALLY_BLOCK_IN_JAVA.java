package HARRY_2021;

public class CWH_85_THE_FINALLY_BLOCK_IN_JAVA {
//    public static  int greet(){
//        try{
//            int a=60;
//            int b=2;
//            int c=a/b;
//            return c;    //In this place   greet() method exit but finally() method phir bhi execute hoga
//        }catch (Exception e){
//            System.out.println(e);
//        }
//        finally {
//            System.out.println("Cleaning up ...This is the end of this Function");
//        }
//        return 0;
//    }
    public static void main(String[] args) {
//        System.out.println(greet());

        //Quick Quiz
//        int a=5;
//        int b=9;
//        while(true){
//            try{
//                System.out.println(a/b);
//            }catch (Exception e){
//                System.out.println(e);
//                break;
//            }finally {
//                System.out.println("I am finally for value of b = " + b);
//            }
//            b--;
//        }
        try{
            System.out.println(30/0);  //This run without catch but in that we not handle error so aage ka code nahi chalega
        }finally {                                               //par agar ham catch used karenge to aage ka bhi code chale ga
            System.out.println("I am finally");
        }
        System.out.println("ending");

    }
}
