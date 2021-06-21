package Tree_Data_Structure;

public class Check_For_Balanced_Tree {

    //Naive solution O(n2).
    static boolean isBalanced(Node root){
        if(root==null) return true;
        return
               Math.abs(Height_Of_A_Binary_Tree.height(root.left)-Height_Of_A_Binary_Tree.height(root.right))<=1
                && isBalanced(root.left) && isBalanced(root.right);
    }

    //Efficient solution O(n).
    static int isBalanced2(Node root){
        if(root==null) return 0;

        int left=isBalanced2(root.left);
        if(left==-1) return -1;

        int right=isBalanced2(root.right);
        if(right==-1) return -1;

        if(Math.abs(left-right)>1) return -1;
        else return Math.max(left,right)+1;
    }
}
