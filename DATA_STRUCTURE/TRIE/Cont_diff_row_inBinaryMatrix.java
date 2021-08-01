package DATA_STRUCTURE.TRIE;

import java.util.ArrayList;

public class Cont_diff_row_inBinaryMatrix {
    public static void main(String[] args) {

        int [][]mat={ {1, 0, 0},
                      {1, 1, 1},
                      {1, 0, 0},
                      {1, 1, 1},    };

        int [][]mat2={ {1, 0, 0, 1},
                       {1, 1, 1, 1},
                       {1, 0, 0, 0},
                       {1, 1, 1, 0},    };

        root=new Node();
        count=0;
        ArrayList<Integer> arr=new ArrayList<>();
        for (int[] ints : mat) {
            for (int j = 0; j < mat[0].length; j++) {
                arr.add(ints[j]);
            }
            insert(root, arr);
            arr.clear();
        }
        System.out.println("No of diff row in mat is : "+count);
        count=0;
        root=new Node();
        for (int[] ints : mat2) {
            for (int j = 0; j < mat2[0].length; j++) {
                arr.add(ints[j]);
            }
            insert(root, arr);
            arr.clear();
        }
        System.out.println("No of diff row in mat2 is : "+count);

    }//Mains end..................................................
    static Node root;
    static int count;
    static void insert(Node root, ArrayList<Integer> arr){
        boolean cc=true;
        for (Integer integer : arr) {
            if (root.child[integer] == null) {
                root.child[integer] = new Node();
                if (cc) {
                    count++;
                    cc = false;
                }
            }
            root = root.child[integer];
        }
    }
}
class Node{
    Node []child=new Node[2];
}

