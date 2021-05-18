package Practice_SET.GRAPH_SERIES_01;
import  java.util.*;

  public class SSSP_usingDFS {
      public static void main(String[] args) {

//          There are N countries {1,2,3,4....N} and N-1 roads(i.e depicting a tree)
//
//          Bishu lives in the Country 1 so this can be considered as the root of the tree.
//                  Now there are Q girls who lives in various countries (not equal to 1) .
//                  All of them want to propose Bishu.But Bishu has some condition.
//                  He will accept the proposal of the girl who lives at minimum distance from his country.
//                  Now the distance between two countries is the number of roads between them.
//          If two or more girls are at the same minimum distance then he will accept the proposal of the girl who lives in a country with minimum id.
//          No two girls are at same country.
//                  Input: First line consists of N,i.e number of countries Next N-1 lines follow the type u v
//                  which denotes there is a road between u and v. Next line consists of Q Next Q lines consists of x where the girls live.

//                  Output: Print the id of the country of the girl who will be accepted.

//                  Help Him!!!!!
//
//                  contrain: 2<=N<=1000 1<=u,v<=N 1<=Q<=(N-1)
//
//          Sample Input
//          6
//          1 2
//          1 3
//          1 4
//          2 5
//          2 6
//          4
//          5
//          6
//          3
//          4
//          Sample Output
//          3

          // Write your code here


          Scanner sc = new Scanner(System.in);
          int v=sc.nextInt();
          inplimentation(v);

          for(int i=0;i<v-1;i++){
              int s=sc.nextInt();
              int d=sc.nextInt();
              addEdges(s,d);
          }

          int prop=sc.nextInt();
          int [] girl=new int[prop];
          for(int i=0;i<prop;i++){
              int g=sc.nextInt();
              girl[i]=g;
          }

          dfs(1,0);

          int dist=Integer.MAX_VALUE;

          int f=Integer.MAX_VALUE;
          for(int i=0;i<prop;i++){
              dist=Math.min(dist,distance[girl[i]]);
              if(distance[girl[i]]==dist){
                  f=Math.min(f,girl[i]);
              }else{
                  f=Math.min(girl[i],girl[i]);
              }
          }
          System.out.println(f);


      }//MAIN END

      static void dfs(int node,int d){
          vis[node]=true;
          distance[node]=d;
          for(Integer e:adj[node]){
              if(!vis[node]){
                  dfs(e,distance[node]+1);
              }
          }
      }


      static boolean [] vis=new boolean[1001];
      static int [] distance=new int [1001];


      static LinkedList<Integer> [] adj;
      static void inplimentation(int v){
          adj=new LinkedList[v+1];
          for(int i=0;i<v+1;i++){
              adj[i]=new LinkedList<>();
          }
      }
      static void addEdges(int s,int d){
          adj[s].add(d);
          adj[d].add(s);
      }

  }




