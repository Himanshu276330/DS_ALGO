package DATA_STRUCTURE.GRAPH_SERIES_01;

public class Count_CC_In_Grid_By_Dfs {
    public static void main(String[] args) {

        int [][]a=new int[][]{ {0,0,1,0,1,1},
                               {0,1,1,0,0,1},
                               {0,1,0,0,0,0},
                               {1,0,1,1,0,0},
                               {0,0,0,1,0,0},
                               {0,1,1,0,1,1}   };
        int row=a.length;
        int col=a[0].length;
        for(int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                if(a[i][j]==1 && !vis[i][j]) {
                    dfs(i, j, a, row, col);
                    count++;
                }
            }
        }
        System.out.println("No of connected Component : "+count);

    }

    static int count;     //Global variable initialise with zero.
    static boolean [][]vis=new boolean[100][100];
    static void dfs(int i,int j,int [][]a,int row,int col){
        vis[i][j]=true;
        if(isValid(i-1,j,a,row,col))
            dfs(i-1,j,a,row,col); //UP

         if(isValid(i,j+1,a,row,col))
            dfs(i,j+1,a,row,col); //right

         if(isValid(i+1,j,a,row,col))
            dfs(i+1,j,a,row,col); //down

         if(isValid(i,j-1,a,row,col))
            dfs(i,j-1,a,row,col); //left
    }

    static boolean isValid(int i,int j,int [][]a,int row,int col){
        return (i>=0 && i<row && j>=0 && j<col && !vis[i][j] && a[i][j]==1);
    }
}
