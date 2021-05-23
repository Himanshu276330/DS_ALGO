package Practice_SET.RANDOM;

import java.util.ArrayList;
import java.util.Scanner;

public class Spiral_Matrix_Problem {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("No of test cases : ");
        int t=sc.nextInt();
        while(t-->0) {
            System.out.println("No of row and columns : ");
            int row=sc.nextInt();
            int col=sc.nextInt();

            int top = 0, bottom = row - 1;
            int left=0, right=col-1;
            int [][] ans=new int[row][col];

            int d=0;
            int n=row;
            while (left<=right && top<=bottom) {
                if (d == 0) {
                    for (int i = left; i <= right; i++) {
                        ans[top][i]=n;
                    }
                    d = 1;
                    top++;

                } else if (d == 1) {
                    for (int i = top; i <= bottom; i++) {
                        ans[i][right]=n;
                    }
                    right--;
                    d = 2;

                } else if (d == 2) {
                    for (int i = right; i >= left; i--) {
                        ans[bottom][i]=n;
                    }
                    bottom--;
                    d = 3;

                } else if (d == 3) {
                    for (int i = bottom; i >= top; i--) {
                        ans[i][left]=n;
                    }
                    left++;
                    d = 0;
                    n++;
                }
            }

            //Printing pattern..
            for(int i=0;i<row;i++){
                for(int j=0;j<col;j++){
                    System.out.print(ans[i][j]+" ");
                }
                System.out.println();
            }
            System.out.println("\n");

        }
    }
}
