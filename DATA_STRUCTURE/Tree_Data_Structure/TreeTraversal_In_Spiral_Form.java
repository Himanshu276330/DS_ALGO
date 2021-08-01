package DATA_STRUCTURE.Tree_Data_Structure;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class TreeTraversal_In_Spiral_Form {

    //Method 02...
    static void print2(Node root) {
        Stack<Node> stack1 = new Stack<>();
        Stack<Node> stack2 = new Stack<>();
        stack1.push(root);
        while (!stack1.isEmpty() || !stack2.isEmpty()){
            if(!stack1.isEmpty()) {
                int size1 = stack1.size();
                for (int i = 0; i < size1; i++) {
                    Node cur = stack1.pop();
                    System.out.print(cur.data + " ");
                    if (cur.left != null)
                        stack2.push(cur.left);
                    if (cur.right != null)
                        stack2.push(cur.right);
                }
            }else {
                int size2 = stack2.size();
                for (int i = 0; i < size2; i++) {
                    Node cur = stack2.pop();
                    System.out.print(cur.data + " ");
                    if (cur.right != null)
                        stack1.push(cur.right);
                    if (cur.left != null)
                        stack1.push(cur.left);
                }
            }
        }
    }

    //Method 01...
    static void print(Node root){
        Queue<Node> queue=new LinkedList<>();
        Stack<Node> stack=new Stack<>();
        queue.add(root);
        boolean reverse=false;
        while (!queue.isEmpty()){
            int size= queue.size();
            for(int i=0;i<size;i++){
                Node cur= queue.poll();
                if(reverse) stack.push(cur);
                else {
                    assert cur != null;
                    System.out.print(cur.data+" ");
                }
                assert cur != null;
                if(cur.left!=null)
                    queue.add(cur.left);
                if(cur.right!=null)
                    queue.add(cur.right);
            }
            while (!stack.isEmpty()){
                System.out.print(stack.pop().data+" ");
            }
            reverse=!reverse;
        }
    }
}
