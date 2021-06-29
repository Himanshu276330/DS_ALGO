package BST;

public class Ceil_in_BST {
    Node ceil(Node root,int val){
        Node ceil=null;

        while (root!=null){
            if(val<root.data){
                ceil=root;
                root=root.left;
            }
            else if(val> root.data){
                root=root.right;
            }
            else {
                return root;
            }
        }
        return ceil;
    }
}
