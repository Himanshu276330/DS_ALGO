package DATA_STRUCTURE.LinkedList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LRU_Cache_Design {
    public static void main(String[] args) {

        ArrayList<Integer> referenceSequence=new ArrayList<>(Arrays.asList(
                10,20,10,30,40,50,30,40,60,30));

        Node head=LRU(referenceSequence);
        traversal(head);
    }

    private static Node LRU(ArrayList<Integer> ref){
        Map<Integer,Node> map=new HashMap<>();
        Node head=null;

        for(int e:ref){
            if(map.containsKey(e)){
                Node temp=map.get(e);
                if(temp!=head){
                    temp.pre.next=temp.next;
                    if(temp.next!=null)
                        temp.next.pre=temp.pre;
                    temp.pre=null;
                    temp.next=head;
                    head.pre=temp;
                    head=temp;
                }
            }else {
                Node temp=new Node(e);
                map.put(e,temp);
                if(head!=null){
                   temp.next=head;
                   head.pre=temp;
                }
                head=temp;
            }
        }
        return head;
    }

    private static void traversal(Node head){
        while (head!=null){
            System.out.print(head.val+" <-> ");
            head=head.next;
        }
        System.out.println("null");
    }

}
