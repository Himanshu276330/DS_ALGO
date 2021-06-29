package TRIE;

import javax.swing.tree.TreeNode;

public class Main {
    public static void main(String[] args) {

        root=new TrieNode();
        insert("dog");
        insert("deg");
        insert("dining");
        insert("dinner");
        insert("dom");
        System.out.println(search_word("dog"));
        System.out.println(search_word("deg"));
        System.out.println(search_word("dkkjskg"));

        //delete_key(root,"dog",0);
        delete_key(root,"do",0);
        System.out.println(search_word("dog"));




    }//MAIN ENDS............................................................................

    static TrieNode root;

    static void insert(String str) {
        TrieNode cur = root;
        for (int i = 0; i < str.length(); i++) {
            int index = str.charAt(i) - 'a';
            if (cur.child[index] == null) {
                cur.child[index] = new TrieNode();
                cur = cur.child[index];
            } else {
                cur = cur.child[index];
            }
        }
        cur.isEnd = true;
    }

    static boolean search_word(String str) {
        TrieNode cur = root;
        for (int i = 0; i < str.length(); i++) {
            int index = str.charAt(i) - 'a';
            if (cur.child[index] == null) {
                return false;
            }
            cur = cur.child[index];
            if (i == str.length() - 1 && cur.isEnd) {
                return true;
            }
            if (i == str.length() - 1 && !cur.isEnd) {
                return false;
            }
        }
        return false;
    }

    static TrieNode delete_key(TrieNode root,String str,int index){
        if(root==null) return null;
        if(index==str.length()){
            if(!root.isEnd){
                System.out.println("Key is not present in that !");
                return root;
            }
            root.isEnd=false;
            if(isEmpty(root)){
                return null;
            }
        }
        int i=str.charAt(index)-'a';
        if(root.child[i]!=null){
            root.child[i]=delete_key(root.child[i],str,index+1);
        }
        return root;
    }
    static boolean isEmpty(TrieNode root){
        for(int i=0;i<26;i++){
            if(root.child[i]!=null) return false;
        }
        return true;
    }

}
class TrieNode{
    TrieNode []child=new TrieNode[26];  //automatically it initialise with child[index]=false..
    boolean isEnd;
}
