package DATA_STRUCTURE.LinkedList;

public class Detect_LoopAndRemove_It {
    public static void main(String[] args) {

        //10 - 20 - 30 - 40
        Node head; {head=new Node(10);
            Node temp=new Node(20);
            Node temp1=new Node(30);
            Node temp2=new Node(40);
            head.next=temp;
            temp.next=temp1;
            temp1.next=temp2;

            //temp2.next=head;
            temp2.next=temp;
        }

        head=removeLoop(head);
        traversal(head);

    }

    private static Node removeLoop(Node head){
        Node slow=head,fast=head;
        while (fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast) break;
        }
        if(fast==null) return head; //no loop..

        slow=head;
        if(slow==fast){  //completely circular linkedList.
            fast=fast.next;
            slow.next=null;
            return fast;
        }else {
            while (slow.next!=fast.next){
                slow=slow.next;
                fast=fast.next;
            }
        }
        fast.next=null;
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
