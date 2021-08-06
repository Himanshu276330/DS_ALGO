package DATA_STRUCTURE.LinkedList;

import java.util.HashSet;
import java.util.Set;

public class Intersection_ofTwoLinkedList {
    public static void main(String[] args) {

        //9 -> 21 -> 51 -> 27 -> null
        //         /
        //14 -> 45

        Node head1;
        Node head2;
        head1=new Node(9);
        Node temp=new Node(21);
        Node temp1=new Node(51);
        Node temp2=new Node(27);
        head1.next=temp;
        temp.next=temp1;
        temp1.next=temp2;

        head2=new Node(14);
        Node demo=new Node(45);
        head2.next=demo;

        //intersection_Naive(head1,head2);
        //demo.next=temp1;
        //intersection_Naive(head1,head2);
        //demo.next=temp2;
        //intersection_Naive(head1,head2);
        //intersection_Naive(head1,temp1);

        intersection(head1,head2);
        demo.next=temp1;
        intersection(head1,head2);
        demo.next=temp2;
        intersection(head1,head2);
        intersection(head1,temp1);

    }

    private static void intersection_Naive(Node head1,Node head2){
        if(head1==null || head2==null) System.out.println("No intersection!");
        Set<Node> set=new HashSet<>();
        while (head1!=null){
            set.add(head1);
            if(head1==head2){
                System.out.println("Both head pointer are at same Linked List");
                return;
            }
            head1=head1.next;
        }
        while (head2!=null){
            if(set.contains(head2)) {
                System.out.println("Intersection Node is -> "+head2.val);
                return;
            }
            head2=head2.next;
        }
        System.out.println("No intersection!");
    }

    private static void intersection(Node head1,Node head2){
        if(head1==null || head2==null){
            System.out.println("No intersection!");
            return;
        }
        Node cur=head1;
        int size1=0;
        while (cur!=null){
            cur=cur.next;
            size1++;
        }
        cur=head2;
        int size2=0;
        while (cur!=null){
            cur=cur.next;
            size2++;
        }
        cur=head1;
        Node cur2=head2;
        if(size1>size2){
            int d=size1-size2;
            while (d-- >0)
                cur=cur.next;
        }else {
            int d=size2-size1;
            while (d-- >0)
                cur2=cur2.next;
        }
        while (cur2!=cur){
            cur=cur.next;
            cur2=cur2.next;
        }
        if(cur==null)
            System.out.println("No Intersection!");
        else
            System.out.println("Intersection node is -> "+cur.val);
    }
}
