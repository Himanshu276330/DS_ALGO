package Tree_Data_Structure;

public class Size_of_BinaryTree {
    static int size(Node root){
        if(root==null) return 0;
        else
            return 1+size(root.left)+size(root.right);
    }
}
