package Tree_Data_Structure;

public class Convert_BinaryTree_To_DoublyLinkedList {
    static Node prev=null;
    static Node head=null;
    static void convert(Node root){
        if(root==null) return;

        convert(root.left);

        if(prev==null){
            head=root;
        }else {
            root.left=prev;
            prev.right=root;
        }

        prev=root;
        convert(root.right);
    }
}
