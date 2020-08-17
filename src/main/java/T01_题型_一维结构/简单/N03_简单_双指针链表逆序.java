package T01_题型_一维结构.简单;


import java.util.ArrayList;

/**
 * 定义两个指针 pre 和 next
 */
public class N03_简单_双指针链表逆序 {


    /**
     * 单链表倒序，并返回头结点
     * @param head head指针
     * @return 逆序后的头节点
     */
    private static Node revLinkedList(Node head) {
        Node pre = null;//head指针的前一个节点
        Node next ;//head指针的后一个节点

        while (head != null) {

            next = head.next;
            head.next = pre ;//next指针往前指(逆序)

            pre = head ;//往后推进
            head = next;
        }
        return pre;
    }


    /**
     * 双链表倒序
     * @param head
     * @return
     */
    private static DoubleNode revDoubleList(DoubleNode head) {
        DoubleNode pre = null;
        DoubleNode next = null;

        while (head != null) {

            next = head.next ;
            head.next = pre ; //next指针往前指 ，last指针往后指
            head.last = next;

            pre = head ; //head指针往后推进
            head = next;
        }

        return null;
    }





}

class Node{
    int value;
    Node next;

    Node(int value){
        this.value = value;
    }
}


class DoubleNode{
    int value ;
    DoubleNode last ;
    DoubleNode next ;

    DoubleNode(int value) {
        this.value = value;
    }
}