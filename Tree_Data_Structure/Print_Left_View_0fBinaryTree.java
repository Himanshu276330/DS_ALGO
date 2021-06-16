package Tree_Data_Structure;

public class Print_Left_View_0fBinaryTree {
    //Printing only one node which is left most position of a level..
    static int maxLevel=0;
    static void printLeft(Node root,int level){
        if(root==null) return;
        if(level>maxLevel){
            System.out.print(root.data+" ");
            maxLevel++;
        }
        printLeft(root.left,level+1);
        printLeft(root.right,level+1);
    }
}
