package DATA_STRUCTURE.BST;

public class Insert_IN_BST {
    //If value is inserted then return true.
    boolean insert_recursive(Node root,int val){
        if(val<root.data){
            if(root.left==null){
                root.left=new Node(val);
                return true;
            }else {
                return insert_recursive(root.left,val);
            }
        }
        else if(val> root.data){
            if(root.right==null){
                root.right=new Node(val);
                return true;
            }else {
                return insert_recursive(root.right,val);
            }
        }else {
            return false;
        }
    }

    //method 02
    boolean insert_iterative(Node root,int val){
        Node cur = root;
        while (true) {
            if(cur.data==val) return false;
            while (val < cur.data) {
                if(cur.left==null){
                    cur.left=new Node(val);
                    return true;
                }else
                    cur=cur.left;
            }
            while (val > cur.data) {
                if(cur.right==null){
                    cur.right=new Node(val);
                    return true;
                }else
                    cur = cur.right;
            }
        }
    }

    //method 03
    Node insert_03(Node root,int val){
        if(root==null){
            return new Node(val);
        }
        if(root.data>val){
            root.left=insert_03(root.left,val);
        }
        else if(root.data<val){
            root.right=insert_03(root.right,val);
        }
        return root;
    }
}
