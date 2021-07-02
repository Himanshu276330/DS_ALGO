package BACKTRACKING;

public class Sudoku_Problem {
    public static void main(String[] args) {

        mat=new int[][]{{1,0,3,0},
                        {0,0,2,1},
                        {0,1,0,2},
                        {2,4,0,0} };
        size=mat.length;
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
            if(isSafe(i,j,val)){
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
}
