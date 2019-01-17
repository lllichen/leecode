package ink.lichen.leecode.test.test_old.test_1_9;

import ink.lichen.leecode.support.ListNode;

public class RotateRight {

    //1->2->3->4->5 k = 3
    //4->5->1->2->3
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null){
            return head;
        }
        int n = 0;
        ListNode cur = head;
        ListNode tail = null;
        while (cur != null){
            n++;
            tail = cur;
            cur = cur.next;
        }

        k = n - k % n;
        if (k == 0 || k == n) {
            return head;
        }
        cur = head;
        ListNode kPre = null;
        for (int i = 0 ; i < k ; i++){
            kPre = cur;
            cur = cur.next;
        }
        kPre.next = null;
        tail.next = head;
        return cur;
    }

    public static void main(String[] args) {
        RotateRight rotateRight = new RotateRight();
        rotateRight.rotateRight(new ListNode(1),1);
    }
}
