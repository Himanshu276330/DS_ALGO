package DATA_STRUCTURE.LinkedList;

public class Segregate_EvenAndOdd_NodeOfLinkedList {
    public static void main(String[] args) {

        //10 - 20 - 30 - 40
        Node head;
        {
            head=new Node(9);
            Node temp=new Node(21);
            Node temp1=new Node(51);
            Node temp2=new Node(27);

            head.next=temp;
            temp.next=temp1;
            temp1.next=temp2;
        }

        traversal(head);
        head=segregate(head);
        traversal(head);

    }

    private static Node segregate(Node head){
        if(head==null) return null;
        Node odd=null,even=null;
        Node oddHead=null;

        Node cur=head;
        while (cur!=null){
            if((cur.val&1)==0){
                if(even!=null){
                    even.next=cur;
                    even=cur;
                }else {
                    even = cur;
                    head=cur;
                }
            }else {
                if(odd!=null){
                    odd.next=cur;
                    odd=cur;
                }else {
                    odd = cur;
                    oddHead=cur;
                }
            }
            cur=cur.next;
        }
        if(even!=null)
            even.next =oddHead;
        if(odd!=null)
            odd.next=null;

        if(even==null)  //if there is no even number.
            return oddHead;

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
