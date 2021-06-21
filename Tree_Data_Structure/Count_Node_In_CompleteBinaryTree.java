package Tree_Data_Structure;

public class Count_Node_In_CompleteBinaryTree {

    //Method 02. O(log(n)*log(n)).
    //This method is only applicable for complete binary tree.
    static int count2(Node root){

        int lh=0,rh=0;
        Node cur1=root;
        while(cur1!=null){
            lh++;
            cur1=cur1.left;
        }
        cur1=root;
        while(cur1!=null){
            rh++;
            cur1=cur1.right;
        }

//        if(leftH(root)==rightH(root)) {
//            return (int) (Math.pow(2, leftH(root)) - 1);
//        }
        if(lh==rh){
            return (int) (Math.pow(2,lh)-1);
        }else {
            return 1+count2(root.left)+count2(root.right);
        }
    }
    static int leftH(Node root) {
        if(root==null) return 0;
        return 1+leftH(root.left);
    }
    static int rightH(Node root){
        if(root==null) return 0;
        return 1+rightH(root.right);
    }



    //Method 01 O(n)..
    //This method is applicable for both complete or not complete binary tree
    static int count(Node root){
        if(root==null) return 0;
        return count(root.left)+count(root.right)+1;
    }
}
