package ALGORITHMS.BACKTRACKING;

public class Rat_In_A_Meze {
    public static void main(String[] args) {

//        maze--->   1 0 0 0
//                   1 1 0 1
//                   0 1 0 0
//                   1 1 1 1
        int [][]mat=new int[][]{  {1,0,0,0},
                                  {1,1,0,1},
                                  {0,1,0,0},
                                  {1,1,1,1}    };

        int [][]mat2=new int[][]{ {1,1,1,1},
                                  {1,1,0,1},
                                  {1,1,0,1},
                                  {1,1,1,1}    };

//        int [][]sol=new int[4][4];
//        sol[0][0]=1;
//        path(mat,0,0,3,3,sol);

        int [][]sol2=new int[4][4];
        sol2[0][0]=1;
        ALL_path(mat2,0,0,3,3,sol2);



    }

    static void print_answer(int [][]arr){
        for(int []i:arr){
            for(int e:i){
                System.out.print(e+" ");
            }
            System.out.println();
        }
        System.out.println("------------------");
    }
    static boolean isSafe(int [][]mat,int i,int j,int fx,int fy){
        if( i>fx || j>fy || mat[i][j]==0) return false;
        return true;
    }

    static boolean path(int [][]mat,int i,int j,int fx,int fy,int [][]sol){
        if(i==fx && j==fy) {
            print_answer(sol);
            return true;
        }
        //System.out.println(i+" "+j);
        if(isSafe(mat,i+1,j,fx,fy)) {
            sol[i + 1][j] = 1;
            if(path(mat,i+1,j,fx,fy,sol)) {
                return true;
            }else {
                sol[i + 1][j] = 0;
                return false;
            }
        }

        if(isSafe(mat,i,j+1,fx,fy)) {
            sol[i][j+1] = 1;
            if(path(mat,i,j+1,fx,fy,sol)) {
                return true;
            }else {
                sol[i][j+1] = 0;
                return false;
            }
        }
        return false;
    }

    //For printing all path........................
    static void ALL_path(int [][]mat,int i,int j,int fx,int fy,int [][]ans){
        if(i==fx && j==fy) {
            print_answer(ans);
        }
        //System.out.println(i+" "+j);
        if(isSafe(mat,i+1,j,fx,fy)) {
            ans[i+1][j] = 1;
            ALL_path(mat,i+1,j,fx,fy,ans);
            ans[i+1][j] = 0;
        }
        if(isSafe(mat,i,j+1,fx,fy)) {
            ans[i][j+1] = 1;
            ALL_path(mat,i,j+1,fx,fy,ans);
            ans[i][j+1] = 0;
        }
    }

}
