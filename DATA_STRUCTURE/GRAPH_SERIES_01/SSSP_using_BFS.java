package DATA_STRUCTURE.GRAPH_SERIES_01;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class SSSP_using_BFS {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        //Implimentation of graph.
        System.out.println("Enter no of vertices and edges : ");
        int v=sc.nextInt();
        int e=sc.nextInt();
        implementation(v);

        System.out.println("Enter "+e+" edges");
        for (int i=0;i<e;i++){
            int source=sc.nextInt();
            int destination=sc.nextInt();
            addEdges(source,destination);
        }

        int root=3;
        //Find shortest distance of 7 from root.
        bfs(3);

        for(int i=1;i<=v;i++){
            System.out.println(dis[i]);
        }


    }//MAIN ENDS...

    static boolean [] vis=new boolean[100001];
    static int [] dis=new int[100001];
    static Deque<Integer> deque=new LinkedList<>();
    static void bfs(int node){
        deque.addLast(node);
        vis[node]=true;
        int cur;
        while(!deque.isEmpty()){
            cur=deque.removeFirst();
            for(int child:adj[cur]){
                if(!vis[child]) {
                    vis[child]=true;
                    dis[child] = dis[cur] + 1;
                    deque.addLast(child);
                }
            }
        }
    }

    static LinkedList<Integer>[] adj;
    static void implementation(int v){
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
