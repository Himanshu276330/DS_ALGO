package Tree_Data_Structure;

public class Construct_BinaryTree_from_InOrder_and_PreOrder {
    public static void main(String[] args) {

        int []InOrder={40,20,60,50,70,10,80,100,30};
        int []PreOrder={10,20,40,50,60,70,30,80,100};
        Node root=convert(InOrder,PreOrder,0,InOrder.length-1);
        preOrder(root);


    }//MAINS END...
    static int PreIndex=0;
    static Node convert(int []InOrder,int []PreOrder,int InStart,int InEnd){
        if(InStart>InEnd) return null;

        Node head=new Node(PreOrder[PreIndex++]);

        int index=0;
        for(int i=InStart;i<=InEnd;i++){
            if(InOrder[i]== head.data){
                index=i;
                break;
            }
        }
        head.left=convert(InOrder,PreOrder,InStart,index-1);
        head.right=convert(InOrder,PreOrder,index+1,InEnd);
        return head;
    }

    static void preOrder(Node root){
        if(root==null) return;
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
}
