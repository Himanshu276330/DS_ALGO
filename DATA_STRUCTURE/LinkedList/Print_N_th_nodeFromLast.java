package DATA_STRUCTURE.LinkedList;

public class Print_N_th_nodeFromLast {
    public static void main(String[] args) {

        //10 -> 20 -> 30 -> 40 -> 50 -> null
        Node head; {head=new Node(10);
            Node temp=new Node(20);
            Node temp1=new Node(30);
            Node temp2=new Node(40);
            head.next=temp;
            temp.next=temp1;
            temp1.next=temp2;
            temp2.next=new Node(50);
        }

        NthNode_fromLast_Naive(head,1);
        NthNode_fromLast_Naive(head,2);
        NthNode_fromLast_Naive(head,3);
        NthNode_fromLast_Naive(head,5);

        NthNode_fromLast(head,4);
        NthNode_fromLast(head,0);
        NthNode_fromLast(head,6);
        NthNode_fromLast(head,7);
        NthNode_fromLast(head,5);
        NthNode_fromLast(head,3);

    }

    private static void NthNode_fromLast(Node head,int n){
        if(n<=0){
            System.out.println("null");
            return;
        }
        Node cur=head,prev=head;
        while (n>0 && cur!=null){
            cur=cur.next;
            n--;
        }
        if(cur==null && n>0){
            System.out.println("null");
            return;
        }
        while (cur!=null){
            cur=cur.next;
            prev=prev.next;
        }
        System.out.println(prev.val);
    }

    private static void NthNode_fromLast_Naive(Node head,int n){
        if(n<=0) return;
        int size=0;
        Node cur=head;
        while (cur!=null){
            size++; cur=cur.next;
        }
        if(n>size) return;
        size=size-n;
        cur=head;
        while (size-->0)
            cur=cur.next;
        System.out.println(cur.val);
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
