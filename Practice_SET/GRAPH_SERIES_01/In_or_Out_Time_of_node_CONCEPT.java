package Practice_SET.GRAPH_SERIES_01;

import java.util.LinkedList;
import java.util.Scanner;

public class In_or_Out_Time_of_node_CONCEPT {
    public static void main(String[] args) {

        //This concept is used to find whether two node is present in same sub tree or not

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


        System.out.print("Enter no of test perform : ");
        int t=sc.nextInt();
        int timer=1;
        dfs(1);
        while(t-->0){
            System.out.print("Enter node 1 and node 2 for checking ..");
            int node1=sc.nextInt();
            int node2=sc.nextInt();
            dfsCheck(node1,node2);
        }

              //for debugging
//        for(int i=0;i<=v;i++){
//            System.out.println(inTime[i]);
//        }
//        for(int i=0;i<=v;i++){
//            System.out.println(outTime[i]);
//        }

    } //MAIN END

    static int [] inTime=new int[100001];
    static int [] outTime=new int[100001];
    static boolean [] vis=new boolean[100001];
    static void dfsCheck(int node1,int node2){
        if(((inTime[node1]-inTime[node2])*(outTime[node1]-outTime[node2]))<0){
            System.out.println("Yes, "+node1+" ans "+node2+" lies on a subtree.");
        }else {
            System.out.println("No, " + node1 + " ans " + node2 + " not lies on a subtree.");
        }
    }

    static int timer=1;
    static void dfs(int node){
        vis[node]=true;
        inTime[node]=timer++;

        for(Integer child:adj[node]){
            if(!vis[child]){
                dfs(child);
            }
        }
        outTime[node]=timer++;
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
