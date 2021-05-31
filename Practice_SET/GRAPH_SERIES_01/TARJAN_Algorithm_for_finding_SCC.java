package Practice_SET.GRAPH_SERIES_01;

import java.util.*;

public class TARJAN_Algorithm_for_finding_SCC {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of vertex and Edges : ");
        int v=sc.nextInt();
        int e=sc.nextInt();
        Implementation(v);
        for(int i=0;i<e;i++){
            int s=sc.nextInt();
            int d=sc.nextInt();
            toAdd(s,d);
        }
        for(int i=1;i<=v;i++) {
            if(!vis[i])
                Tarjan_DFS(i);
        }



    }//MAIN END ...............................................................

    static int timer=1;
    static boolean []active=new boolean[100001];
    static int []inTime=new int[100001];
    static int []lowTime=new int[100001];
    static boolean []vis=new boolean[100001];
    static Stack<Integer> stack=new Stack<>();
    static void Tarjan_DFS(int node){
        vis[node]=true;
        stack.push(node);
        active[node]=true;
        inTime[node]=lowTime[node]=timer++;
        for(int child:adj[node]){
            if(!vis[child]) {
                Tarjan_DFS(child);
                if(active[child]){
                    lowTime[node]=Math.min(lowTime[node],lowTime[child]);
                }
            }else{
                if(active[child]){
                    lowTime[node]=Math.min(lowTime[node],inTime[child] );
                }
            }
        }
        if(inTime[node]==lowTime[node]){
            System.out.println("SCC #"+i);
            while(stack.peek()!=node){
                active[stack.peek()]=false;
                System.out.print(stack.pop()+" ");
            }
            active[stack.peek()]=false;
            System.out.print(stack.pop());
            System.out.println();
            i++;
        }
    }
    static int i=1;

    static LinkedList<Integer> []adj;
    static void Implementation(int v){
        adj=new LinkedList[v+1];
        for(int i=1;i<=v;i++){
            adj[i]=new LinkedList<>();
        }
    }
    static void toAdd(int s,int d){
        adj[s].add(d);
    }


}
