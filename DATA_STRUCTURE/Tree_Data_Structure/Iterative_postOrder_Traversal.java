package DATA_STRUCTURE.Tree_Data_Structure;

import java.util.ArrayList;
import java.util.Stack;

public class Iterative_postOrder_Traversal {
    void postOrder(Node root){
        Stack<Node> stack=new Stack<>();
        ArrayList<Integer> arr=new ArrayList<>();
        stack.push(root);
        Node cur;
        while (!stack.isEmpty()){
            cur=stack.pop();
            arr.add(cur.data);
            if(cur.left!=null) stack.push(cur.left);
            if(cur.right!=null) stack.push(cur.right);
        }
        //reverse the arr.....
        for(int i=arr.size()-1;i>=0;i--){
            System.out.print(arr.get(i)+" ");
        }
    }

}
