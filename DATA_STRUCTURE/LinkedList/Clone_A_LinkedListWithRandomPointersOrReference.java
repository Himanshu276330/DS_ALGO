package DATA_STRUCTURE.LinkedList;

import java.lang.ref.Reference;
import java.util.HashMap;

public class Clone_A_LinkedListWithRandomPointersOrReference {
    public static void main(String[] args) {

        NewNode head1=new NewNode(10);
        NewNode temp1=new NewNode(5);
        NewNode temp2=new NewNode(20);
        NewNode temp3=new NewNode(15);
        NewNode temp4=new NewNode(20);
        head1.next=temp1;
        temp1.next=temp2;
        temp2.next=temp3;
        temp3.next=temp4;

        head1.random=temp2;
        temp1.random=temp3;
        temp2.random=head1;
        temp3.random=temp2;
        temp4.random=temp3;

        traversal(head1);
        NewNode head2=clone(head1);
        traversal(head2);

        NewNode head3=clone_efficient(head1);
        traversal(head3);

        traversal(head1);
    }

    //Method 02  Efficient Solution............................
    private static NewNode clone_efficient(NewNode head){
        if(head==null) return null;
        //Step-01..............................
        NewNode cur=head,nextNode=null;
        while (cur!=null){
            nextNode=cur.next;
            cur.next=new NewNode(cur.val);
            cur.next.next=nextNode;
            cur=nextNode;
        }

        //Step-02.............................
        cur=head;
        while (cur!=null){
            nextNode=cur.next;
            nextNode.random=(cur.random!=null?cur.random.next:null);
            cur=nextNode.next;
        }

        //Step-03.......Detach.................
        cur=head;
        NewNode cloneHead=cur.next;
        while (cur!=null){
            nextNode=cur.next;
            cur.next=nextNode.next;
            cur=nextNode.next;
        }
        return cloneHead;
    }

    //Method 01  Naive Solution................................
    private static NewNode clone(NewNode head1){
        HashMap<NewNode,NewNode> map=new HashMap<>();
        NewNode cur=head1;
        while (cur!=null){
            map.put(cur,new NewNode(cur.val));
            cur=cur.next;
        }
        NewNode head2=null;
        NewNode cur2;
        cur=head1;
        while (cur!=null){
            cur2=map.get(cur);
            if(head2==null) head2=cur2;
            cur2.random=map.get(cur.random);
            cur2.next=map.get(cur.next);
            cur2=cur2.next;
            cur=cur.next;
        }
        return head2;
    }

    private static void traversal(NewNode head){
        while (head!=null){
            System.out.println("Node val : "+head.val+", Random Node val : "+(head.random!=null?head.random.val:null));
            head=head.next;
        }
        System.out.println("-------------------------------------");
    }
    private static class NewNode{
        int val;
        NewNode next;
        NewNode random;

        public NewNode(int val) {
            this.val = val;
            next =null;
            random = null;
        }
    }

}

