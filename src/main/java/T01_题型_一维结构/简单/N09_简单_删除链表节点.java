package T01_题型_一维结构.简单;


/**
 * 给定单向链表的头指针和一个要删除的节点的值，定义一个函数删除该节点。
 * 返回删除后的链表的头节点。
 */
public class N09_简单_删除链表节点 {

    //测试
    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        n1.next = new ListNode(2);
        n1.next.next = new ListNode(3);

        ListNode head = deleteNode(n1, 2);
        System.out.println(head.val);
        System.out.println(head.next.val);
        System.out.println(head.next.next);
    }



    /**
     * 删除节点
     * @param head 链表头节点
     * @param val 指定值
     * @return 头节点
     */
    static ListNode deleteNode(ListNode head ,int val) {
        if (head == null)
            return null;

        if (head.val == val)
            return head.next;

        ListNode cur = head;
        while (cur.next != null && cur.next.val != val) {
            cur = cur.next;
        }

        cur.next = cur.next.next;
        return head;
    }


    static class ListNode {
        int val;
        ListNode next;
        public ListNode(int val) {
            this.val = val;
        }
    }

}
