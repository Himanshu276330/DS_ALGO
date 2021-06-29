package Tree_Data_Structure;

import java.sql.SQLOutput;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Scanner;

public class AAA_Implementation_of_Binary_Tree {
    public static void main(String[] args) {

        System.out.println("Enter data of root  , if no data then give -ve no : ");
        Node root=Implementation(sc.nextInt());

//        System.out.println("Printing in preOrder transversal : ");
//        preOrder(root);
//        System.out.println();

        System.out.println("Printing in postOrder transversal : ");
        postOrder(root);
        System.out.println();

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
//        //method 02
//        LevelOrderTraversal_LineByLine.levelOrderTraversal2(root);

        //Printing left view node of level..
//        Print_Left_View_0fBinaryTree.printLeft(root,1);
//        System.out.println();
//        //method 02..
//        Print_Left_View_0fBinaryTree.printLeft2(root);
//        System.out.println();
//
//        //Size of BinaryTree..
//        System.out.println(Size_of_BinaryTree.size(root));
//
//        //Maximum value in a binary tree..
//        System.out.println(Maximum_Value_In_BinaryTree.max(root));
//
//        //Child sum property..
//        System.out.println(Child_SumProperty.childSumProperty(root));

        //Is balanced tree
//        System.out.println(Check_For_Balanced_Tree.isBalanced(root));
//        //method 2..
//        int temp=Check_For_Balanced_Tree.isBalanced2(root);
//        if(temp>0) System.out.println("Tree is balanced ");
//        else System.out.println("Tree is not balanced ");

        //Size of BinaryTree..
//        System.out.println(Size_of_BinaryTree.size(root));

        //Width of a binary tree..
//        System.out.println(Width_of_A_BinaryTree.maxWidth(root));


        //Convert Binary tree into doubly linked list....
//        Convert_BinaryTree_To_DoublyLinkedList.convert(root);
//        Node temp=Convert_BinaryTree_To_DoublyLinkedList.head;
//        while (temp!=null){
//            System.out.print(temp.data+" ");
//            temp=temp.right;
//        }

        //TreeTraversal_In_Spiral_Form..
//        TreeTraversal_In_Spiral_Form.print(root);
//        TreeTraversal_In_Spiral_Form.print2(root);   //method 02..


        //Diameter of BinaryTree.
//        System.out.println(Diameter_of_a_BinaryTree.diameter(root));
//
//        Diameter_of_a_BinaryTree.diameter2(root);
//        if(Diameter_of_a_BinaryTree.diameter==Integer.MIN_VALUE){
//            System.out.println(0);
//        }else
//            System.out.println(Diameter_of_a_BinaryTree.diameter);


        //Lca of two nodes...
//        LCA_of_BinaryTree lc=new LCA_of_BinaryTree();
//        if(lc.lca(root,40,60)==null){
//            System.out.println("null");
//        }else
//            System.out.println(lc.lca(root,40,60).data);


        //Count_Node_In_CompleteBinaryTree
//        System.out.println(Count_Node_In_CompleteBinaryTree.count(root));
//        System.out.println(Count_Node_In_CompleteBinaryTree.count2(root));


        //Serialize and DeSerialize..
//        Serialize_and_DeSerialize sd=new Serialize_and_DeSerialize();
//        sd.arr.clear();
//        sd.serialize(root);
//        sd.arr.clear();
//        sd.serialize(root);
//        ArrayList<Integer> temp=sd.arr;
//        for(int e:temp) System.out.print(e+" ");
//        System.out.println();
//        Node demo= sd.deSerialize(temp);
//        preOrder(demo);

        //Iterative InOrder traversal.
//        Iterative_InOrder_Traversal it=new Iterative_InOrder_Traversal();
//        it.traversal(root);
//        System.out.println();
//        Iterative_preOrder_Traversal it2=new Iterative_preOrder_Traversal();
//        it2.traversal(root);

        Iterative_postOrder_Traversal itp=new Iterative_postOrder_Traversal();
        itp.postOrder(root);


//        10 20 40 -8 -8 50 70 -8 -8 80 -8 -8 30 -8 60 -8 -8   -->sample binary tree1
//                                 10
//                               /    \
//                             20     30
//                            /   \     \
//                          40    50     60
//                               /  \
//                              70   80

    //  10 20 40 -8 -8 50 70 -8 -8 80 -8 -8 30 -8 60 -8 70 -8 -8   -->sample binary tree2
//      i.e-->
//                                10
//                              /    \
//                             20     30
//                            /   \     \
//                          40    50     60
//                               /  \      \
//                              70   80     70


//      5 10 20 40 60 -8 -8 -8 50 70 -8 -8 80 -8 -8 30 -8 60 -8 70 -8 -8 60 -8 -8   -->sample binary tree3
//      i.e-->

//                                    5
//                                  /   \
//                                10     60
//                              /    \
//                             20     30
//                            /   \     \
//                          40    50     60
//                         /     /  \      \
//                       60     70   80     70


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
