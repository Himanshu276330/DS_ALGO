package Practice_SET.GRAPH_SERIES_01;

import java.util.LinkedList;
import java.util.Scanner;

public class To_Check_it_BIPARTITE_GRAPH_or_NOT {
    public static void main(String[] args) {

        //** Bipartite graph also know as BiGraph special graph such that
        //  you can divide the vertex set into 2 disJoint sets such that :-
        //  1.Each vertex belong to exactly one of the 2 sets.
        //  2.Each edges connects vertices of 2 different sets.

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

        System.out.println(dfs(1,1));



    } //MAIN ENDS..

    static boolean [] vis=new boolean[1001];
    static int [] col=new int[1001];    //col --> color.

    static boolean dfs(int node,int color){
        vis[node]=true;
        col[node]=color;

        for(Integer child:adj[node]){
            if( ! vis[child]){
                if( ! dfs(child,color^1)) return false;
            }else
                if(col[node]==col[child])
                    return false;
        }
        return true;
    }

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
