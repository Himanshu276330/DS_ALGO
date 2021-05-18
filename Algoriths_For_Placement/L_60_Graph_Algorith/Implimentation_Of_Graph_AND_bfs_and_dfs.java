package Algoriths_For_Placement.L_60_Graph_Algorith;

import java.util.*;

public class Implimentation_Of_Graph_AND_bfs_and_dfs {

               //Implimentation of graph.

               //// if node no start with 0.
//    static  LinkedList<Integer> [] adj;
//    public Implimentation_Of_Graph_AND_bfs_and_dfs(int v){
//
//        adj=new LinkedList[v];
//        for (int i=0;i<v;i++){
//            adj[i]= new LinkedList<>();
//        }
//    }

              //// if node no start with 1.
    static  LinkedList<Integer> [] adj;
    public Implimentation_Of_Graph_AND_bfs_and_dfs(int v){
        adj=new LinkedList[v+1];
        for (int i=0;i<v+1;i++){
            adj[i]= new LinkedList<>();
        }
    }

    public void addEdge(int source,int destination){
        adj[source].add(destination);
        adj[destination].add(source);
    }

                //Traversal in Graph by BFS.
    public int bfs(int source,int destination){
        boolean  [] vis=new boolean[adj.length];
        int [] parents=new int[adj.length];
        Queue<Integer> q=new LinkedList<>();

        q.add(source);
        parents[source]=-1;
        vis[source]=true;

        while (!q.isEmpty()){
            int cur=q.poll();
            if (cur==destination) break;

            for (int neighbor:adj[cur]){
                if (!vis[neighbor]){
                    vis[neighbor]=true;
                    q.add(neighbor);
                    parents[neighbor]=cur;
                }
            }
        }
        int cur2=destination;
        int distance=0;

        while (parents[cur2]!=-1){
            System.out.print(cur2+" --> ");
            cur2=parents[cur2];
            distance++;
        }
        System.out.println(cur2);
        return distance;
    }

              //Traversal in Graph by DFS.
//    private boolean dfsUtil(int source,int destination ,boolean []vis){
//        if (source==destination) return true;
//
//        for (int neighbor:adj[source]){
//            if (!vis[neighbor]){
//                vis[neighbor]=true;
//                boolean isConnected=dfsUtil(neighbor,destination,vis);
//                if (isConnected) return true;
//            }
//        }
//        return false;
//    }
//
//    public boolean dfs(int source,int destination){
//        boolean [] vis=new boolean[adj.length];
//        vis[source] =true;
//
//        return dfsUtil(source,destination,vis);
//    }


              //Traversal in Graph by DFS with stack data-Structure..
//    public boolean dfsStack(int source,int destination){
//        boolean [] vis=new boolean[adj.length];
//        vis[source]=true;
//        Stack<Integer> stack=new Stack<>();
//        stack.push(source);
//
//        while (!stack.isEmpty()){
//            int cur=stack.pop();
//            if (cur==destination) return true;
//            for (int neighbour:adj[cur]){
//                if (!vis[neighbour]){
//                    vis[neighbour]=true;
//                    stack.push(neighbour);
//                }
//
//            }
//        }
//        return false;
//    }

            //Printing all nodes or vertices by DFS
//    public void print(int source){
//        boolean [] v=new boolean[adj.length+1];
//        System.out.print(source+" ");
//        v[source]=true;
//        printLn(source,v);
//    }
//    private void printLn(int source,boolean [] v){
//        for(Integer e:adj[source]) {
//            if (!v[e]) {
//                System.out.print(e + " ");
//                v[e] = true;
//                printLn(e, v);
//            }
//        }
//    }

            //Counting all connected component of graph.
//    static void dfsCall(int source){
//        visited[source]=true;
//        for(Integer e:adj[source]) {
//            if (!visited[e]) {
//                dfsCall(e);
//            }
//        }
//    }
//    static boolean [] visited =new boolean[100001];


    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
           //Implimentation of graph.
        System.out.println("Enter no of vertices and edges : ");
        int v=sc.nextInt();
        int e=sc.nextInt();
        Implimentation_Of_Graph_AND_bfs_and_dfs graph=new Implimentation_Of_Graph_AND_bfs_and_dfs(v);
        System.out.println("Enter "+e+" edges");
        for (int i=0;i<e;i++){
            int source=sc.nextInt();
            int destination=sc.nextInt();

            graph.addEdge(source,destination);
        }


                // BFS execution.
//        System.out.print("Enter source and destination : ");
//        int s= sc.nextInt();
//        int des=sc.nextInt();
//        System.out.println("Min-Distance : "+graph.bfs( s, des));



                 ////DFS execution
//        System.out.println(graph.dfs(s,des));



                ////DFS with stack
//        System.out.println("Path possible is : "+graph.dfsStack(s,des));



            ////printing element by dfs
//        System.out.print("Enter source : ");
//        int s= sc.nextInt();
//        graph.print(s);



            //Counting all connected component of graph;

//                    1
//                   /
//                  2         7       9
//                /   \        \             => so connected component is 3.
//               3     4        8
//                \   /  \
//                  5     6
//
//        int count=0;
//        for(int i=1;i<=v;i++){
//            if(!visited[i]){
//                dfsCall(i);
//                count++;
//            }
//        }
//        System.out.println("Connected component is : "+count);



        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
    }

}

