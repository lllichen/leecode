package ink.lichen.leecode.test.test_old.test_1_8;

import ink.lichen.leecode.support.ListNode;


public class ReverseList {


    public ListNode reverseList(ListNode head) {
//        ListNode pre = null;
//        while ( head != null){
//            ListNode next = head.next;
//            head.next = pre;
//            pre = head;
//            head = next;
//        }
//        return pre;
        if(head==null || head.next==null ){return head;}
        ListNode preNode=reverseList(head.next);
        head.next.next=head;
        head.next=null;

        return preNode;
    }


}
