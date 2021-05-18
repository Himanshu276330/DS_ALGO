package Practice_SET.GRAPH_SERIES_01;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Finding_DIAMETER_of_GRAPH_TREE {
    public static void main(String[] args) {

        //DIAMETER_of_TREE --> It is defined as the longest path b/w any two nodes i tree
        //Path is measured in terms of edges.

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no of Vertex and Edges : ");
        int v=sc.nextInt();
        int e=sc.nextInt();

        Implementation(v);

        System.out.println("Enter "+e+" Edges : ");
        for(int i=0;i<e;i++){
            int s=sc.nextInt();
            int d=sc.nextInt();
            addEdge(s,d);
        }

        maxD=-1;
        maxNode = 1;
        dfs(1,0);

        for(int i=0;i<=v;i++){
            vis[i]=false;
        }
        maxD=-1;
        dfs(maxNode,0);

        System.out.println("Diameter of tree is : "+maxD);

    }//MAIN ENDS

    static int maxD,maxNode;
    static boolean [] vis=new boolean[100001];
    static void dfs(int node, int d){
        vis[node]=true;
        if(d>maxD){
            maxD=d;
            maxNode=node;
        }
        for(int child:adj[node]) {
            if (!vis[child]) {
                dfs(child, d + 1);
            }
        }
    }

    //Implementation of graph..
    static  LinkedList<Integer>[] adj;
    static void  Implementation(int v){
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
