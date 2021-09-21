package DATA_STRUCTURE.GRAPH_SERIES_01;

public class DFS_traversal_in_2D_Grid {
    public static void main(String[] args) {

        int [][]demo=new int[][]{{1, 2, 3, 4, 5},
            {6, 7, 8, 9, 10},
            {11, 12, 13, 14, 15},
            {16, 17, 18, 19, 20}};
       // System.out.println(demo[0][4]);
        dfs(0,0,demo);

//        1 2 3 4 5 10 15 20 19 14 9 8 13 18 17 12 7 6 11 16
    }//MAIN ENDS.........................................................................

    static boolean [][]vis=new boolean[100][100];
    static int row=4,col=5;

          //METHOD-->2..
    static int []dx={-1 ,0 ,1 ,0};
    static int []dy={0  ,1 ,0 ,-1};
    static void dfs(int x,int y,int [][]demo){
        vis[x][y]=true;
        System.out.print(demo[x][y]+" ");
          //Direction is 4 type always.
        for(int i=0;i<4;i++){
            if(isValid(x+dx[i],y+dy[i]))
                dfs(x+dx[i],y+dy[i],demo);
        }
    }

          //METHOD --> 01
//    static void dfs(int x,int y,int [][]demo){
//        vis[x][y]=true;
//        System.out.print(demo[x][y]+" ");
//
//        if(isValid(x-1,y))
//            dfs(x-1,y,demo); //UP.
//
//         if(isValid(x,y+1))
//            dfs(x,y+1,demo); //RIGHT
//
//         if(isValid(x+1,y))
//            dfs(x+1,y,demo); //Down.
//
//         if(isValid(x,y-1))
//            dfs(x,y-1,demo); //LEFT.
//    }
    static boolean isValid(int x,int y){
        return x < row && y < col && x >= 0 && y >= 0 && !vis[x][y];
    }
}
