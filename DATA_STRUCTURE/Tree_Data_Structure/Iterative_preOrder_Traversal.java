package DATA_STRUCTURE.Tree_Data_Structure;

import java.util.Stack;

public class Iterative_preOrder_Traversal {
    void traversal(Node root) {
        //more efficient than below solution..
        Stack<Node> stack = new Stack<>();
        Node cur;
        stack.push(root);
        while (!stack.isEmpty()){
            cur=stack.pop();
            while(cur!=null){
                System.out.print(cur.data+" ");
                if(cur.right!=null){
                    stack.push(cur.right);
                }
                cur=cur.left;
            }
        }
        System.out.println();

        //method 02..
        Stack<Node> stack2 = new Stack<>();
        Node cur2;
        stack2.push(root);
        while (!stack2.isEmpty()){
            cur2=stack2.pop();
            System.out.print(cur2.data+" ");
            if(cur2.right!=null) stack2.push(cur2.right);
            if(cur2.left!=null) stack2.push(cur2.left);
        }

    }
}
