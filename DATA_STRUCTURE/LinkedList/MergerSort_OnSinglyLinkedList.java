package DATA_STRUCTURE.LinkedList;

public class MergerSort_OnSinglyLinkedList {
    public static void main(String[] args) {

        Node head;
        {
            head = new Node(6);
            Node temp = new Node(8);
            Node temp1 = new Node(9);
            Node temp2 = new Node(5);
            Node temp3 = new Node(7);
            head.next = temp;
            temp.next = temp1;
            temp1.next = temp2;
            temp2.next = temp3;
        }

        head = sortList(head);
        traversal(head);

    }

    public static Node sortList(Node head) {
        if (head == null || head.next == null) return head;
        Node slow = head, fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        fast = slow.next;
        slow.next = null;
        return merge(sortList(head), sortList(fast));
    }

    private static Node merge(Node l, Node m) {
        if (l == null) return m;
        if (m == null) return l;
        Node head = null;
        if (l.val < m.val) {
            head = l;
            l = l.next;
        } else {
            head = m;
            m = m.next;
        }
        Node cur = head;
        while (l != null && m != null) {
            if (l.val < m.val) {
                cur.next = l;
                cur = cur.next;
                l = l.next;
            } else {
                cur.next = m;
                cur = cur.next;
                m = m.next;
            }
        }
        if (l == null) cur.next = m;
        else cur.next = l;
        return head;
    }

    private static void traversal(Node head) {
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }
}
