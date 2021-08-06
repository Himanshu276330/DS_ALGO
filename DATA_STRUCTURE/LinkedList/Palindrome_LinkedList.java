package DATA_STRUCTURE.LinkedList;

public class Palindrome_LinkedList {
    public static void main(String[] args) {

        //10 - 20 - 30 - 40
        Node head;
        {
            head=new Node(9);
            Node temp=new Node(21);
            Node temp1=new Node(21);
            Node temp2=new Node(9);

            head.next=temp;
            temp.next=temp1;
            temp1.next=temp2;
        }

        System.out.println(isPalindrome(head));

    }//Main Ends...............................

    private static boolean isPalindrome(Node head){
        if(head==null) return true;
        Node fast=head,slow=head;
        while (fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        Node l2;
        if(fast==null){  //even node
            l2=reverse(slow);
        }else {
            l2=reverse(slow.next);
        }
        while (l2!=null){
            if(head.val!=l2.val) return false;
            l2=l2.next;
            head=head.next;
        }
        return true;
    }
    private static Node reverse(Node head){
        Node cur=head,temp;
        head=null;
        while (cur!=null){
            temp=cur.next;
            cur.next=head;
            head=cur;
            cur=temp;
        }
        return head;
    }
}
