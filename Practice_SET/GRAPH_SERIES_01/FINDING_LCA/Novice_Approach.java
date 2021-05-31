package Practice_SET.GRAPH_SERIES_01.FINDING_LCA;

import java.util.LinkedList;
import java.util.Scanner;

public class Novice_Approach {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int vertex=sc.nextInt();
        int edges=sc.nextInt();
        Implementation(vertex);
        level=new int[vertex+1];
        parent=new int[vertex+1];
        //vis=new boolean[vertex+1];   //not required..
        for(int i=0;i<edges;i++){
            int s=sc.nextInt();
            int d=sc.nextInt();
            toAdd(s,d);
        }
        int root=1;
        level_dfs(root,1,-1);
        parent[root]=-1;

        int t=sc.nextInt();
        while(t-->0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            System.out.println(lca(a,b));
        }

    }//MAIN ENDS..................................................................................

    static int lca(int a,int b){
        if(level[a]>level[b]){
            int dis=level[a]-level[b];
            while(dis>0){
                a=parent[a];
                dis--;
            }
        }else {
            int dis = level[b] - level[a];
            while(dis>0){
                b=parent[b];
                dis--;
            }
        }
        if(a==b) return a;
        while(parent[a]!=parent[b]){
            a=parent[a];b=parent[b];
        }
        return parent[a];
    }

    static int []level;
    static int []parent;
    //static boolean []vis;
    static void level_dfs(int node,int l,int par){
        level[node]=l;
        parent[node]=par;
        //vis[node]=true;         //not required..
        for(int child:adj[node]){
            if(parent[node]!=child){
                parent[child]=node;
                level_dfs(child,level[node]+1,node);
            }
        }
    }

    static LinkedList<Integer> []adj;
    static void Implementation(int v){
        adj=new LinkedList[v+1];
        for(int i=1;i<=v;i++){
            adj[i]=new LinkedList<>();
        }
    }
    static void toAdd(int s,int d){
        adj[s].add(d);
        adj[d].add(s);
    }
}
