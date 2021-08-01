package DATA_STRUCTURE.DISJOINT_SET_DS;

import java.util.Scanner;

public class Owl_Problem {
    public static void main(String[] args) {

       /* Problem
        Owl Arena is hosting a fight competition and many owls decided to take part in it.
        Strength of an owl is the number associated with that owl.
                Rules of the competition are:
        An owl wins if its strength is greater than that of another.
        An owl can ask his friend to fight that match for him.
        Note : If A and B are friends, and B and C are friends, then A and C are also friends. */
//        7 3 --> No of owl and relation
//        1 2
//        3 4
//        1 7
//        4      ---> No of fight bw below.
//        1 2
//        5 6
//        3 7
//        1 5
        Scanner sc=new Scanner(System.in);
        int owl=sc.nextInt();
        int rel=sc.nextInt();
        implementation(owl);
        for(int i=0;i<rel;i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            union(a,b);
        }
        int fight=sc.nextInt();
        for(int i=0;i<fight;i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            if(parent[find(a)]<parent[find(b)]){
                System.out.println(a);
            }else if(parent[find(a)]>parent[find(b)]){
                System.out.println(b);
            }else
                System.out.println("TIE");
        }


    }//MAINS END..............................................................................

    static int []parent;
    static void implementation(int owl){
        parent=new int[owl+1];
        for(int i=1;i<=owl;i++) parent[i]=-i;
    }

    static int find(int a){
        if(parent[a]<0) return a;
        return find(parent[a]);
    }
    static void union(int a,int b){
        a=find(a);
        b=find(b);
        if(a==b) return;
        if(a<b){
            parent[b]=a;
            parent[a]=Math.min(parent[a],-b);
        }else {
            parent[a]=b;
            parent[b]=Math.min(parent[b],-a);
        }
    }

}
