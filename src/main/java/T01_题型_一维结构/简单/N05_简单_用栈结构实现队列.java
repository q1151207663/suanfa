package T01_题型_一维结构.简单;


import java.util.Stack;

/**
 * 用栈实现队列
 * 使用Stack组装一种数据结构，该数据结构对外表现是队列
 *
 * 用两个栈，push两次就会变成队列的顺序
 *
 *
 * 1.pop栈不为空时不能往里面push数据
 * 2.push栈每次push给pop站必须将数据push空
 *
 */
public class N05_简单_用栈结构实现队列 {


    static class MyQueue {

        private Stack<Integer> stackPush = new Stack<>();
        private Stack<Integer> stackPop = new Stack<>();


        /**
         * 入队
         * @param value TODO
         */
        void add(int value) {
            stackPush.push(value);

            pushToPop();
        }


        /**
         * 出队
         * @return TODO
         */
        Integer poll() {
            if (stackPush.isEmpty() && stackPop.isEmpty()) {
                throw new RuntimeException("栈为空");
            }

            pushToPop();

            return stackPop.pop();
        }


        /**
         * push栈向pop栈 push数据
         *
         * 必须要pop栈为空时才能push数据
         *
         */
        private void pushToPop(){
            if (stackPop.isEmpty()) {
                while (!stackPush.isEmpty()) {
                    stackPop.push(stackPush.pop());
                }
            }
        }
    }


    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue();

        myQueue.add(1);
        myQueue.add(2);
        myQueue.add(3);
        myQueue.add(4);
        myQueue.add(5);

        System.out.println(myQueue.poll());
    }



}
