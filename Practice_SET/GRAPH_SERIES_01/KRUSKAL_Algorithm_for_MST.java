package Practice_SET.GRAPH_SERIES_01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class KRUSKAL_Algorithm_for_MST {
    public static void main(String[] args) {

         //Input -> 4 5  1 2 7 1 4 6 4 2 9 4 3 9 2 3 6
        Scanner sc=new Scanner(System.in);
        int v=sc.nextInt();
        int rel=sc.nextInt();
        for(int i=1;i<=v;i++) parent[i]=-1;
        for(int i=0;i<rel;i++){
            arr[i]=new edges(sc.nextInt(),sc.nextInt(),sc.nextInt());
        }
        //In comparator last index = arr.length;
        Arrays.sort(arr,0,rel, Comparator.comparing(edges -> edges.weight));
        int sumOfWeight=0;
        for(int i=0;i<rel;i++){
            int a=find(arr[i].a);
            int b=find(arr[i].b);
            if (a!=b){
                sumOfWeight+=arr[i].weight;
                union(a,b);
            }
        }
        System.out.println("Weight of MST : "+sumOfWeight);

    }//MAINS ENDS........................................................

    static edges []arr=new edges[100000];
    static int[] parent=new int[10001];

    static void union(int a,int b){
        parent[a]=b;
    }
     //It is path compress find function.
    static int find(int a){
        if(parent[a]==-1) return a;
        return parent[a]=find(parent[a]);
    }

}//MAIN CLASS ENDS.........................................................
class edges{
    int a;
    int b;
    int weight;
    edges(int a,int b,int w){
        this.a=a;
        this.b=b;
        this.weight=w;
    }
    private edges(){};
}
