public class FloydCycleAlgorithm {
    public static void main(String[] args) {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        Node node6 = new Node(6);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node3;

        System.out.println(findLoop(node1));

    }

    private static boolean findLoop(Node head) {
        Node t = head;
        Node h = head;
        while (t != null && h != null && h.next != null) {
            t = t.next;
            h = h.next.next;
            if (t == h) {
                return true;
            }
        }
        return false;
    }
}

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}