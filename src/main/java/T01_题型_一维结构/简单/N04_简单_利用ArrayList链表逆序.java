package T01_题型_一维结构.简单;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * @program: suanfa
 * @description: 剑指offer
 * @author: twz
 * @create: 2020-08-05 15:25
 **/
public class N04_简单_利用ArrayList链表逆序 {

    class ListNode{
        int val ;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    /**
     * 解法一，非递归解法
     */
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> list = new ArrayList<>();
        ListNode tmp = listNode;
        while (tmp != null) {
            list.add(0 ,tmp.val);
            tmp = tmp.next;
        }
        return list;
    }


    /**
     * 解法二，递归解法
     */
    ArrayList<Integer> list = new ArrayList<>();
    public ArrayList<Integer> printListFromTailToHead2(ListNode listNode) {
        if (listNode != null) {
            printListFromTailToHead(listNode.next);
            list.add(listNode.val);
        }
        return list;//题目正确需要return list，否则不需要
    }


}
