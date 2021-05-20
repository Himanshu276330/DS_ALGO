package Practice_SET.RANDOM;

import CollectionFramework.L_51_Comparable_and_Comparator.Student;

import java.util.*;

public class test {
    public static void main(String[] args) {




    }//MAIN ENDS
}
public class Solution {
    public ArrayList<ArrayList<Integer>> prettyPrint(int A) {

        int row=A*2-1,col=A*2-1;

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

        Arr


    }
}







