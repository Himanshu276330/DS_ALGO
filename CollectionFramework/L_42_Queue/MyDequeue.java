package CollectionFramework.L_42_Queue;

import CollectionFramework.L_37_39_40_41_Lists.L_40_LinkedList.MyLinkList.Node;

public class MyDequeue<E> {

    private Node<E> head ,rear;

    public void enqueue(E e){
        Node<E> toAdd=new Node<>(e);
        if (head==null){
            head=rear=toAdd;
            return;
        }
            rear.next=toAdd;
            rear=rear.next;
        }
    public E dequeue(){
        if (head==null){
            return null;
        }
        Node<E> temp=head;
        head=head.next;
        if (head==null){
            rear=null;
        }
        return temp.data;
    }
    public E element(){
        if (head==null) return null;
        return head.data;
    }
}
