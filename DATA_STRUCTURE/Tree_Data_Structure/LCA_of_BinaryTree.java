package DATA_STRUCTURE.Tree_Data_Structure;

import java.util.ArrayList;

public class LCA_of_BinaryTree {

    //Method 01.. Naive Solution..
    Node lca(Node root,int n1,int n2){
        ArrayList<Node> path1=new ArrayList<>();
        ArrayList<Node> path2=new ArrayList<>();
        if(!findPath(root,path1,n1) || !findPath(root,path2,n2))
            return null;
        for(int i=1;i<path1.size()&&i< path2.size();i++){
            if(path1.get(i).data!=path2.get(i).data)
                return path1.get(i-1);
        }
        return null;
    }

    boolean findPath(Node root,ArrayList<Node> path,int n){
        if(root==null) return false;

        path.add(root);
        //System.out.println(root.data);
        if(root.data==n) return true;

        if(findPath(root.left,path,n) || findPath(root.right,path,n)){
            return true;
        }
        path.remove(path.size()-1);
        return false;
    }
}
