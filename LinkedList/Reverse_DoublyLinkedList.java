package LinkedList;

public class Reverse_DoublyLinkedList {
    public static void main(String[] args) {

        //10 - 20 - 30 - 40
        Node head=new Node(10);
        Node temp=new Node(20);
        Node temp1=new Node(30);
        Node temp2=new Node(40);
        head.next=temp; temp.pre=head;
        temp.next=temp1; temp1.pre=temp;
        temp1.next=temp2; temp2.pre=temp1;

        print(head);
        head=reverse(head);
        print(head);

    }
    private static Node reverse(Node root){
        Node head=null;
        while (root!=null){
            root.pre=root.next;
            root.next=head;
            head=root;
            root=root.pre;
        }
        return head;
    }

    private static void print(Node root){
        while (root!=null){
            System.out.print(root.val+" - ");
            root=root.next;
        }
        System.out.println();
    }
}
class Node{
    int val;
    Node pre;
    Node next;
    Node(int val){
        this.val=val;
        next=null;
        pre=null;
    }
}