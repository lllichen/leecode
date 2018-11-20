package ink.lichen.leecode.tx;

import ink.lichen.leecode.support.ListNode;

/**
 * Created by lichen@daojia.com on 2018-11-13.
 * 输入: 1->2->3->4->5->NULL, k = 2
 * 输出: 4->5->1->2->3->NULL
 * 解释:
 * 向右旋转 1 步: 5->1->2->3->4->NULL
 * 向右旋转 2 步: 4->5->1->2->3->NULL
 *
 * [1,2]
 * 1
 * [1]
 * 1
 */
public class RotateRight {

    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || k == 0){
            return head;
        }
        int n = 0;
        ListNode curNode = head;
        ListNode markHead = head;
        ListNode pre = head;
        while (curNode != null){
            curNode = curNode.next;
            n++;
            if (pre.next != null){
                pre = curNode;
            }
        }
        pre.next = head;
//        System.out.println(pre.val);
        int val =n - k % n ;

//      [1,2]
//      1
        pre = markHead;
        while (val > 0){
//            System.out.println(val);
            markHead = markHead.next;
            if (val > 1){
                pre = pre.next;
            }
            val--;

        }
        pre.next = null;
        return markHead;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        RotateRight rotateRight = new RotateRight();
        rotateRight.rotateRight(head,1);
    }
}
