package ink.lichen.leecode.test.test_3_10;

public class CopyRandomList {

    public Node copyRandomList(Node head) {
        Node cur = head;
        while(cur != null){
            Node copy = new Node();
            copy.val = cur.val;
            copy.next = cur.next;
            cur.next = copy;
            cur = copy.next;
        }
        return head;
    }

    public static void main(String[] args) {
        Node node = new Node();
        node.val = 0;
        Node node1 = new Node();
        node1.val = 1;
        Node node2 = new Node();
        node2.val = 2;
        node.next = node1;
        node1.next = node2;
        new CopyRandomList().copyRandomList(node);

    }
}
class Node {
    public int val;
    public Node next;
    public Node random;

    public Node() {}

    public Node(int _val,Node _next,Node _random) {
        val = _val;
        next = _next;
        random = _random;
    }
};