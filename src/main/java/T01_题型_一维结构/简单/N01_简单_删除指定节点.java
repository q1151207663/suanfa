package T01_题型_一维结构.简单;

public class N01_简单_删除指定节点 {
    public static void main(String[] args) {

    }


    static Node removeNode(Node head ,int num) {
        /*
         * 可能前面连续多个节点的值都和num相等
         * 第一件事，先遍历链表
         */
        while (head != null) {
            if (head.value!=num) {
                break;
            }
            head = head.next;
        }


        //head来到第一个不需要删的位置
        Node cur = head ;//保存head 返回

        while (cur != null) {
            if (cur.value==num) {
                cur.next = cur.next.next ;
            }
            cur = cur.next;
        }

        return null;
    }

    static class Node{
        int value ;
        Node next ;

        Node(int value) {
            this.value = value;
        }
    }
}


