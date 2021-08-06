package DATA_STRUCTURE.LinkedList;

import java.util.ArrayList;

public class Reverse_Singly_LinkedList {
    public static void main(String[] args) {

        Node head;
        {
            head = new Node(10);
            Node temp = new Node(20);
            Node temp1 = new Node(30);
            Node temp2 = new Node(40);
            head.next = temp;
            temp.next = temp1;
            temp1.next = temp2;
        } //Implementation..

        traversal(head);

        head=reverse(head);
        traversal(head);

        reverse_Naive(head);
        traversal(head);

        head=reverse_recursive(head);
        traversal(head);

        head=reverse_recursive2(head,null);
        traversal(head);

    }

    //Reverse Linked List............................................
    private static Node reverse(Node head){
        Node newHead=null;
        Node pre;
        while (head!=null){
            pre=head;
            head=head.next;
            pre.next=newHead;
            newHead=pre;
        }
        return newHead;
    }
    //void because head change nahi ho raha h..
    private static void reverse_Naive(Node head){
        ArrayList<Integer> arr=new ArrayList<>();
        Node cur=head;
        while (cur!=null){
            arr.add(cur.val);
            cur=cur.next;
        }
        cur=head;
        for(int i= arr.size()-1;i>=0;i--){
            cur.val=arr.get(i);
            cur=cur.next;
        }
    }

    private static Node reverse_recursive(Node head){
        if(head==null) return null;
        if(head.next==null){
            return head;
        }
        Node temp_head=head;
        Node tail=head.next;
        head=reverse_recursive(head.next);
        tail.next=temp_head;
        temp_head.next=null;
        return head;
    }
    private static Node reverse_recursive2(Node head,Node prev){
        if(head==null) return prev;
        Node temp=head.next;
        head.next=prev;
        prev=head;
        return reverse_recursive2(temp,prev);
    }

    //Traversal in LInkedList................................
    private static void traversal(Node head){
        while (head!=null){
            System.out.print(head.val+" -> ");
            head=head.next;
        }
        System.out.println("null");
    }

}
