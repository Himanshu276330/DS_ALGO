package BST;

public class Delete_in_BST {
    Node delete(Node root,int val){
        if(root==null) return null;

        if(val< root.data) {
            root.left = delete(root.left, val);
            return root;
        }
        else if(val> root.data) {
            root.right = delete(root.right, val);
            return root;
        }
        else {
            if(root.left==null){
                Node temp=root.right;
                root.right=null;
                return temp;
            }
            else if(root.right==null){
                Node temp=root.left;
                root.left=null;
                return temp;
            }
            else {
                root.data=getSuccessor(root.right).data;
                root.left=delete(root.left, root.data);
                root.right=delete(root.right, root.data);
                return root;
            }
        }
    }
    private Node getSuccessor(Node root){
        while (root.left!=null){
            root=root.left;
        }
        return root;
    }
}
