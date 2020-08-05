package T01_题型_一维结构.简单;


import java.util.ArrayList;

/**
 * 定义两个指针 pre 和 next
 */
public class N03_简单_双指针链表逆序 {
    public static void main(String[] args) {
        ArrayList<Node> nodes = new ArrayList<>();
        Node head = new Node(1);
        nodes.add(new Node(2));
        nodes.add(new Node(3));
        nodes.add(new Node(4));

    }


    /**
     * 单链表倒序，并返回头结点
     * @param head
     * @return
     */
    private static Node revLinkedList(Node head) {
        Node pre = null;
        Node next ;

        while (head != null) {

            next = head.next;
            head.next = pre ;//next指针往前指

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