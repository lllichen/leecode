package ink.lichen.leecode.bytecode;

import ink.lichen.leecode.support.ListNode;

/**
 * Created by lichen@daojia.com on 2018-11-27.
 *
 * 输入:
 * [
 *   1->4->5,
 *   1->3->4,
 *   2->6
 * ]
 * 输出: 1->1->2->3->4->4->5->6
 *
 */
public class MergeKLists {


    public ListNode mergeKLists(ListNode[] lists) {
        if(lists==null || lists.length == 0) return null;
        return sort(lists, 0, lists.length-1);
    }
    public ListNode sort(ListNode[] lists, int low, int high){
        if(low>=high)
            return lists[low];
        int mid = (high+low)>>1;
        ListNode l1 = sort(lists, low, mid);
        ListNode l2 = sort(lists, mid+1, high);
        return merge(l1,l2);
    }
    public ListNode merge(ListNode l1, ListNode l2){
        if(l1 == null) return l2;
        if(l2 == null) return l1;
        ListNode dummy = new ListNode(0);
        dummy.next = l1;
        ListNode cur = dummy;
        while(l1 != null && l2!=null){
            if(l1.val<l2.val){
                l1 = l1.next;
            }
            else{
                ListNode next = l2.next;
                l2.next = cur.next;
                cur.next = l2;
                l2 = next;
            }
            cur = cur.next;
        }
        if(l2 != null){
            cur.next = l2;
        }
        return dummy.next;
    }

}
