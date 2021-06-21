package Tree_Data_Structure;

public class Child_SumProperty {
    static boolean childSumProperty(Node root){
        if(root==null) return true;
        if(root.left==null && root.right==null) return true;

        int sum=0;
        if(root.left!=null) sum+=root.left.data;
        if(root.right!=null) sum+=root.right.data;
        return (root.data==sum && childSumProperty(root.left) && childSumProperty(root.right));
    }
}
