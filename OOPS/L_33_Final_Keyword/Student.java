package OOPS.L_33_Final_Keyword;

public  class Student {
    //final class cant extended by other class
//public final class Student {


//    final int ROLL_NO;
//    final DATA_STRUCTURE.String NAME;
//
//     //this is called normal initializing block
//    {
//        ROLL_NO=4;
//    }
//
//    public Student(){
//        NAME="Anuj";
//    }

     int ROLL_NO;
     String NAME;

     public void greeting(){
         System.out.println("Good Morning");
     }
     public final void greeting2(){
         System.out.println("Good Morning");
     }

}
