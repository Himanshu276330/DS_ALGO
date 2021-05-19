package Practice_SET.GRAPH_SERIES_01;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class E_Bertown_road_Q_Base_on_bridge_concept {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of vertices and edges : ");
        int v=sc.nextInt();
        int e=sc.nextInt();
        Implementation(v);
        System.out.println("Enter "+e+" edges");
        for (int i=0;i<e;i++){
            int source=sc.nextInt();
            int destination=sc.nextInt();
            toAdd(source,destination);
        }

        dfs(1,-1);
        for(int [] arr:ans){
            System.out.println(arr[0]+" "+arr[1]);
        }

    }//MAIN ENDS........................................................


    static void dfs(int node,int parent){
        vis[node]=true;
        in[node]=low[node]=timer++;
        for(int child:adj[node]){
            if(child==parent) continue;
            if(vis[child]){
                //That the back edges ,because it is not its parents.
                low[node]=Math.min(low[child],in[node]);
                ans.add(new int[]{node, child});
            }else{
                dfs(child,node);
                if(low[child]>in[node]){     //Condition to it bridge or not
                    ans.add(new int[]{node, child});
                }
                low[node]=Math.min(low[child],low[node]);
            }
        }

    }
    static ArrayList<int []> ans=new ArrayList<>();
    static boolean []vis=new boolean[100001];
    static int []in=new int[100001];
    static int []low=new int[100001];
    static int timer;

    static LinkedList<Integer> [] adj;
    static void Implementation(int v){
        adj=new LinkedList[v+1];
        for(int i=0;i<=v;i++){
            adj[i]=new LinkedList<>();
        }
    }
    static void toAdd(int s,int d){
        adj[s].add(d);
        adj[d].add(s);
    }
}
