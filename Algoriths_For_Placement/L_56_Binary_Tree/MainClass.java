package Algoriths_For_Placement.L_56_Binary_Tree;

import java.util.*;

public class MainClass {
    static Scanner sc=null;
    public static void main(String[] args) {
        sc=new Scanner(System.in);

        Node root=createTree();
        InOrder(root);
//        System.out.println();
//        PreOrder(root);
//        System.out.println();
//        PostOrder(root);
//        System.out.println();


    }

    static void InOrder(Node root){
        if(root==null) return;
        InOrder(root.left);
        System.out.print(root.data+" ");
        InOrder(root.right);
    }

    static void PreOrder(Node root){
        if(root==null) return;
        System.out.print(root.data+" ");
        PreOrder(root.left);
        PreOrder(root.right);
    }

    static void PostOrder(Node root){
        if(root==null) return;
        PostOrder(root.left);
        PostOrder(root.right);
        System.out.print(root.data+" ");
    }

    static Node createTree(){
        Node root=null;
        System.out.println("Enter data and if it null give -1 : ");
        int data=sc.nextInt();
        if (data<0) return null;
        root=new Node(data);
        System.out.println("Enter data of left Node of : "+data+" and if it null give -1");
        root.left=createTree();

        System.out.println("Enter data of right Node of : "+data+" and if it null give -1");
        root.right=createTree();

        return root;
    }

}
class Node {
    Node left, right;
    int data;

    public Node(int data){
       this.data=data;
    }
}






