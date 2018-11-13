package ink.lichen.leecode.tx;

import ink.lichen.leecode.support.ListNode;

public class MergeKLists {



    public ListNode mergeKLists(ListNode[] lists) {
        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;
        if (lists.length==0){
            return dummy.next;
        }else if (lists.length == 1){
            return lists[0];
        }
        int  n = lists.length;


        while (true){
            ListNode min = null;
            int temp = -1;
            for (int i = 0; i < n; i++){
                if ( lists[i]!= null ){
                    if (min == null ){
                        min = lists[i];
                        temp = i;
                    }else if (min != null && min.val > lists[i].val){
                        min = lists[i];
                        temp = i;
                    }
                }

            }
            if (temp != -1){
                lists[temp] = lists[temp].next;
                cur.next = min;
                cur = cur.next;
            }else {
                break;
            }
        }

        return dummy.next;

    }
}
