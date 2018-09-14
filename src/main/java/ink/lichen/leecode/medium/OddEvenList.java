package ink.lichen.leecode.medium;

import ink.lichen.leecode.support.ListNode;

/**
 * Created by lichen@daojia.com on 2018-9-13.
 *  输入: 1->2->3->4->5->NULL
 *  输出: 1->3->5->2->4->NULL
 *  1 2 3 4 5
 *  1 3 2 4 5
 *  1 3 5 2 4
 *  time o(n) space o(1)
 */
public class OddEvenList {
    public ListNode oddEvenList(ListNode head) {
        int i = 1;
        ListNode sentinel = head;
        ListNode dummy = head;
        while (sentinel != null )
        {
            if (i %2 == 0)
            {
                if (sentinel.next == null){break;}

                ListNode next = sentinel.next;
                ListNode temp = dummy.next;
                dummy.next = next;
                sentinel.next = next.next;
                next.next = temp;

                dummy = dummy.next;
            }else {
                sentinel= sentinel.next;
            }
            i++;
        }
        return head;
    }


    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        OddEvenList oddEvenList = new OddEvenList();
        oddEvenList.oddEvenList(head);
    }
}
