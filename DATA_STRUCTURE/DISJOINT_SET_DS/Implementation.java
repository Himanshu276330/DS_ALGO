package DATA_STRUCTURE.DISJOINT_SET_DS;

import java.util.Scanner;

public class Implementation {
    public static void main(String[] args) {

        //Input.
//        5 4  ->Five node or four relation.
//        1 2      // 5 4 1 2 2 3 1 3 4 5
//        2 3
//        1 3
//        4 5
        Scanner sc=new Scanner(System.in);
        int vertex=sc.nextInt();
        int rel=sc.nextInt();
        parent=new int[vertex+1];
        for(int i=1;i<=vertex;i++) parent[i]=-1;
        for(int i=0;i<rel;i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            union(a,b);
        }
        for(int i=0;i<=vertex;i++){
            System.out.println(i+" ka parent h --> "+parent[i]);
        }
        System.out.println(No_of_set(vertex));


    }//MAIN ENDS...................................

    static int No_of_set(int v){
        int count=0;
        for(int i=1;i<=v;i++){
            if(parent[i]<0) count++;
        }
        return count;
    }

    static int []parent;

    //Implementation of union function..
    static void union(int a,int b){
        a=find(a);
        b=find(b);
        if(a==b) return;
        if(a<b){
            parent[a]+=parent[b];
            parent[b]=a;
        }else {
            parent[b]+=parent[a];
            parent[a] = b;
        }
    }

    //Implementation of find function..
    static int find(int a){
        if(parent[a]<0) return a;
        return find(parent[a]);
    }
}
