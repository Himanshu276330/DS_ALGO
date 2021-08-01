package DATA_STRUCTURE.Tree_Data_Structure;

public class Height_Of_A_Binary_Tree {
    static int height(Node root){
        if(root==null)
            return 0;
        else return 1+Math.max(height(root.left),height(root.right));
    }
}
