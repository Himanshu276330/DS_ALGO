package DATA_STRUCTURE.LinkedList;

public class Sorted_Insert_inLinkedList {
    public static void main(String[] args) {

        //10 - 20 - 30 - 40
        Node head; {head=new Node(10);
        Node temp=new Node(20);
        Node temp1=new Node(30);
        Node temp2=new Node(40);
        head.next=temp;
        temp.next=temp1;
        temp1.next=temp2;}

        traversal(head);
        head=insertSorted(head,5);
        traversal(head);
        head=insertSorted(head,45);
        traversal(head);
        head=insertSorted(head,60);
        traversal(head);


    }

    //Sorted Insert.............................................
    private static Node insertSorted(Node head,int val){
        if(head==null){
            return new Node(val);
        }
        Node cur=head;
        while (true){
            if(cur.val>val){
                Node temp=new Node(cur.val);
                cur.val=val;
                temp.next=cur.next;
                cur.next=temp;
                break;
            }
            if(cur.next==null){
                cur.next= new Node(val);
                break;
            }
            cur=cur.next;
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
        System.out.println();
    }
}
