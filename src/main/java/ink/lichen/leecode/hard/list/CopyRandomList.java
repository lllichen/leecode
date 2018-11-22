package ink.lichen.leecode.hard.list;

import ink.lichen.leecode.support.RandomListNode;

import javax.xml.soap.Node;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

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
        Map<RandomListNode,RandomListNode> oldNewMap = new HashMap<RandomListNode,RandomListNode>();

        RandomListNode dummy = new RandomListNode(0);

        RandomListNode cur = dummy;

        while (head != null){
            RandomListNode newNode = new RandomListNode(head.label);
            oldNewMap.put(head,newNode);
            head = head.next;
            cur.next = newNode;
            cur = cur.next;
        }

        RandomListNode newHead = dummy.next;
        while (head != null){
            newHead.random = oldNewMap.get(head.random);
            head = head.next;
            newHead = newHead.next;
        }

        return dummy.next;
    }
}
