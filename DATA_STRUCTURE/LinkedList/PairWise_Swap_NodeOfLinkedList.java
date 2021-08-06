package DATA_STRUCTURE.LinkedList;

public class PairWise_Swap_NodeOfLinkedList {
    public static void main(String[] args) {

        Node head;
        head=new Node(10);
        Node temp=new Node(20);
        Node temp1=new Node(30);
        Node temp2=new Node(40);
        Node temp3=new Node(50);
        head.next=temp;
        temp.next=temp1;
        temp1.next=temp2;
        //temp2.next=temp3;

        traversal(head);
        swap_Naive(head);
        traversal(head);

        head=swap_efficient(head);
        traversal(head);
        head=swap_efficient(head);
        traversal(head);

    }

    //Swapping of data is costly operation....................
    private static void swap_Naive(Node head){
        if(head==null || head.next==null) return;

        Node cur=head;
        int temp;
        while (cur!=null && cur.next!=null){
            temp= cur.val;
            cur.val=cur.next.val;
            cur.next.val=temp;
            cur=cur.next.next;
        }
    }

    private static Node swap_efficient(Node head){
        if(head==null || head.next==null) return head;

        Node temp;
        Node cur=head,tail;
        head=cur.next;
        temp=cur;
        cur=cur.next;
        temp.next=cur.next;
        head.next=temp;
        cur=temp.next;
        tail=temp;

        while (cur!=null && cur.next!=null){
            temp= cur;
            cur=cur.next;
            temp.next=cur.next;
            cur.next=temp;
            tail.next=cur;
            tail=temp;
            cur=temp.next;
        }
        return head;
    }

    //Traversal in LInkedList...................................
    private static void traversal(Node head){
        if(head==null) return;
        while (head!=null){
            System.out.print(head.val+" -> ");
            head=head.next;
        }
        System.out.println("null");
    }
}
