package Recuesion_Problem;

public class ADV_L_9_TotalWay_In_N_M_Matrix {
    public static void main(String[] args) {

        System.out.println(noOfPath(2,2));

    }

    static int noOfPath(int row , int col ){
        if(row==1 || col==1) return 1;

        return noOfPath(row-1,col) + noOfPath(row,col-1);
    }


}
