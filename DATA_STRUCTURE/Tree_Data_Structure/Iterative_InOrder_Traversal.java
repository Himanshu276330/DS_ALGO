package DATA_STRUCTURE.Tree_Data_Structure;

import java.util.Stack;

public class Iterative_InOrder_Traversal {
    void traversal(Node root){
        Stack<Node> stack=new Stack<>();
        Node cur=root;
        while (cur!=null || !stack.isEmpty()) {
            while (cur != null) {
                stack.push(cur);
                cur = cur.left;
            }
            cur=stack.pop();
            System.out.print(cur.data+" ");
            cur=cur.right;
        }
        System.out.println();


        //method 02.....................
        Stack<Node> stack2=new Stack<>();
        Node cur2=root;
        while(cur2 != null){
            stack2.push(cur2);
            cur2 = cur2.left;
        }
        while(!stack2.isEmpty()){
            cur2 = stack2.pop();
            System.out.print(cur2.data+" ");
            if(cur2.right != null){
                cur2 = cur2.right;
                while(cur2 != null){
                    stack2.push(cur2);
                    cur2 = cur2.left;
                }
            }
        }


    }
}
