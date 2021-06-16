package Tree_Data_Structure;

public class Print_Node_At_K_distance {
    static void print(Node root,int k){
        if(root==null || k<1 ) return;
        if(k==1)
            System.out.print(root.data+" ");
        print(root.left,k-1);
        print(root.right,k-1);
    }
}
