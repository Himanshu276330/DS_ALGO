package Practice_SET.GRAPH_SERIES_01.FLOW_NETWORK_SERIES;

import OOPS.packages.A;

import java.util.ArrayList;
import java.util.Scanner;

public class EDMONDS_KARP_Algorithm_for_max_flow {
    public static void main(String[] args) {

        //Edmonds_Karp Algorithm is just implementation of ford_fulkerson method that uses BFS to find
        // the augmenting path..

        Scanner sc=new Scanner(System.in);
        int node=sc.nextInt();
        int edges=sc.nextInt();
        implementation(5);
        for(int i=0;i<edges;i++){
            int s=sc.nextInt();
            int d=sc.nextInt();
            toAdd(s,d);
        }



    }//MAIN END...............................................................................

    static ArrayList<ArrayList<Integer>> adj;
    static ArrayList<ArrayList<Integer>> capacity;
    static void implementation(int node){
        adj=new ArrayList<>();
        for(int i=0;i<=node;i++){
            adj.add(i,new ArrayList<>());
        }
    }
    static void toAdd(int s,int d){
        adj.get(s).add(d);
        adj.get(d).add(s);
    }


}

/*
int n;
vector<vector<int>> capacity;
vector<vector<int>> adj;

int bfs(int s, int t, vector<int>& parent) {
    fill(parent.begin(), parent.end(), -1);
    parent[s] = -2;
    queue<pair<int, int>> q;
    q.push({s, INF});

    while (!q.empty()) {
        int cur = q.front().first;
        int flow = q.front().second;
        q.pop();

        for (int next : adj[cur]) {
            if (parent[next] == -1 && capacity[cur][next]) {
                parent[next] = cur;
                int new_flow = min(flow, capacity[cur][next]);
                if (next == t)
                    return new_flow;
                q.push({next, new_flow});
            }
        }
    }

    return 0;
}

int maxflow(int s, int t) {
    int flow = 0;
    vector<int> parent(n);
    int new_flow;

    while (new_flow = bfs(s, t, parent)) {
        flow += new_flow;
        int cur = t;
        while (cur != s) {
            int prev = parent[cur];
            capacity[prev][cur] -= new_flow;
            capacity[cur][prev] += new_flow;
            cur = prev;
        }
    }

    return flow;
}
 */
