package DATA_STRUCTURE.LinkedList;

public class Merge_TwoSortedArray {
    public static void main(String[] args) {

        Node head1=new Node(10);
        Node n1=new Node(20);  head1.next=n1;
        Node n2=new Node(30);  n1.next=n2;
        Node n3=new Node(40); n2.next=n3;

        Node head2=new Node(5);
        Node m1=new Node(25);  head2.next=m1;
        Node m2=new Node(26);  m1.next=m2;
        Node m3=new Node(27); m2.next=m3;

        Node head=merge(head1,head2);
        traversal(head);

    }//Main Ends......................................................

    private static Node merge(Node head1,Node head2){
        if(head1==null) return head2;
        if(head2==null) return head1;
        Node head=null;
        if(head1.val< head2.val){
            head=head1;
            head1=head1.next;
        }else {
            head=head2;
            head2=head2.next;
        }
        Node cur=head;
        while (head1!=null && head2!=null){
            if(head1.val< head2.val){
                cur.next=head1;
                head1=head1.next;
            }else {
                cur.next=head2;
                head2=head2.next;
            }
            cur=cur.next;
        }
        if(head1==null) cur.next=head2;
        else cur.next=head1;
        return head;
    }

    private static void traversal(Node head){
        while (head!=null){
            System.out.print(head.val+" -> ");
            head=head.next;
        }
        System.out.println("null");
    }
}
