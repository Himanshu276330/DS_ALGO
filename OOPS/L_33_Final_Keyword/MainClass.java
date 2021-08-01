package OOPS.L_33_Final_Keyword;

public class MainClass extends Student{
      //We must initialise final variable in class ,otherwise compiler will throw compile time error
//    final int Roll_no;

//    final int ROLL_NO=4;

    public void greeting(){
        System.out.println("Good Morning Gi");
    }

         //final method() cant be override
//     public final void greeting2(){
//        System.out.println("Good Morning gi");
//    }

    public static void main(String[] args) {

//        DATA_STRUCTURE.String name="Anuj";
//        name="Kumar";
//        System.out.println(name);

//        final DATA_STRUCTURE.String name2="Anuj";
//        name2="Kumar";          //Give error

          //But in case of local variable we not need to initialise at that point  ,it not give error
//        final int ROLL_NO;

//        Student obj=new Student();
//        Student obj2=new Student();
//        obj=obj2;
//        obj2.NAME="kumar";
//        obj.NAME="kumar";

        final Student obj=new Student();
        Student obj2=new Student();
        //obj=obj2;        //gives error
        obj2.NAME="kumar";
        obj.NAME="kumar";




    }
}
