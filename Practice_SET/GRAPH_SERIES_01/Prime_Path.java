package Practice_SET.GRAPH_SERIES_01;

import java.util.*;

public class Prime_Path {
    public static void main(String[] args) {

        //Q --> Given two digits no say A and B ,find minimum number of operation to convert
        // A into B.
        //In one step you can change 1 digits of the no and the resulting no must also be prime .

        Scanner sc=new Scanner(System.in);
        for (int i = 1000; i < 9999; i++) {
            if (isPrime(i)) {
                prime.add(i);
            }
        }
        implementation();
        for (int i = 0; i < prime.size(); i++) {
            for (int k = i + 1; k < prime.size(); k++) {
                if (isValid(prime.get(i), prime.get(k))) {
                    add(prime.get(i), prime.get(k));
                }
            }
        }

        int t=sc.nextInt();
        while(t-->0) {
            int s = sc.nextInt();
            int d = sc.nextInt();
            Arrays.fill(vis,false);
            Arrays.fill(dist,0);
            bfs(s);
            System.out.println(dist[d]);
        }



    }//MAIN ENDS ........................................................................................

    static int [] dist=new int[100001];

    static void  bfs(int source){
        Deque<Integer> q=new LinkedList<>();
        q.addLast(source);
        vis[source]=true;
        while(!q.isEmpty()){
            int cur=q.removeFirst();
            for(int child:adj[cur]){
                if(!vis[child]) {
                    q.addLast(child);
                    dist[child] = dist[cur] + 1;
                    vis[child] = true;
                }
            }
        }
    }

    static LinkedList<Integer> [] adj;
    static void implementation(){
        adj=new LinkedList[9999];
        for(int e:prime){
            adj[e]=new LinkedList<>();
        }
    }
    static void add(int s,int d){
        adj[s].add(d);
        adj[d].add(s);
    }

    static boolean isValid(int a,int b){
        int count=0;
        while(a>0){
            if((a%10) !=(b%10)) count++;
            a=a/10;
            b=b/10;
            if(count>1) return false;
        }
        return true;
    }

    static boolean isPrime(int n){
        for(int i=2;i*i<=n;i++){
            if((n%i) == 0) return false;
        }
        return true;

    }

    static ArrayList<Integer> prime=new ArrayList<>();
    static boolean [] vis=new boolean[100001];


}
