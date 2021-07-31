package BACKTRACKING;

public class Sudoku_Problem {
    public static void main(String[] args) {

//        mat=new int[][]{{1,0,3,0},
//                        {0,0,2,1},
//                        {0,1,0,2},
//                        {2,4,0,0} };
//        size=mat.length;
//        solve();


        mat=new int[][] {{3 , 0, 6, 5, 0, 8, 4, 0, 0},
                         {5 , 2, 0, 0, 0, 0, 0, 0, 0},
                         {0 , 8, 7, 0, 0, 0, 0, 3, 1},
                         {0 , 0, 3, 0, 1, 0, 0, 8, 0},
                         {9 , 0, 0, 8, 6, 3, 0, 0, 5},
                         {0 , 5, 0, 0, 9, 0, 6, 0, 0},
                         {1 , 3, 0, 0, 0, 0, 2, 5, 0},
                         {0 , 0, 0, 0, 0, 0, 0, 7, 4},
                         {0 , 0, 5, 2, 0, 6, 3, 0, 0}};

        size=9;
        solve();


    }//main Ends........................................
    static int [][]mat;
    static int size;
    static boolean solve(){
        int i=0,j=0;
        boolean b=false;
        for(int x=0;x<size;x++) {
            for (int y=0;y < size; y++) {
                if (mat[x][y] == 0) {
                    b=true;
                    i=x;j=y;
                    break;
                }
            }
            if(b) break;
        }
        System.out.println(i+" "+j);
        for(int val=1;val<=size;val++){
            if(isSafe2(i,j,val)){
                mat[i][j]=val;
                System.out.println(val+" ----val");
                if(i==size-1 && j==size-1) {
                    print();
                    return true;
                }
                if(solve()){
                    return true;
                }
                mat[i][j]=0;
            }
        }
        return false;
    }

    static void print(){
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }

    //IsSafe function.............................
    static boolean isSafe(int x,int y,int val){
        for(int i=0;i<size;i++){  //for col..
            if(mat[i][y]==val) return false;
        }
        for(int i=0;i<size;i++){ //for row..
            if(mat[x][i]==val) return false;
        }

        int r= (int) Math.sqrt(size)-1; ///r = 1
        //For block...01
        if(x>=0 && x<=r && y>=0 && y<=r){
            for(int i=0;i<=r;i++){
                for(int j=0;j<=r;j++){
                    if(mat[i][j]==val) return false;
                }
            }
        }
        //For block...02
        if(x>=0 && x<=r && y>=r+1 && y<=size-1){
            for(int i=0;i<=r;i++){
                for(int j=r+1;j<=size-1;j++){
                    if(mat[i][j]==val) return false;
                }
            }
        }
        //For block...03
        if(x>=r+1 && x<=size-1 && y>=0 && y<=r){
            for(int i=r+1;i<=size-1;i++){
                for(int j=0;j<=r;j++){
                    if(mat[i][j]==val) return false;
                }
            }
        }
        //For block...04
        if(x>=r+1 && x<=size-1 && y>=r+1 && y<=size-1){
            for(int i=r+1;i<=size-1;i++){
                for(int j=r+1;j<=size-1;j++){
                    if(mat[i][j]==val) return false;
                }
            }
        }
        return true;
    }


    static boolean isSafe2(int i,int j,int val){
        //row
        for(int a=0;a<size;a++){
            if(mat[a][j]==val) return false;
        }

        //col
        for(int b=0;b<size;b++){
            if(mat[i][b]==val) return false;
        }

        //block 1;
        if(i<=2 && j<=2){
            for(int a=0;a<=2;a++){
                for(int b=0;b<=2;b++){
                    if(mat[a][b]==val) return false;
                }
            }
        }
        //block 2;
        if(i>2 && i<=5 && j<=2){
            for(int a=3;a<=5;a++){
                for(int b=0;b<=2;b++){
                    if(mat[a][b]==val) return false;
                }
            }
        }//block 3;
        if(i>5 && j<=2){
            for(int a=6;a<=8;a++){
                for(int b=0;b<=2;b++){
                    if(mat[a][b]==val) return false;
                }
            }
        }
        //block 4;
        if(i<=2 && j>2 && j<=5){
            for(int a=0;a<=2;a++){
                for(int b=3;b<=5;b++){
                    if(mat[a][b]==val) return false;
                }
            }
        }
        //block 5;
        if(i>2 && i<=5 && j>2 && j<=5){
            for(int a=3;a<=5;a++){
                for(int b=3;b<=5;b++){
                    if(mat[a][b]==val) return false;
                }
            }
        }
        //block 6;
        if(i>5 && j>2 && j<=5){
            for(int a=6;a<=8;a++){
                for(int b=3;b<=5;b++){
                    if(mat[a][b]==val) return false;
                }
            }
        }
        //block 7;
        if(i<=2 && j>=6 && j<=8){
            for(int a=0;a<=2;a++){
                for(int b=6;b<=8;b++){
                    if(mat[a][b]==val) return false;
                }
            }
        }
        //block 8;
        if(i>2 && i<=5 && j>=6){
            for(int a=3;a<=5;a++){
                for(int b=6;b<=8;b++){
                    if(mat[a][b]==val) return false;
                }
            }
        }
        //block 9;
        if(i>=6 && j>=6){
            for(int a=6;a<=8;a++){
                for(int b=6;b<=8;b++){
                    if(mat[a][b]==val) return false;
                }
            }
        }
        return true;
    }
}
