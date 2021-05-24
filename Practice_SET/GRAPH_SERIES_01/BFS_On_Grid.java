package Practice_SET.GRAPH_SERIES_01;

import java.util.Deque;
import java.util.LinkedList;

public class BFS_On_Grid {
    public static void main(String[] args) {

        int [][]a=new int[][]{ {0,0,1,0,1,1},
                {1,1,1,1,1,1},
                {1,1,1,1,1,1},
                {1,1,1,1,1,1},
                {1,1,1,1,1,1},
                {1,1,1,1,1,1}   };

        BFS(2,2,a);
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                System.out.print(dist[i][j]+"  ");
            }
            System.out.println();
        }
              //OUTPUT--> 4 directional traversal.
        //4  3  2  3  4  5
        //3  2  1  2  3  4
        //2  1  0  1  2  3
        //3  2  1  2  3  4
        //4  3  2  3  4  5
        //5  4  3  4  5  6

        //OUTPUT--> 8 directional traversal.
        //2  2  2  2  2  3
        //2  1  1  1  2  3
        //2  1  0  1  2  3
        //2  1  1  1  2  3
        //2  2  2  2  2  3
        //3  3  3  3  3  3

    }

    static boolean [][]vis=new boolean[101][101];
    static int [][]dist=new int[101][101];

         //For 4 direction.
//    static int []dx={0,1,0,-1};
//    static int []dy={1,0,-1,0};

          //For travel in 8 direction.
    static int []dx8={0,1,0,-1,-1,-1,1,1};
    static int []dy8={1,0,-1,0,-1,1,1,-1};

    static void BFS(int i,int j,int [][]a){
        int row=a.length,col=a[0].length;
        vis[i][j]=true;
        dist[i][j]=0;
        Deque<Pair> q=new LinkedList<>();
        q.addLast(new Pair(i,j));

               //For 4 direction traversal
//        while(!q.isEmpty()){
//            Pair p=q.removeFirst();
//            int curF=p.first;
//            int curS=p.second;
//            for(int k=0;k<dx.length;k++){
//                if(isValid(curF+dx[k],curS+dy[k],a,row,col)){
//                    q.addLast(new Pair(curF+dx[k],curS+dy[k]));
//                    vis[curF+dx[k]][curS+dy[k]]=true;
//                    dist[curF+dx[k]][curS+dy[k]]=dist[curF][curS]+1;
//                }
//            }
//        }

        //For 4 direction traversal
        while(!q.isEmpty()){
            Pair p=q.removeFirst();
            int curF=p.first;
            int curS=p.second;
            for(int k=0;k<dx8.length;k++){
                if(isValid(curF+dx8[k],curS+dy8[k],a,row,col)){
                    q.addLast(new Pair(curF+dx8[k],curS+dy8[k]));
                    vis[curF+dx8[k]][curS+dy8[k]]=true;
                    dist[curF+dx8[k]][curS+dy8[k]]=dist[curF][curS]+1;
                }
            }
        }



    }
    static boolean isValid(int i,int j,int [][]a,int row,int col){
        return (i>=0 && i<row && j>=0 && j<col && !vis[i][j]);
    }

}
