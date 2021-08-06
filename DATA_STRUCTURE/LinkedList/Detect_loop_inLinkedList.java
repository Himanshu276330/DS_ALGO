package DATA_STRUCTURE.LinkedList;

import java.util.HashSet;
import java.util.Set;

public class Detect_loop_inLinkedList {
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


        System.out.println(isLoop_Naive_meth01(head));
        System.out.println(isLoop_meth04(head));
        System.out.println(isLoop_meth05(head));

        //this destroys the linkedList.........
        System.out.println(isLoop_meth03(head));

    }
    private static boolean isLoop_Naive_meth01(Node head){
        Node cur=head;
        while (cur!=null){
            Node temp=head;
            while (temp!=cur){
                if(temp==cur.next) return true;
                temp=temp.next;
            }
            cur=cur.next;
        }
        return false;
    }

    //This method destroys the linked list............
    private static boolean isLoop_meth03(Node head){
        Node temp=new Node(-1);
        Node demo;
        while (head!=null){
            if(head.next==temp) return true;
            demo=head.next;
            head.next=temp;
            head=demo;
        }
        return false;
    }

    private static boolean isLoop_meth04(Node head){
        Set<Node> set=new HashSet<>();
        Node cur=head;
        while (cur!=null){
            if(set.contains(cur)) return true;
            set.add(cur);
            cur=cur.next;
        }
        return false;
    }

    private static boolean isLoop_meth05(Node head){
        Node slow=head,fast=head;
        while (fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast) return true;
        }
        return false;
    }

}
