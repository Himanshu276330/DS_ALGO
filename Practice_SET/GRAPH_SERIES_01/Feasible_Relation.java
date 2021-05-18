package Practice_SET.GRAPH_SERIES_01;

import java.util.*;

public class Feasible_Relation {
    public static void main(String[] args) {

        //2
        //2 2   var , relation
        //1 = 2
        //1 != 2
        //3 2
        //1 = 2
        //2 != 3

        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();
        while(t-->0){

            int var=sc.nextInt();
            int rel=sc.nextInt();
//            System.out.println(rel);
            Implementation(var);
            ArrayList<Integer> [] List= new ArrayList[rel];
            int x=0;
            for(int i=0;i<rel;i++){
                int a=sc.nextInt();
                String op=sc.next();
                int b=sc.nextInt();
                if(op.equals("=")){
                    toAdd(a,b);
                }else{
                    List[x]=new ArrayList<>();
                    List[x].add(a);
                    List[x].add(b);
                    x++;
                }
            }
            cc_no=1;
            for(int i=1;i<=var;i++){
                if(!vis[i]){
                    bfs(i);
                    cc_no++;
                }
            }
//            System.out.println(cc_no);
            boolean flag=true;
            for(int i=0;i<x;i++){
                if(cc[List[i].get(0)]==cc[List[i].get(1)]){
                    System.out.println("NO");
                    flag=false;
                    break;
                }
            }
            if(flag) System.out.println("YES");

            for(int i=0;i<x;i++){
                List[i].clear();
            }
            Arrays.fill(vis,false);
            for(int i=1;i<=var;i++){
                adj[i].clear();
            }
            Arrays.fill(cc,0);
            System.out.println(t);
        }

    }//MAIN ENDS..........................................................................

    static int cc_no;
    static int [] cc=new int[1000001];
    static boolean [] vis=new boolean[1000001];
    static void bfs(int source){
        Deque<Integer> q=new LinkedList<>();
        q.add(source);
        vis[source]=true;
        cc[source]=cc_no;
        while(!q.isEmpty()){
            int cur=q.removeFirst();
            for(int child:adj[cur]){
                if(!vis[child]) {
                    vis[child] = true;
                    cc[child] = cc_no;
                }
            }
        }
    }

    static LinkedList<Integer> [] adj;
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

//    NO
//            YES
//    NO
//            NO
//    YES
//            NO
//    YES
//            NO
//    NO
//            YES
