package DATA_STRUCTURE.LinkedList;

public class Circular_LINKED_List {
    public static void main(String[] args) {

        //10 - 20 - 30 - 40
        Node head=new Node(10);
        Node temp=new Node(20);
        Node temp1=new Node(30);
        Node temp2=new Node(40);
        head.next=temp;
        temp.next=temp1;
        temp1.next=temp2;
        temp2.next=head;

//        traversal(head);
//        traversal(temp);
//        traversal(temp1);

//        head=insertAtBegin_Naive(head,9);
//        traversal(head);
//        head=insertAtBegin_Efficient(head,5);
//        traversal(head);
//
//        head=insertAtEnd_Efficient(head,50);
//        traversal(head);
//        head=insertAtEnd_Naive(head,60);
//        traversal(head);
//
//        head=deleteHead_Efficient(head);
//        traversal(head);
//        head=deleteHead_Naive(head);
//        traversal(head);

        //head=deleteKthNode(head,1);
        //traversal(head);
        //head=deleteKthNode(head,2);
        //traversal(head);
        head=deleteKthNode(head,3);
        traversal(head);

    }
    //Delete K'th node of Circular Linked List........................
    private static Node deleteKthNode(Node head,int k){
        if(head==null || head.next==head) return null;

        if(k==1){
            head.val=head.next.val;
            head.next=head.next.next;
            return head;
        }
        Node cur=head;
        while (k-->2)
            cur=cur.next;
        cur.next=cur.next.next;
        return head;
    }

    //Delete Head of Circular Linked List.............................
    private static Node deleteHead_Efficient(Node head){
        if(head==null || head.next==head){
            return null;
        }
        head.val=head.next.val;
        head.next=head.next.next;
        return head;
    }
    private static Node deleteHead_Naive(Node head){
        if(head==null || head.next==head){
            return null;
        }
        Node cur=head;
        while (cur.next!=head)
            cur=cur.next;
        cur.next=head.next;
        return head.next;

    }

    //Insert node at Begin of Circular Linked List.....................
    private static Node insertAtBegin_Efficient(Node head,int val){
        if(head==null){
            head=new Node(val);
            head.next=head;
            return head;
        }
        Node temp=new Node(head.val);
        head.val=val;
        temp.next=head.next;
        head.next=temp;
        return head;
    }
    private static Node insertAtBegin_Naive(Node head,int val){
        if(head==null){
            head=new Node(val);
            head.next=head;
            return head;
        }
        Node temp=new Node(val);
        temp.next=head;
        while (head.next!=temp.next){
            head=head.next;
        }
        head.next=temp;
        return temp;
    }

    //Insert A node at End of Circular Linked List....................
    private static Node insertAtEnd_Efficient(Node head,int val){
        if(head==null){
            head=new Node(val);
            head.next=head;
            return head;
        }
        Node temp=new Node(head.val);
        head.val=val;
        temp.next=head.next;
        head.next=temp;
        return temp;
    }
    private static Node insertAtEnd_Naive(Node head,int val){
        if(head==null){
            head=new Node(val);
            head.next=head;
            return head;
        }
        Node temp=new Node(val);
        Node cur=head;
        while (cur.next!=head){
            cur=cur.next;
        }
        cur.next=temp;
        temp.next=head;
        return head;
    }

    //Traversal in Circular LInkedList................................
    private static void traversal(Node head){
        if(head==null) return;
        Node temp=head;
        temp=temp.next;
        System.out.print(head.val+" -> ");
        while (temp!=head){
            System.out.print(temp.val+" -> ");
            temp=temp.next;
        }
        System.out.println();
    }

}
