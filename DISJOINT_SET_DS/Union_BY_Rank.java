package DISJOINT_SET_DS;

import java.util.Random;

public class Union_BY_Rank {
    public static void main(String[] args) {



    }//MAINS ENDS.......................................................

    static int []parent;static int []Rank; //Rank means --> total node in a single set..
    static void Implementation(int v){
        parent=new int[v+1];
        for(int i=1;i<=v;i++){
            parent[i]=-1;
            Rank[i]=1;
        }
    }

    static int find(int a){
        if(parent[a]<0) return a;
        return find(parent[a]);
    }

    static void UnionByRank(int a,int b){
        a=find(a);
        b=find(b);
        if(Rank[a]>Rank[b]){
            parent[b]=a;
            Rank[a]+=Rank[b];
        }else{
            parent[a]=b;
            Rank[b]+=Rank[a];
        }
    }
}
