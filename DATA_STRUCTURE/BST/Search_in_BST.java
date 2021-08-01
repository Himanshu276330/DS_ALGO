package DATA_STRUCTURE.BST;

public class Search_in_BST {
    boolean search_iterative(Node root,int val){
        while(root!=null){
            if(val<root.data){
                root=root.left;
            }else if(val>root.data){
                root=root.right;
            }else {
                return true;
            }
        }
        return false;
    }

    boolean search_recursive(Node root,int val){
        if(root==null) {
            return false;
        }
        else if(root.data>val) {
            return search_recursive(root.left,val);
        }
        else if(root.data<val) {
            return search_recursive(root.right,val);
        }else
            return true;
    }
}
