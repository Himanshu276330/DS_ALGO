package DATA_STRUCTURE.LinkedList;

public class Remove_duplicate_from_Sorted_LinkedList {
    public static void main(String[] args) {

        Node head;
        {
            head = new Node(10);
            Node temp = new Node(20);
            Node temp1 = new Node(30);
            Node temp11 = new Node(30);
            Node temp111 = new Node(30);
            Node temp2 = new Node(40);
            Node temp22 = new Node(40);
            Node temp222 = new Node(40);
            head.next = temp;
            temp.next = temp1;
            temp1.next = temp11;
            temp11.next = temp111;
            temp111.next = temp2;
            temp2.next = temp22;
            temp22.next = temp222;
        } //Implementation..

        traversal(head);
        //removeDuplicate(head);
        removeDuplicate2(head);
        traversal(head);

    }

    //Remove Duplicate................................................
    private static void removeDuplicate(Node head){
        while (head!=null){
            if(head.next!=null && head.next.val==head.val){
                Node prev=head;
                while (head!=null && head.val==prev.val){
                    head=head.next;
                }
                prev.next=head;
            }else
                head=head.next;
        }
    }

    private static void removeDuplicate2(Node head){
        while (head!=null){
            if(head.next!=null && head.val==head.next.val){
                head.next=head.next.next;
            }else
                head=head.next;
        }
    }

    //Traversal in Circular LinkedList................................
    private static void traversal(Node head){
        while (head!=null){
            System.out.print(head.val+" -> ");
            head=head.next;
        }
        System.out.println("null");
    }
}
