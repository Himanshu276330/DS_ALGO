package DATA_STRUCTURE.GRAPH_SERIES_01;

import java.util.LinkedList;
import java.util.Scanner;

public class To_Check_it_a_TREEorNOT {
    public static void main(String[] args) {

        //Condition of Tree:
        //1.By any node we travel all node , (Means --> connected component is 1)
        //2.Not contain any cycle , (mean --> Edges should be = [ totalNODE - 1 ]  ),

        Scanner sc=new Scanner(System.in);
        //Implimentation of graph.
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

        int count_of_ConnectedComponent_CC=0;
        for(int i=1;i<=v;i++){
            if(!vis[i]){
                dfs(i);
                count_of_ConnectedComponent_CC++;
            }
        }

        if(e==v-1 && count_of_ConnectedComponent_CC==1){
            System.out.println("Yes, it is a tree");
        }else{
            System.out.println("No, it is not a tree");
        }

    }
    static void dfs(int node){
        vis[node]=true;
        for(Integer e:adj[node]){
            if(!vis[e])
                dfs(e);
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
