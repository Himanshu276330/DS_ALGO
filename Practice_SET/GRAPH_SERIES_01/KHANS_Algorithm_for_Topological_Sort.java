package Practice_SET.GRAPH_SERIES_01;

import java.util.*;

public class KHANS_Algorithm_for_Topological_Sort {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int no_of_node=sc.nextInt();
        int e=sc.nextInt();      //This edges are uni-directional..
        Implementation(no_of_node);
        for(int i=0;i<e;i++){
            int s=sc.nextInt();
            int d=sc.nextInt();
            toMap(s,d);
        }
        khan(no_of_node);
        for(int ee:res){
            System.out.print(ee+" ");
        }

    }//MAIN END..................................................................................

    static ArrayList<Integer> res=new ArrayList<>();
    static void khan(int no_of_node){
        Queue<Integer> q=new LinkedList<>();
        for(int i=1;i<=no_of_node;i++){
            if(inDegree[i]==0) q.add(i);
        }
        while(!q.isEmpty()){
            int cur=q.remove();
            for(int child:adj[cur]){
                inDegree[child]--;
                if(inDegree[child]==0) q.add(child);
            }
            res.add(cur);
        }
    }

    static int [] inDegree=new int[1001];
    static LinkedList<Integer> []adj;
    static void Implementation(int v){
        adj=new LinkedList[v+1];
        for(int i=0;i<=v;i++){
            adj[i]=new LinkedList<>();
        }
    }
    static void toMap(int s,int d){
        adj[s].add(d);
        inDegree[d]++;   //To maintain its degree.
    }
}
