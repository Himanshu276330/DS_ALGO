package Arrays;

import java.util.Scanner;

public class L_17_MULTIDIMENSIONAL_ARRAY {
    public static void main(String[] args) {


              //2D array
//        int a [][]= new int[5][3];             //5 row and 3 column  ,by default all value is 0
//        System.out.println(a[0][2]);
//
//        int a2[][] ={{1,2,3},{4,5,6},{7,8}};   //bracket ke under wala pahla bracket is 1st row then 2nd row
//        System.out.println(a2[0][2]);
//        System.out.println(a2[1][2]);
//        System.out.println(a2[2][1]);

//        int a3[][] = {                  //same as a2 ,visualise that
//                {1, 2, 3},
//                {4, 5, 6},
//                {7, 8}
//        };
//        System.out.println(a3[0][2]);
//        System.out.println(a3[1][2]);
//        System.out.println(a3[2][1]);

              //Question
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no of rows: ");
        int rows=sc.nextInt();
        System.out.print("Enter no of cols: ");
        int cols=sc.nextInt();

        int arr1[][]=new int[rows][cols];
        int arr2[][]=new int[rows][cols];
        for (int i=0;i<rows;i++){
            for (int j=0;j<cols;j++){
                System.out.printf("Enter the values of arr1[%d][%d] = ",i,j);
                arr1[i][j]=sc.nextInt();
            }
        }
        for (int i=0;i<rows;i++){
            for (int j=0;j<cols;j++){
                System.out.printf("Enter the values of arr2[%d][%d] = ",i,j);
                arr2[i][j]=sc.nextInt();
            }
        }
           //For addition dimension must be same
        int sumArr[][]=new int[rows][cols];
        for (int i=0;i<rows;i++){
            for (int j=0;j<cols;j++){
                sumArr[i][j]=arr1[i][j]+arr2[i][j];
            }
        }
        System.out.println("sumArray is :");
        for (int i=0;i<rows;i++){
            for (int j=0;j<cols;j++){
                System.out.print(sumArr[i][j]+" ");
            }
            System.out.println();
        }

    }
}
