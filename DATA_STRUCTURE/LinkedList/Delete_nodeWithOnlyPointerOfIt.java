package DATA_STRUCTURE.LinkedList;

public class Delete_nodeWithOnlyPointerOfIt {
    public static void main(String[] args) {

        //10 - 20 - 30 - 40
        Node head;
        Node temp1;
        {head=new Node(10);
            Node temp=new Node(20);
            temp1=new Node(30);
            Node temp2=new Node(40);
            head.next=temp;
            temp.next=temp1;
            temp1.next=temp2;
        }
        traversal(head);
        deleteNode(temp1);
        traversal(head);

    }

    private static void deleteNode(Node cur){
        if(cur.next==null) return;
        cur.val=cur.next.val;
        cur.next=cur.next.next;
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
