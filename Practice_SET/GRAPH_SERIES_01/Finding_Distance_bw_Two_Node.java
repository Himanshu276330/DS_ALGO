package Practice_SET.GRAPH_SERIES_01;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Finding_Distance_bw_Two_Node {
    public static void main(String[] args) {

        //This use concept of LCA..
        //Dist(int a,int b) == level[a] + level[b] - 2*level[LCA(int a,int b)].
        Scanner sc=new Scanner(System.in);
        int vertex=sc.nextInt();
        int edges=sc.nextInt();

        maxN=(int)(Math.log10(vertex)/Math.log10(2));
        Implementation(vertex);

        level=new int[vertex+1];
        parent=new int[vertex+1];
        System.out.println("Enter total edges : ");
        for(int i=0;i<edges;i++){
            int s=sc.nextInt();
            int d=sc.nextInt();
            toAdd(s,d);
        }
        int root=1;
        level_dfs(root,1,-1);
        parent[root]=-1;

        LCA=new int[vertex+1][maxN+1];
        for(int i=0;i<maxN;i++)
            Arrays.fill(LCA[i],-1);

        dfs(1,-1);
        sparse_Table_init(vertex);

        System.out.println("Enter test cases : ");
        int t=sc.nextInt();
        while(t-->0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            System.out.println(getDist(a,b));
        }

    }//MAIN ENDS..................................................................................

    static int getDist(int a,int b){
        return level[a]+level[b]-2*level[lca(a,b)];
    }

    static int maxN;
    static int lca(int a,int b){
        if(level[a]>level[b]){
            int dis=level[a]-level[b];
            while(dis>0){
                int i=(int)(Math.log10(dis)/Math.log10(2));
                a=LCA[a][i];
                dis-=(1<<i);
            }
        }else {
            int dis = level[b] - level[a];
            while(dis>0){
                int i=(int)(Math.log10(dis)/Math.log10(2));
                b=LCA[b][i];
                dis-=(1<<i);
            }
        }
        if(a==b) return a;
        for(int i=maxN;i>=0;i--){
            if(LCA[a][i]!=-1 && (LCA[a][i]!=LCA[b][i])) {
                a = LCA[a][i];
                b = LCA[b][i];
            }
        }
        return parent[a];
    }
    //Creating sparse table for lca..
    static int [][]LCA;
    static void dfs(int node,int parent){
        LCA[node][0]=parent;
        for(int child:adj[node]){
            if(child!=parent)
                dfs(child,node);
        }
    }

    static void sparse_Table_init(int N){
        for(int j=1;j<=maxN;j++){
            for(int i=1;i<=N;i++){
                if(LCA[i][j-1]!=-1){
                    int par=LCA[i][j-1];
                    LCA[i][j]=LCA[par][j-1];
                }
            }
        }
    }

    static int []level;
    static int []parent;
    static void level_dfs(int node,int l,int par){
        level[node]=l;
        parent[node]=par;;
        for(int child:adj[node]){
            if(parent[node]!=child){
                level_dfs(child,level[node]+1,node);
            }
        }
    }

    static LinkedList<Integer>[]adj;
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
