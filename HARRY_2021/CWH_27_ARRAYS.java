package HARRY_2021;

public class CWH_27_ARRAYS {
    public static  void main(String[] args) {


        int[] marks = new int[3];
        marks[0]=10;
        marks[1]=100;
        marks[2]=1000;
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);

        int[] toy;
        toy = new int[3];
        toy[0]=10;
        toy[1]=100;
        toy[2]=1000;
        System.out.println(toy[0]);
        System.out.println(toy[1]);
        System.out.println(toy[2]);


        int[] marks2 = {20,65,98,65,45};
        System.out.println(marks2[2]);
        System.out.println(marks2.length);
        float[] f1 = {95.2f,85.5f};
        System.out.println(f1[1]);

        String [] s1 = {"himanshu","vishal","harry"};
        System.out.println(s1[2]);

        int[] marks3 = {20,65,98,65,45};
        System.out.println(marks3[0]);
        System.out.println(marks3[1]);
        System.out.println(marks3[2]);
        System.out.println(marks3[3]);
        System.out.println(marks3[4]);

        System.out.println("printing using for loop");
        for (int i=0; i< marks3.length ;i++){
            System.out.print(marks3[i]+" ");
        }
        System.out.println();
        //reversed order
        for (int i2= marks3.length-1; i2>=0 ;i2--){
            System.out.print(marks3[i2]+" ");
        }
        System.out.println();

        //modern method
        //For each loop
        for(int element: marks3){
            System.out.println(element);
        }



    }
}
