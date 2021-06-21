package Tree_Data_Structure;

import java.util.ArrayDeque;
import java.util.Deque;

public class Print_Left_View_0fBinaryTree {
    //Printing only one node which is left most position of a level..
    static int maxLevel=0;
    static void printLeft(Node root,int level){
        if(root==null) return;
        if(level>maxLevel){
            System.out.print(root.data+" ");
            maxLevel++;
        }
        printLeft(root.left,level+1);
        printLeft(root.right,level+1);
    }

    //Method 02.
    static void printLeft2(Node root){
        Deque<Node> deque=new ArrayDeque<>();
        deque.addLast(root);
        while (!deque.isEmpty()){
            int size=deque.size();
            for(int i=0;i<size;i++){
                Node cur=deque.removeFirst();
                if(i==0){
                    System.out.print(cur.data+" ");
                }
                if(cur.left!=null) deque.addLast(cur.left);
                if(cur.right!=null) deque.addLast(cur.right);
            }
        }
    }


}
