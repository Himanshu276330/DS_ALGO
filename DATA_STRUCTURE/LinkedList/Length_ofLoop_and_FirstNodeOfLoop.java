package DATA_STRUCTURE.LinkedList;

public class Length_ofLoop_and_FirstNodeOfLoop {
    public static void main(String[] args) {

        //10 - 20 - 30 - 40
        Node head; {head=new Node(10);
            Node temp=new Node(20);
            Node temp1=new Node(30);
            Node temp2=new Node(40);
            head.next=temp;
            temp.next=temp1;
            temp1.next=temp2;

            temp2.next=head;
            //temp2.next=temp;
        }

        lengthOfLoop_andFirstNode(head);

    }

    private static void lengthOfLoop_andFirstNode(Node head){
        Node slow=head,fast=head;
        while (fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast) break;
        }
        if(fast==null) {
            System.out.println("First Node of Loop is :-> null");
            System.out.println("Size of loop is -> "+0);
            return; //no loop..
        }

        slow=head;
        while (slow!=fast){
            slow=slow.next;
            fast=fast.next;
        }

        System.out.println("First Node of Loop is :-> "+slow.val);

        fast=fast.next;
        int size=1;
        while (slow!=fast) {
            fast = fast.next;
            size++;
        }
        System.out.println("Size of loop is -> "+size);
    }
}
