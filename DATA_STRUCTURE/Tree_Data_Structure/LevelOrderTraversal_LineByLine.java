package DATA_STRUCTURE.Tree_Data_Structure;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class LevelOrderTraversal_LineByLine {

      //Method 01
    static void levelOrderTraversal(Node root){
        //Deque<Node> deque=new ArrayDeque<>();  // Give null pointer exception
        Deque<Node> deque=new LinkedList<>();
        deque.addLast(root);
        deque.addLast(null);
        while (deque.size()>1){
            while (deque.peekFirst()!=null){
                Node cur=deque.removeFirst();
                System.out.print(cur.data+" ");
                if(cur.left!=null)
                    deque.addLast(cur.left);
                if(cur.right!=null)
                    deque.addLast(cur.right);
            }
            System.out.println();
            deque.addLast(null);
            deque.removeFirst();
        }
    }

         //Method 02 more efficient than above.
    static void levelOrderTraversal2(Node root){
        Deque<Node> deque=new ArrayDeque<>();
        deque.addLast(root);
        while (!deque.isEmpty()){
            int count= deque.size();
            for(int i=0;i<count;i++){
                Node cur=deque.removeFirst();
                System.out.print(cur.data+" ");
                if(cur.left!=null)
                    deque.addLast(cur.left);
                if(cur.right!=null)
                    deque.addLast(cur.right);
            }
            System.out.println();
        }
    }

}
