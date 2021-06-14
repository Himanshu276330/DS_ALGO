package Hashing;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;

public class Chaining_Implementation {
    public static void main(String[] args) {

        MyHash mh=new MyHash(7);
        mh.insert(50);mh.insert(21);mh.insert(58);mh.insert(17);mh.insert(15);
        mh.insert(49);mh.insert(56);mh.insert(22);mh.insert(23);mh.insert(25);
        mh.insert(25);
        System.out.println(mh.search(25));
        mh.delete(25);
        System.out.println(mh.search(25));


    }//MAINS END............................................................................
}
class MyHash{
    int BUCKET;
    ArrayList<LinkedList<Integer>> table;
    MyHash(int b){
        BUCKET=b;
        table=new ArrayList<>();
        for(int i=0;i<b;i++){
            table.add(new LinkedList<>());
        }
    }
    void insert(int key){
        int i=key%BUCKET;
        table.get(i).add(key);
    }
    void delete(int key){
        int i=key%BUCKET;
        for(int j=0;j<table.get(i).size();j++){
            if(table.get(i).get(j)==key){
                table.get(i).remove(j);
                break;
            }
        }
    }
    boolean search(int key){
        int i=key%BUCKET;
        return table.get(i).contains(key);
    }
}
