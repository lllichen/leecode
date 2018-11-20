package ink.lichen.leecode.tx;

import ink.lichen.leecode.support.ListNode;

/**
 * Created by lichen@daojia.com on 2018-11-13.
 * 输入: 1->2->3->4->5->NULL, k = 2
 * 输出: 4->5->1->2->3->NULL
 * 解释:
 * 向右旋转 1 步: 5->1->2->3->4->NULL
 * 向右旋转 2 步: 4->5->1->2->3->NULL
 */
public class RotateRight {

    public ListNode rotateRight(ListNode head, int k) {
        int n = 0;
        ListNode curNode = head;
        ListNode markHead = head;
        while (curNode != null){
            n++;
            curNode = curNode.next;
        }
        curNode.next = head;
        int val = k % n ;
        while (val >= 0){
            markHead = markHead.next;
            val--;
        }
        return null;
    }
}
