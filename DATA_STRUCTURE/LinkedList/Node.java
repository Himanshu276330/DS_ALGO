package DATA_STRUCTURE.LinkedList;

class Node {
    int val;
    Node pre;
    Node next;

    Node(int val) {
        this.val = val;
        next = null;
        pre = null;
    }
}
