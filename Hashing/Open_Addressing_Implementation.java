package Hashing;

public class Open_Addressing_Implementation {
    public static void main(String[] args) {

        MyHash_Open mh=new MyHash_Open(7);
        mh.insert(50);
        mh.insert(51);
        mh.insert(15);
        System.out.println(mh.search(15));
        System.out.println(mh.search(64));
        mh.delete(51);
        System.out.println(mh.search(15));

    }//MAINS END.............................................................

}//HASH FUNCTION..
class MyHash_Open{
    int BUCKET;
    int [] table;
    boolean [] deleted;
    MyHash_Open(int b){
        BUCKET=b;
        table=new int[b];
        deleted=new boolean[b];
    }
    void insert(int key){
        int i=key%BUCKET;
        while (table[i]!=0){
            i=(i+1)%BUCKET;
        }
        table[i]=key;
        deleted[i]=false;
    }
    boolean search(int key){
        int j=key%BUCKET;
        int i=j;
        while (table[i]!=0 || deleted[i]){
            i=(i+1)%BUCKET;
            if(i==j) break;
            if(table[i]==key) return true;
        }
        return false;
    }
    void delete(int key){
        int j=key%BUCKET;
        int i=j;
        while (table[i]!=0 || deleted[i]){
            i=(i+1)%BUCKET;
            if(i==j) break;
            if(table[i]==key){
                table[i]=0;
                deleted[i]=true;
            }
        }
    }
}
