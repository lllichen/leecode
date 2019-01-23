package ink.lichen.leecode.test.test_1_23;

import ink.lichen.leecode.support.ListNode;

/**
 * Created by lichen@daojia.com on 2019-1-23.
 */
public class RemoveNthFromEnd {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode h = head;
        ListNode t = head;
        for (int k = 0; k < n; k++) {
            h = h.next;
        }

        if (h == null) {
            return head.next;
        }

        while (h.next != null) {
            h = h.next;
            t = t.next;
        }
        t.next = t.next.next;
        return head;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        new RemoveNthFromEnd().removeNthFromEnd(head,1);
    }

}

