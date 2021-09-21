package DATA_STRUCTURE.GRAPH_SERIES_01;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Social_Networking_Graph_Problem {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int v=sc.nextInt();
        int e=sc.nextInt();

        Implementation(v);
        for(int i=0;i<e;i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            toAdd(a,b);
        }


        while(t-->0){
            System.out.println("Enter root and dist from it to find node..");
            int root=sc.nextInt();
            int d=sc.nextInt();
            Arrays.fill(vis,false);
            Arrays.fill(dist,0);
            bfs(root);
            int count=0;
            for(int i=1;i<=v;i++){
                if(dist[i]==d) count++;
            }
            System.out.println("Node are :"+count);
        }


    }
    static int [] dist=new int[1000001];
    static boolean []vis=new boolean[1000001];
    static void bfs(int root){
        Deque<Integer> q=new LinkedList<>();
        q.add(root);
        vis[root]=true;
        dist[root]=0;
        while(!q.isEmpty()){
            int cur=q.removeFirst();
            for(int child : adj[cur]){
                if(!vis[child]) {
                    vis[child] = true;
                    dist[child] = dist[cur] + 1;
                }

            }
        }
    }

    static LinkedList<Integer> [] adj;
    static void Implementation(int v){
        adj=new LinkedList[v+1];
        for(int i=0;i<=v;i++){
            adj[i]=new LinkedList<>();
        }
    }
    static void toAdd(int a,int b){
        adj[a].add(b);
        adj[b].add(a);
    }
}
