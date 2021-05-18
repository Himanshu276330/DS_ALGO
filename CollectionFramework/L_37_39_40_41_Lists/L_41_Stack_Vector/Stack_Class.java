package CollectionFramework.L_37_39_40_41_Lists.L_41_Stack_Vector;

public class Stack_Class {
    public static void main(String[] args) {

//        Stack<Integer> stack=new Stack<>();

//        stack.push(45);
//        stack.push(24);
//        stack.push(360);

        //Last element is get
//        int e=stack.pop();
//        System.out.println(e);

        //Last 2nd element is get
//        int e2=stack.pop();
//        System.out.println(e2);

        //last 3rd element is get
//        int e3=stack.pop();
//        System.out.println(e3);

        //Give an exception
//        int e4=stack.pop();
//        System.out.println(e4);

//        System.out.println(stack.peek());

           //using my own created stack by MyLinkedList Class in [package CollectionFramework.Lists.L_40_LinkedList]
        MyStack<Integer> ms=new MyStack<>();

        ms.push(54);
        ms.push(95);
        ms.push(56);

        try {
            System.out.println(ms.pop());
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Ending code");

        try {
            System.out.println(ms.peek());
        } catch (Exception e) {
            System.out.println(e);
        }


    }
}