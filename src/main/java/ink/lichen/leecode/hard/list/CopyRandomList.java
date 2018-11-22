package ink.lichen.leecode.hard.list;

import ink.lichen.leecode.support.RandomListNode;

/**
 * Created by lichen@daojia.com on 2018-11-22.
 *
 *给定一个链表，每个节点包含一个额外增加的随机指针，该指针可以指向链表中的任何节点或空节点。
 *
 *要求返回这个链表的深度拷贝
 */
public class CopyRandomList {


    public RandomListNode copyRandomList(RandomListNode head) {

        if (head == null){
            return null;
        }
        RandomListNode res = new RandomListNode(head.label);
        res.random =
        head = head.next;
        while (head != null){
            res.next = new RandomListNode(head.label);
            res.next.random = head.random;
        }

        return res;
    }
}
