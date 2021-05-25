package BACKTRACKING;

public class N_Queen_Problem {
    public static void main(String[] args) {

        int [][]a=new int[][]{{0,0,0,0},{0,0,0,0},{0,0,0,0},{0,0,0,0}};
        System.out.println(nQueen(a,0,a.length));
        print(a);

    }//MAIN ENDS.....................................................................

    static boolean nQueen(int [][]a,int row,int N){
        if(row==N) return true;
        for(int i=0;i<N;i++){
            if(isSafe(row,i,a)){
                a[row][i]=1;
                if(nQueen(a,row+1,N))
                    return true;
                a[row][i]=0;
            }
        }
        return false;
    }

    private static void print(int [][]a){
        for (int[] ints : a) {
            for (int j = 0; j < a.length; j++) {
                System.out.print(ints[j] + "  ");
            }
            System.out.println();
        }
    }

    private static boolean isSafe(int row,int col,int [][]a){
        int N=a.length;
        for(int i=row+1;i<N;i++){  //down
            if(a[i][col]==1) return false;
        }for(int i=row-1;i>=0;i--) {  //up
            if (a[i][col] == 1) return false;
        }
        // for(int i=col+1;i<N;i++){  //right        //this not required, because row++
        //     if(a[row][col]==1) return false;
        // }for(int i=col-1;i>=0;i--) {  //left
        //     if (a[row][i] == 1) return false;
        // }

        int i1=row+1,j1=col+1;
        while(i1<N && j1<N){  //bottom-right
            if(a[i1][j1]==1) return false;
            i1++;j1++;
        }
        int i2=row+1,j2=col-1;
        while(i2<N && j2>=0){  //bottom-left
            if(a[i2][j2]==1) return false;
            i2++;j2--;
        }
        int i3=row-1,j3=col+1;
        while(i3>=0 && j3<N){  //top-right
            if(a[i3][j3]==1) return false;
            i3--;j3++;
        }
        int i4=row-1,j4=col-1;
        while(i4>=0 && j4>=0){  //top-left
            if(a[i4][j4]==1) return false;
            i4--;j4--;
        }
        return true;
    }

}
