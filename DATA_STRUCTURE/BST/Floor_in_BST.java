package DATA_STRUCTURE.BST;

public class Floor_in_BST {
    Node floor(Node root,int val){
        Node floor=null;
        //int diff=Integer.MAX_VALUE;

        while(root!=null){
            if(val<root.data){
                root=root.left;
            }else if(val> root.data){
            //    if(val- root.data<diff){
            //        floor=root;
            //        diff=val- root.data;
            //    }
                floor=root;
                root=root.right;
            }else{
                return root;
            }
        }

        return floor;
    }
}
