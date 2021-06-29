package BST;

public class Implementation_of_BST {
    public static void main(String[] args) {

        addNode(50);addNode(70);addNode(30);addNode(40);
        addNode(10);addNode(60);addNode(80);addNode(5);addNode(8);
        addNode(90);addNode(100);addNode(75);addNode(85);
//        ie-->
//                            50
//                          /    \
//                        30      70
//                      /   \     /  \
//                     10   40   60   80
//                    /              /  \
//                   5             75    90
//                    \                 /  \
//                     8              85    100
//

        inOrder(root);
        System.out.println();

//        Search_in_BST sBST=new Search_in_BST();
//        System.out.println(sBST.search_recursive(root,8));
//        System.out.println(sBST.search_iterative(root,8));
//        System.out.println(sBST.search_recursive(root,1));
//        System.out.println(sBST.search_iterative(root,1));

//        Insert_IN_BST iBST=new Insert_IN_BST();
//        System.out.println(iBST.insert_recursive(root,1));
//        System.out.println(iBST.insert_recursive(root,1));
//        System.out.println(iBST.insert_recursive(root,30));
//        System.out.println(iBST.insert_iterative(root,1));
//        System.out.println(iBST.insert_iterative(root,30));


//        Delete_in_BST dn=new Delete_in_BST();
//        dn.delete(root,5);
//        dn.delete(root,10);
//        dn.delete(root,10);
//        dn.delete(root,50);
//        inOrder(root);


//        Floor_in_BST floor=new Floor_in_BST();
//        Node temp=floor.floor(root,60);
//        Node temp2=floor.floor(root,80);
//        Node temp3=floor.floor(root,55);
//        Node temp4=floor.floor(root,2);
//        System.out.println(temp.data);
//        System.out.println(temp2.data);
//        System.out.println(temp3.data);
//        if(temp4==null)
//            System.out.println("floor is not present!");
//        else {
//            System.out.println(temp4.data);
//        }
//        inOrder(temp);
//        System.out.println();
//        inOrder(temp2);
//        System.out.println();
//        inOrder(temp3);
//        System.out.println();


        Ceil_in_BST ceil=new Ceil_in_BST();
        Node temp=ceil.ceil(root,60);
        Node temp2=ceil.ceil(root,80);
        Node temp3=ceil.ceil(root,55);
        Node temp4=ceil.ceil(root,2);
        Node temp5=ceil.ceil(root,110);
        System.out.println(temp.data);
        System.out.println(temp2.data);
        System.out.println(temp3.data);
        System.out.println(temp4.data);
        if(temp5==null)
            System.out.println("ceil is not present!");
        else {
            System.out.println(temp4.data);
        }
        inOrder(temp);
        System.out.println();
        inOrder(temp2);
        System.out.println();
        inOrder(temp3);
        System.out.println();



    }//Main Ends........................................................................................................

    static void inOrder(Node root){
        if(root!=null) {
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }
    }

    static Node root=null; //Declare the root of tree.....(GLOBAL)

    static void addNode(int val){  //Iterative approach..toAdd node in BST
        if(root==null){
            root=new Node(val);
        }else {
            Node cur = root;
            boolean bb;
            while (true) {
                bb=false;
                while (val < cur.data) {
                    if(cur.left==null){
                        cur.left=new Node(val);
                        bb=true;
                        break;
                    }else
                        cur=cur.left;
                }
                if(bb) break;
                while (val > cur.data) {
                    if(cur.right==null){
                        cur.right=new Node(val);
                        bb=true;
                        break;
                    }else
                        cur = cur.right;
                }
                if(bb) break;
            }
        }
    }
}
