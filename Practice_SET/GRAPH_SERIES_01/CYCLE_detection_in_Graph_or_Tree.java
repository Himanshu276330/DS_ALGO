package Practice_SET.GRAPH_SERIES_01;

import java.util.LinkedList;
import java.util.Scanner;

public class CYCLE_detection_in_Graph_or_Tree {
    public static void main(String[] args) throws Exception{

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no of Vertex and Edges : ");
        int v=sc.nextInt();
        int e=sc.nextInt();

        implimentation(v);

        System.out.println("Enter "+e+" Edges : ");
        for(int i=0;i<e;i++){
            int s=sc.nextInt();
            int d=sc.nextInt();
            toAdd(s,d);
        }

        boolean isPresent=dfsForCycle(1,-1);
        System.out.println("Cycle present is : "+isPresent);


    }
    static boolean [] vis=new boolean[100001];
    static boolean dfsForCycle(int node,int parent){
        vis[node]=true;

        for(Integer child : adj[node]){
            if(!vis[child]){
                if(dfsForCycle(child,node)) return true;
            }else{
                if(child!=parent) return true;
            }
        }
        return false;
    }

    static LinkedList<Integer> [] adj;
    static void implimentation(int v){
        adj=new LinkedList[v+1];
        for(int i=0;i<v+1;i++){
            adj[i]=new LinkedList<>();
        }
    }

    static void toAdd(int source,int destination){
        adj[source].add(destination);
        adj[destination].add(source);
    }
}