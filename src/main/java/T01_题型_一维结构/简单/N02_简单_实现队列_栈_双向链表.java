package 题型_一维结构_01.简单;

public class 简单_实现队列_栈_双向链表_03 {

    public static void main(String[] args) {

    }



    static class Node<T>{
        T value ;
        Node<T> last ;
        Node<T> next ;

        Node(T value){
            this.value = value;
        }
    }


    /**
     * 双向链表
     * @param <T>
     */
    static class DoubleList<T>{
        Node<T> head ;//头指针
        Node<T> tail ;//尾指针

        /**
         * 从头部增加节点
         * @param value TODO
         */
        void addFromHead(T value) {
            Node<T> cur = new Node<>(value);
            if (head==null) {
                head = cur;
                tail = cur;
            }else {
                cur.next = head;
                head.last = cur;

                head = cur;
            }

        }


        /**
         * 从尾部增加节点
         * @param value TODO
         */
        void addFromTail(T value) {
            Node<T> cur = new Node<>(value);

            if (tail==null) {
                tail = cur;
                head = cur;
            }else {
                cur.last = tail;
                tail.next = cur;

                tail = cur;
            }
        }


        /**
         * 弹出头部节点
         * @return TODO
         */
        Node<T> popFromHead(){
            if (head==null) {
                return null;
            }

            Node<T> temp = null;

            temp = head;
            head = head.next;
            return temp;
        }


        /**
         * 弹出尾部节点
         * @return TODO
         */
        Node<T> popFromTail(){
            if (tail==null) {
                return null;
            }

            Node<T> temp = null;
            temp = tail;
            tail = tail.last;
            return temp;
        }


        boolean isEmpty() {
            return head==null && tail==null;
        }
    }


    /**
     * 栈
     * @param <T>
     */
    static class MyStack<T> {
        private DoubleList<T> list = new DoubleList<>();

        /**
         * 入栈
         * @param value TODO
         */
        void push(T value) {
            list.addFromTail(value);
        }


        /**
         * 出栈
         * @return TODO
         */
        Node<T> pop() {
            return list.popFromTail();
        }


        /**
         * 是否为空
         * @return TODO
         */
        boolean isEmpty(){
            return list.isEmpty();
        }

    }


    /**
     * 队列
     * @param <T>
     */
    static class MyQueue<T>{
        private DoubleList<T> list = new DoubleList<>();


        /**
         * 入队
         * @param value TODO
         */
        void push(T value) {
            list.addFromTail(value);
        }


        /**
         * 出队
         * @return TODO
         */
        Node<T> pull(){
            return list.popFromHead();
        }


        /**
         * 判空
         * @return boolean
         */
        boolean isEmpty(){
            return list.isEmpty();
        }


    }


}
