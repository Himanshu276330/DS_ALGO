import OOPS.L_28_INHERITANCE.Teacher;

import java.util.*;

public class demo {
    public static void main(String[] args) {

        ArrayList<TreeNode> ans=generateTrees(3);
        for(TreeNode t:ans){
            preOrder(t);
            System.out.println();
        }

    }//Main Ends....................................................

    public static ArrayList<TreeNode> generateTrees(int a) {
        ans=new ArrayList<>();
        int s=1;
        TreeNode temp;
        for(int i=s;i<=a;i++){
            TreeNode root;
            if(i==s){
                root=new TreeNode(i);
                temp=root;
                solve(root,temp,false,i+1, a);
            }else if(i== a){
                root=new TreeNode(i);
                temp=root;
                solve(root,temp,true,s,i-1);
            }else {
                root=new TreeNode(i);
                temp=root;
                solve(root,temp,true,s,i-1);
                solve(root,temp,false,i+1, a);
            }
        }

        return ans;
    }
    private static ArrayList<TreeNode> ans;
    private static void solve(TreeNode root,TreeNode cur,boolean left,int s,int e){
        if(s==e){
            if(left)
                cur.left=new TreeNode(s);
            else
                cur.right=new TreeNode(s);
            return;
        }
        for(int i=s;i<=e;i++){
            TreeNode temp;
            if(i==s){
                temp=new TreeNode(i);
                if(left)
                    cur.left=temp;
                else
                    cur.right=temp;
                solve(root,temp,false,i+1,e);
            }else if(i==e){
                temp=new TreeNode(i);
                if(left)
                    cur.left=temp;
                else
                    cur.right=temp;
                solve(root,temp,true,s,i-1);
            }else {
                temp=new TreeNode(i);
                if(left)
                    cur.left=temp;
                else
                    cur.right=temp;
                solve(root,temp,true,s,i-1);
                solve(root,temp,false,i+1,e);
            }
        }
    }

    private static TreeNode copy(TreeNode root){
        if(root==null) return null;
        TreeNode head=new TreeNode(root.val);
        head.left=copy(root.left);
        head.right=copy(root.right);
        return head;
    }


    static class TreeNode {
         int val;
         TreeNode left;
         TreeNode right;
         TreeNode(int x) { val = x; }
    }

    private static void preOrder(TreeNode root){
        if(root!=null){
            System.out.print(root.val+" ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }

}



