package HARRY_2021;

public class CWH_29_PRACTICE_SET_CH_06 {
    public static void main (String[] args){

        //Solved by me
        //Question 01
/*        float []  f1 = new float[5];
        f1 [0]=1.2545f;
        f1 [1]=2.524f;
        f1 [2]=3.256f;
        f1 [3]=4.4354f;
        f1 [4]=5.342f;
        float sum=f1[0]+f1[1]+f1[2]+f1[3]+f1[4];
        System.out.println("Sum of all element of f1 = "+sum);

        //Harry
        float [] marks = {54.2f, 85.3f, 98.2f ,98.5f,100.0f};
        float sum2 =0f;
        for (int i=0; i< marks.length;i++){
            sum2=sum2+marks[i];
        }
        System.out.println("sum is = "+sum2);

        //
        float sum3=0;
        for (float element:marks){
            sum3=sum3+element;
        }
        System.out.println("The sum of marks is : "+sum3);

        for (float element:marks) System.out.print(element+" ");
        System.out.println();

        for (float element:marks){
            System.out.print(element+" ");
        }
        System.out.println();   */

        //Question 02
/*        float [] marks = {54.2f, 85.3f, 98.2f ,98.5f,100.0f};
        float num=54.2f;
        boolean isInArray=false;  //-->default value is false
        for (float element:marks){
            if (num==element){
                isInArray=true;
                break;
            }
        }
        if (isInArray) {
            System.out.println("The given value is present in array");
        }
        else System.out.println("The given value is not present in array");

        //Question 03
        //By me
        float totalMarks=0;
        float [] marksOfPhysics = {54.2f, 85.3f, 98.2f ,98.5f,100.0f};
        for (float element:marksOfPhysics){
            totalMarks=totalMarks+element;
        }
        System.out.println("Average marks of student in physics : "+(totalMarks/marksOfPhysics.length));

        //Harry  --->same that  */

        //Question 04
/*        int [][] matrix1 = {{1,2,3} ,{4,5,6}};
        int [][]  matrix2= {   { 8 ,9 , 6 },
                               { 11 ,58, 56}   };//--<JUST TO GIVE SOME CLARITY
        int [][] result = {{0,0,0},{0,0,0}};
        for (int i=0; i< matrix1.length; i++){  //for row no of time
            for (int j=0; j< matrix1[i].length;j++){   //for column no of time
                System.out.printf("Setting value for i=%d and j=%d\n",i,j);
                result[i][j]=matrix1[i][j]+matrix2[i][j];
            }

        }
        for (int i=0; i< matrix1.length; i++){  //for row no of time
            for (int j=0; j< matrix1[i].length;j++){   //for column no of time
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }  */

/*        //Question 05
        //new Code
        int b = Math.floorDiv(3,2);  //-->give greatest integral value just live greatest integral function
        System.out.println(b);

        int [] arr= {1,2,3,4,5,6};
        int l = arr.length;
        int n = Math.floorDiv(l,2);
        int temp;

        for (int i=0; i<n;i++){
            //swap arr[i] and arr[l-1-i]
            //a b temp
            //
            temp = arr[i];  //-->store a[i] to same a[i] for further use
            arr[i]=arr[l-1-i];
            arr[l-1-i]=temp;
        }
        for (int element:arr) System.out.print(element+" ");
        System.out.println();

        //Question 06
        int [] arr2 = {21,25,455,85,65,84};
        int max = 0;    //This works for only positive elements
        for (int e:arr2){
            if (e>max){
                max=e;
            }
        }
        System.out.println(max);

        System.out.println(Integer.MIN_VALUE); //-->this value is lowest in java
        System.out.println(Integer.MAX_VALUE); //-->this value is MAXIMUM in java

        int [] arr3 = {21,-25,455,85,65,84};
        int max3 = Integer.MIN_VALUE;  //-->ALSO GIVE -2147483648
        int max2 = -2147483648;    //This works for ANY POSITIVE OR NEGATIVE elements
        for (int e:arr3){
            if (e>max2){
                max2=e;
            }
        }
        System.out.println(max2);

        //Question 07
        int [] arr4 = {21,-22,455,-85,65,84};
        int min4 = Integer.MAX_VALUE;  //-->ALSO GIVE 2147483647
        int min5 = 2147483647;    //This works for ANY POSITIVE OR NEGATIVE elements
        for (int e:arr4){
            if (e<min4){
                min4=e;
            }
        }
        System.out.println(min4);   */

        //Question 08
        int [] array={1,2100,54,65,23};
        boolean isSorted = true;
        for (int i=0; i< array.length-1; i++){
            if (array[i]>array[i+1]){
                isSorted=false;
                break;
            }
        }
        if (isSorted){
            System.out.println("This array is sorted ");
        }
        else System.out.println("This array is not sorted");
    }
}
