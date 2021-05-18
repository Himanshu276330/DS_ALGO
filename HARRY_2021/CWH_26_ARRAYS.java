package HARRY_2021;

public class CWH_26_ARRAYS {
    public static void main(String[] args) {

        //Classroom of 500 students
        int[] marks = new int[5]; //-->declaration and memory allocation
        marks[0]=100;
        marks[1]=70;  //giving marks to array---initialition
        marks[2]=52;
        marks[3]=70;
        marks[4]=80;
        System.out.println(marks[3]);

        //method 2
        int[] marks2 = {20,65,98,65,45};
        System.out.println(marks2[2]);
    }
}
