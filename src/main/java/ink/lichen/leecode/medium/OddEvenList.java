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

        ListNode sentinel = head;
        while (sentinel.next != null ){
//            int i = 0;
            ListNode temp = sentinel.next;
//            while(i>0){
            sentinel.next = sentinel.next.next;
            sentinel.next.next = temp;
//            }

        }


        return null;
    }
}
