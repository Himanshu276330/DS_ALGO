package Tree_Data_Structure;

import java.util.ArrayDeque;
import java.util.Deque;

public class LevelOrderTraversal_of_binary_tree {
    static void levelOrderTraversal(Node root){
        Deque<Node> queue=new ArrayDeque<>();
        queue.addLast(root);
        while (!queue.isEmpty()){
            Node cur=queue.removeFirst();
            System.out.print(cur.data+" ");
            if(cur.left!=null)
                queue.addLast(cur.left);
            if(cur.right!=null)
                queue.addLast(cur.right);
        }
    }
}
