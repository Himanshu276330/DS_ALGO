package Practice_SET.GRAPH_SERIES_01;

import java.util.*;

public class KOSARAJUS_Algo_For_Finding_STRONGLY_CONNECTED_COMPONENT {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            outTime.clear();
            System.out.println("Enter no of Vertex and Edges : ");
            int v=sc.nextInt();
            int e=sc.nextInt();
            Implementation(v);
            System.out.println("Enter "+e+" Edges : ");
            for(int i=0;i<e;i++){
                int s=sc.nextInt();
                int d=sc.nextInt();
                toAdd(s,d);
            }
            for(int i=0;i<=v;i++) vis[i]=false;  //For use this in dfs.
            for(int i=1;i<=v;i++){
                if(!vis[i])
                    dfs(i);
            }
            for(int i=0;i<=v;i++) vis[i]=false;  //For use this in dfs2.

            int k=1;
            for(int i= outTime.size()-1;i>=0;i--){
                if(!vis[outTime.get(i)]){
                    System.out.println(k+". -- SCC of given graph is : ");
                    dfs2(outTime.get(i));
                    System.out.println();
                    k++;
                }
            }
        }

    }//MAIN ENDS.........................................................................

    static void dfs2(int node){
        vis[node]=true;
        System.out.print(node+" ");
        for(int child:adjTranspose[node]){
            if(!vis[child]){
                dfs2(child);
            }
        }
    }

    static boolean []vis=new boolean[10001];
    static void dfs(int node){
        vis[node]=true;
        for(int child:adj[node]){
            if(!vis[child]){
                dfs(child);
            }
        }
        outTime.add(node);
    }
    static ArrayList<Integer> outTime=new ArrayList<>();

    static LinkedList<Integer> []adj;
    static LinkedList<Integer> []adjTranspose;
    static void Implementation(int v){
        adj=new LinkedList[v+1];  //v+1 because index of node start from 1.
        adjTranspose=new LinkedList[v+1];  //v+1 because index of node start from 1.
        for(int i=1;i<=v;i++){
            adj[i]=new LinkedList<>();
            adjTranspose[i]=new LinkedList<>();
        }
    }
    static void toAdd(int s,int d){
        adj[s].add(d);           //for normal graph.
        adjTranspose[d].add(s);  //for transpose graph.
    }
}
