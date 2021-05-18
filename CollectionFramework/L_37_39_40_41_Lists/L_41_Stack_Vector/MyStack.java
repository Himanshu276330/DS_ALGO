package CollectionFramework.L_37_39_40_41_Lists.L_41_Stack_Vector;

import CollectionFramework.L_37_39_40_41_Lists.L_40_LinkedList.MyLinkList;

public class MyStack<E>{

    MyLinkList<E> ll =new MyLinkList<>();
    void push(E e){
        ll.add(e);
    }

    E pop() throws Exception {
        return ll.removeLast();
    }

    E peek() throws Exception{
        return ll.getLast();
    }

}
