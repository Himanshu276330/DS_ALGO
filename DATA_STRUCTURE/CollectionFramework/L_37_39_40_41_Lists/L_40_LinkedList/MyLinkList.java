package DATA_STRUCTURE.CollectionFramework.L_37_39_40_41_Lists.L_40_LinkedList;

public class MyLinkList<E> {
    //Node is a just declaration , we also use box in place of Node

    public static class Node<E>{
        public E data;
        public Node<E> next;

        public Node(E data){
            this.data=data;
            next=null;
        }
    }

    Node<E> head;

        //Add function of MyLinkList [01]
    public void add(E data){
        Node<E> toAdd=new Node<>(data);
        if (isEmpty()) {
            head=toAdd;
            return;  //Exit the method[i.e - add] after it
        }
        Node<E> temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=toAdd;
    }
        //Print all element Function [02]
    public void print(){
            Node<E> temp=head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
    }

       //Function [03]
//    boolean isEmpty(){
//        if (head==null) return true;
//        else return false;
//    }

    //Optimise the above
    public boolean isEmpty(){
        return head==null;
    }

       //Function [04] ,Remove Last element
    public  E removeLast() throws Exception{
        Node<E> temp=head;
        if (temp==null){
            throw new Exception("Cant remove last element from a empty Stack");
        }
        if (temp.next==null){
            E toRemoved=temp.data;
            temp=null;
            return toRemoved;
        }
        while(temp.next.next!=null){
            temp=temp.next;
        }
        E toRemoved=temp.next.data;
        temp.next=null;
        return toRemoved;
    }

                   //Function [05] ,get Last element
           public  E getLast() throws Exception{
              Node<E> temp=head;
              if (temp==null){
                  throw new Exception("Cant peek last element from a empty Stack");
              }
              while(temp.next!=null){
                  temp=temp.next;
              }
              E lastE=temp.data;
              //temp.next=null;
              return lastE;
          }

}




