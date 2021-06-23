package BST;

public class Implementation_of_BST {
    public static void main(String[] args) {

        addNode(50);addNode(70);addNode(30);addNode(40);
        addNode(10);addNode(60);addNode(80);addNode(5);addNode(8);
        inOrder(root);
        System.out.println();

        Search_in_BST sBST=new Search_in_BST();
        System.out.println(sBST.search_recursive(root,8));
        System.out.println(sBST.search_iterative(root,8));
        System.out.println(sBST.search_recursive(root,1));
        System.out.println(sBST.search_iterative(root,1));

        Insert_IN_BST iBST=new Insert_IN_BST();
//        System.out.println(iBST.insert_recursive(root,1));
//        System.out.println(iBST.insert_recursive(root,1));
//        System.out.println(iBST.insert_recursive(root,30));
        System.out.println(iBST.insert_iterative(root,1));
        System.out.println(iBST.insert_iterative(root,30));
        inOrder(root);



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
