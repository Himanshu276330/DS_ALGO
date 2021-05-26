package DISJOINT_SET_DS;

import static DISJOINT_SET_DS.Implementation.parent;

public class Improve_FIND_func_by_PATH_COMPRESSION {
    public static void main(String[] args) {


    }//MAIN ENDS.................................................

    static int find(int a){
        if(parent[a]<0) return a;
        else{
            int x=find(parent[a]);
            parent[a]=x;
            return x;
        }
    }
}
