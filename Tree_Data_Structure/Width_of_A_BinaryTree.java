package Tree_Data_Structure;

import java.util.ArrayDeque;
import java.util.Deque;

public class Width_of_A_BinaryTree {
    static int maxWidth(Node root){
        int ans=0;
        Deque<Node> deque=new ArrayDeque<>();
        deque.addLast(root);
        while (!deque.isEmpty()){
            int size= deque.size();
            ans=Math.max(ans,size);
            for(int i=0;i<size;i++){
                Node cur=deque.removeFirst();
                if(cur.left!=null)
                    deque.addLast(cur.left);
                if(cur.right!=null)
                    deque.addLast(cur.right);
            }
        }
        return ans;
    }
}
