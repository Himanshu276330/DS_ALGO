package DATA_STRUCTURE.GRAPH_SERIES_01;

import java.util.*;

public class DIJKSTRA_Algorithm {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of vertex and edges : ");
        int v=sc.nextInt();
        int e=sc.nextInt();
        Implementation(v);
        System.out.println("Enter edges and weight : ");
        for(int i=0;i<e;i++){
            int s=sc.nextInt();
            int d=sc.nextInt();
            int w=sc.nextInt();
            toAdd(s,d,w);
        }
        q=new PriorityQueue<>(Comparator.comparing(Pair -> Pair.second)); //Pair.first== node ,Pair.second== weight..
        dist_w=new int[v+1];
        Arrays.fill(dist_w,Integer.MAX_VALUE);
        dist_w[1]=0;
        bfs(1);    //Suppose root is 1;
        System.out.println("Enter no of test cases : ");
        int t=sc.nextInt();
        while(t-->0){
            int node=sc.nextInt();
            System.out.println(dist_w[node]);
        }

    }//MAIN ENDS........................................................................................................

    static void bfs(int node){
        q.add(new Pair(node,0));
        while (!q.isEmpty()){
            int edge=q.peek().first;
            int wei=q.poll().second;
            for(Pair child:adj[edge]){
                int child_node= child.first;
                int child_wei= child.second;
                if(dist_w[child_node]>wei+child_wei) {
                    dist_w[child_node] = Math.min(dist_w[child_node], wei + child_wei);
                    q.add(new Pair(child_node, dist_w[child_node]));
                }
            }
        }
    }

    static int []dist_w;
    static PriorityQueue<Pair> q;

    static LinkedList<Pair> []adj;
    static void Implementation(int v){
        adj=new LinkedList[v+1];
        for(int i=1;i<=v;i++){
            adj[i]=new LinkedList<>();
        }
    }
    static void toAdd(int s,int d,int w){
        adj[s].add(new Pair(d,w));
        adj[d].add(new Pair(s,w));
    }
}

