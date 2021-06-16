package Tree_Data_Structure;

public class Maximum_Value_In_BinaryTree {
    static int max(Node root){
        if(root==null) return Integer.MIN_VALUE;
        else
            return Math.max(root.data, Math.max(max(root.left),max(root.right)));
    }
}
