package DATA_STRUCTURE.Tree_Data_Structure;

public class Diameter_of_a_BinaryTree {
    public static void main(String[] args) {



    }//Main End..................................................................................

    //Naive Solution.. O(n2).
    static int diameter(Node root){
        if(root==null) return 0;

        int leftHeight=Height_Of_A_Binary_Tree.height(root.left);
        int rightHeight=Height_Of_A_Binary_Tree.height(root.right);
        return Math.max(1+leftHeight+rightHeight,
                Math.max(diameter(root.left),diameter(root.right))  );
    }

    //Efficient solution........
    static int diameter=Integer.MIN_VALUE;
    static int diameter2(Node root){      //This function is same as height function
        if(root==null) return 0;

        int left=diameter2(root.left);
        int right=diameter2(root.right);

        diameter=Math.max(diameter,left+right+1); //This line is only diff from height function ,
                                                  // and it set diameter  of tree.
        return Math.max(left,right)+1;
    }


}
