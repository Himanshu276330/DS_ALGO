package Practice_SET.GRAPH_SERIES_01;
import java.util.*;

public class Finding_Bridges_in_Graph {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of vertices and edges : ");
        int v=sc.nextInt();
        int e=sc.nextInt();
        Implimentation_Of_Graph(v);

        System.out.println("Enter "+e+" edges");
        for (int i=0;i<e;i++){
            int source=sc.nextInt();
            int destination=sc.nextInt();
            addEdge(source,destination);
        }

        dfs(1,-1);



    }//MAIN ENDS...............................................................................................

    static int [] in=new int[1001];
    static int [] low=new int[1001];
    static int timer;                             //Global variable initialise as 0.
    static void dfs(int node,int parent){
        vis[node]=true;
        in[node]=low[node]=timer++;

        for(int child:adj[node]){
            if(child==parent) continue;
            if(vis[child]){
                low[node]=Math.min(low[node],in[child]);
            }else{
                dfs(child,node);
                if(low[child]>in[node]){
                    System.out.println(node +" -> "+child+" is a bridge");
                }
                low[node]=Math.min(low[child],low[node]);
            }
        }

    }
    static boolean [] vis=new boolean[1001];

    static  LinkedList<Integer>[] adj;
    static void  Implimentation_Of_Graph(int v){
        adj=new LinkedList[v+1];
        for (int i=0;i<v+1;i++){
            adj[i]= new LinkedList<>();
        }
    }
    static void addEdge(int source,int destination){
        adj[source].add(destination);
        adj[destination].add(source);
    }
}
