package T01_题型_一维结构.简单;


/**
 * leetcode 206
 */
public class N06_简单_递归链表逆序 {

    public static void main(String[] args) {
        Node head = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        head.next = n2;
        n2.next = n3;
        n3.next = n4;


        Node node = revNodeList(head);
        System.out.println(node.value);
    }


    /**
     * 递归链表逆序
     * @param head 链表头节点
     * @return 逆序后的头节点
     */
    static Node revNodeList(Node head) {
        if (head == null || head.next == null)
            return head;
        Node last = revNodeList(head.next);
        head.next.next = head;
        head.next = null;
        return last;
    }



    static class Node {
        Node next;
        int value;

        public Node(int value) {
            this.value = value;
        }
    }
}
