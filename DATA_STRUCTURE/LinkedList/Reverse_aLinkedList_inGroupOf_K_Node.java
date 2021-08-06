package DATA_STRUCTURE.LinkedList;

public class Reverse_aLinkedList_inGroupOf_K_Node {
    public static void main(String[] args) {

        Node head;
        {
            head = new Node(10);
            Node temp = new Node(20);
            Node temp1 = new Node(30);
            Node temp11 = new Node(40);
            Node temp111 = new Node(50);
            Node temp2 = new Node(60);
            Node temp22 = new Node(70);
            Node temp222 = new Node(80);
            head.next = temp;
            temp.next = temp1;
            temp1.next = temp11;
            temp11.next = temp111;
            temp111.next = temp2;
            temp2.next = temp22;
            temp22.next = temp222;
        } //Implementation..

        traversal(head);
        head=reverse_Group_recursive(head,3);
        traversal(head);

        head=reverse_Group_iterative(head,3);
        traversal(head);
        head=reverse_Group_iterative(head,2);
        traversal(head);

        head=reverse_Group_recursive(head,2);
        traversal(head);
        head=reverse_Group_recursive(head,1);
        traversal(head);

        head=reverse_Group_iterative(head,1);
        traversal(head);

    }

    private static Node reverse_Group_iterative(Node head,int k){
        if(k<0) return head;
        Node prevTail=null;
        Node resHead=null;
        while (head!=null) {
            Node newHead = null, temp = null;
            int n = k;
            Node tail=head;
            while (n > 0 && head != null) {
                temp = head.next;
                head.next = newHead;
                newHead = head;
                head = temp;
                n--;
            }
            if(resHead!=null){
                prevTail.next=newHead;
            } else {
                resHead=newHead;
            }
            prevTail=tail;
        }
        return resHead;
    }
    private static Node reverse_Group_recursive(Node head,int k){
        if(head==null){
            return null;
        }
        Node newHead=null,temp=null;
        Node tail=head; int n=k;
        while (n>0 && head!=null){
            temp=head.next;
            head.next=newHead;
            newHead=head;
            head=temp;
            n--;
        }
        tail.next=reverse_Group_recursive(head,k);
        return newHead;
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
