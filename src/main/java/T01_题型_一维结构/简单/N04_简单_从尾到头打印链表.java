package T01_题型_一维结构.简单;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @program: suanfa
 * @description: 剑指offer
 * @author: twz
 * @create: 2020-08-05 15:25
 *
 * 三种解法：
 * 1、利用ArrayList取巧、list.add(0 ,tmp.val)
 * 2、利用栈
 * 3、递归
 **/
public class N04_简单_从尾到头打印链表 {

    static class ListNode{
        int val ;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    /**
     * 解法一，ArrayList取巧
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
     * 解法二，利用栈
     */
    ArrayList<Integer> printListFromTailToHead2(ListNode listNode) {
        ArrayList<Integer> list = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();

        while (listNode != null) {
            stack.push(listNode.val);
            listNode = listNode.next;
        }
        while (!stack.isEmpty()) {
            list.add(stack.pop());
        }
        return list;
    }


    /**
     * 解法三，递归解法
     */
    ArrayList<Integer> list = new ArrayList<>();
    public ArrayList<Integer> printListFromTailToHead3(ListNode listNode) {
        if (listNode != null) {
            printListFromTailToHead(listNode.next);
            list.add(listNode.val);
        }
        return list;//题目正确需要return list，否则不需要
    }


}
