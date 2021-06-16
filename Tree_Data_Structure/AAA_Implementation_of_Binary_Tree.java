package Tree_Data_Structure;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class AAA_Implementation_of_Binary_Tree {
    public static void main(String[] args) {

        System.out.println("Enter data of root  , if no data then give -ve no : ");
        Node root=Implementation(sc.nextInt());
//        System.out.println("Printing in preOrder transversal : ");
//        preOrder(root);
//        System.out.println();
//        System.out.println("Printing in postOrder transversal : ");
//        postOrder(root);
//        System.out.println();
//        System.out.println("Printing in inOrder transversal : ");
//        inOrder(root);
//        System.out.println();

            //Height of Binary Tree
//        System.out.println(Height_Of_A_Binary_Tree.height(root));

            //Print node at k distance
//        print(root,3);

        // print Level Order traversal
//        LevelOrderTraversal_of_binary_tree.levelOrderTraversal(root);
//        System.out.println();

        //level order traversal line by line...
//        LevelOrderTraversal_LineByLine.levelOrderTraversal(root);
//          //method 02
//        LevelOrderTraversal_LineByLine.levelOrderTraversal2(root);

        //Printing left view node of level..
        Print_Left_View_0fBinaryTree.printLeft(root,1);
        System.out.println();

        //Size of BinaryTree..
        System.out.println(Size_of_BinaryTree.size(root));

        //Maximum value in a binary tree..
        System.out.println(Maximum_Value_In_BinaryTree.max(root));


    // 10 20 40 -8 -8 50 70 -8 -8 80 -8 -8 30 -8 60 -8 -8   -->sample binary tree
//      i.e-->
//                                10
//                              /    \
//                             20     30
//                            /   \     \
//                          40    50     60
//                               /  \
//                              70   80


    }//Main Ends.......................................................................................

    static Scanner sc=new Scanner(System.in);
    static Node Implementation(int data){
        if(data<0) return null;
        Node root=new Node(data);
        System.out.println("Enter Data of left node of "+data+ " , if no data then give -ve no : ");
        root.left=Implementation(sc.nextInt());
        System.out.println("Enter Data of right node of "+data+ " , if no data then give -ve no : ");
        root.right=Implementation(sc.nextInt());
        return root;
    }

    static void preOrder(Node root){
        if(root!=null){
            System.out.print(root.data+" ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    static void postOrder(Node root){
        if(root!=null){
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data+" ");
        }
    }

    static void inOrder(Node root){
        if(root!=null){
            inOrder(root.left);
            System.out.print(root.data+" ");
            inOrder(root.right);
        }
    }

    static int height(Node root){
        if(root==null)
            return 0;
        else return 1+Math.max(height(root.left),height(root.right));
    }

    static void print(Node root,int k){
        if(root==null || k<1 ) return;
        if(k==1)
            System.out.print(root.data+" ");
        print(root.left,k-1);
        print(root.right,k-1);
    }
}
