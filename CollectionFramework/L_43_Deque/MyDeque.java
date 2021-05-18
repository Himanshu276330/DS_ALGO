package CollectionFramework.L_43_Deque;

public class MyDeque<E> {

    public static class Node<E>{
        E data;
        Node<E> next;
        Node<E> prev;

        public Node(E data){
            this.data=data;
            this.next=this.prev=null;
        }
    }
    Node<E> head,tail;
    public void addToFirst(E e){
           //toAdd is local variable for this addToFirst
        Node<E> toAdd=new Node<>(e);
        if (head==null){
            head=tail=toAdd;
            return;
        }
        head.next=toAdd;
        toAdd.prev=head;
        head=toAdd;
    }
    public void addToLast(E e){
           //toAdd is local variable for this addToLast
        Node<E> toAdd=new Node<>(e);
        if (head==null){
            head=tail=toAdd;
            return;
        }
        tail.prev=toAdd;
        toAdd.next=tail;
        tail=toAdd;
    }
    public E removeFromFirst(){
        Node<E> temp=head;
        if (head==null){
            return null;
        }
        if (head==tail){
            head=tail=null;
            return temp.data;
        }
        head=head.prev;
        head.next=null;
        return temp.data;
    }
    public E removeFromLast(){
        Node<E> temp=tail;
        if (head==null){
            return null;
        }
        if (head==tail){
            head=tail=null;
            return temp.data;
        }
        tail=tail.next;
        tail.prev=null;
        return temp.data;
    }
    public void print(){
        while(head!=null){
            System.out.print(head.data+" ");
            head=head.prev;
        }
    }

}
