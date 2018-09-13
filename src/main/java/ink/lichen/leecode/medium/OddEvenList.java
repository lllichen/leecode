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
        //oddEven
        int i = 1;
        ListNode sentinel = head;
        ListNode dummy = head;

        while (sentinel != null )
        {
            System.out.println(i);
            if (i %2 == 1 && i > 1)
            {
                ListNode next = sentinel.next;

                ListNode temp = dummy.next;
                temp.next =  next;
                dummy.next = sentinel;
                sentinel.next = temp;

                dummy = dummy.next;

                if (next != null){
                    sentinel = next;
                }else {
                    break;
                }
            }else {
                sentinel= sentinel.next;
            }
            i++;
        }
        return head;
    }
}
