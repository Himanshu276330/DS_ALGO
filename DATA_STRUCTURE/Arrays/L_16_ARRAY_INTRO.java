package DATA_STRUCTURE.Arrays;
import java.util.Scanner;

public class L_16_ARRAY_INTRO {
    public static void main(String[] args) {
        //representation of array
        //METHOD 01
//        int [] marks = new int[5];


                 //METHOD 02
        int[] marks2;
        marks2 = new int[5];


           //METHOD 03



        int marks4 [] ,classes;       //In this case only marks4 is array .classes is not a array it simply a variable
          int [] marks5 , classes2;      //In this case both marks4 and classes2 are array .


        int [] age  ={12,5,46,34,23};
        double [] marks = {1.0,3.14,9.05,5.0213,5.96};
        System.out.println(marks[1]);
        marks[1]=4.56;
        System.out.println(marks[1]);
        System.out.println(age[3]);

        for (int i=0; i< marks.length; i++){
            System.out.print(marks[i]+"  ");
        }


        //Question practice
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of student: ");
        int n = sc.nextInt();
        int [] marks10 = new int [n];
        int totalMarks=0;
        for (int i=0; i<n; i++){
            System.out.println("Enter marks of Roll no "+(i+1)+" : ");
            marks[i]= sc.nextInt();
        }
        for (int i=0; i<n; i++){
            totalMarks=totalMarks+marks10[i];
        }
        System.out.println("Average marks is: "+totalMarks/n);
    }
}
