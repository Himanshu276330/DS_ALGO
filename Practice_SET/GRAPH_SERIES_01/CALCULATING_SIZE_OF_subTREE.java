package Practice_SET.GRAPH_SERIES_01;

import java.util.LinkedList;
import java.util.Scanner;

public class CALCULATING_SIZE_OF_subTREE {
    public static void main(String[] args) {

        //Given a tree ,construct an array subSize[] where subSize[x] stored the size of subTree
        //rooted at node x.

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

        dfs(1);
        for(int i=1;i<=v;i++){
            System.out.println("SIze of "+i+" is --> "+distance[i]);
        }


    }//MAIN ENDS..

    static boolean [] vis=new boolean[100001];
    static int [] distance=new int[100001];
    static int dfs(int node){
        vis[node]=true;
        int size=1;
        for(int child:adj[node]){
            if(!vis[child]){
                size+=dfs(child);
            }
        }
        distance[node]=size;
        return size;
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
