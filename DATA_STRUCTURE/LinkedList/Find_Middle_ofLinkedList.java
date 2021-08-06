package DATA_STRUCTURE.LinkedList;

public class Find_Middle_ofLinkedList {
    public static void main(String[] args) {

        //10 - 20 - 30 - 40
        Node head; {head=new Node(10);
            Node temp=new Node(20);
            Node temp1=new Node(30);
            Node temp2=new Node(40);
            head.next=temp;
            temp.next=temp1;
            temp1.next=temp2;
            temp2.next=new Node(50);
        }

        traversal(head);
        Node middle=middleNode(head);
        traversal(middle);

    }

    //Find Middle..............................................
    private static Node middleNode(Node head){
        Node slow=head,fast=head;
        while (fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
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
