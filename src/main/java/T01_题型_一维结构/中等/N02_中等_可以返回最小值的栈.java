package T01_题型_一维结构.中等;

import java.util.Stack;

/**
 * 设计一个栈，在基本功能的基础上，再实现返回栈中最小元素的功能 getMin
 * getMin()方法的时间复杂度是O(1)
 *
 * 要求，每次弹出数之后，仍然可以getMin
 *
 * 用两个栈，一个栈用于存放数据；另一个栈用于存放最小值
 *
 */
public class N02_中等_可以返回最小值的栈 {

    /**
     * 最小数栈，第一种实现
     *
     *
     * 第二种实现知识稍微改变了一下 最小数栈的 出入栈规则而已
     */
    public static class MyStack {
        private Stack<Integer> stackData = new Stack<>();
        private Stack<Integer> stackMin = new Stack<>();


        /**
         * 入栈
         * @param newNum TODO
         */
        void push(int newNum) {
            if (stackMin.isEmpty()) {
                stackMin.push(newNum);//直接push
            } else if (newNum < getMin()) {
                stackMin.push(newNum);
            } else {
                stackMin.push( getMin() );
            }

            stackData.push(newNum);
        }


        /**
         * 出栈
         * @return TODO
         */
        Integer pop(){

            if (stackData.isEmpty()) {
                throw new RuntimeException("栈是空的");
            }

            stackMin.pop();
            return stackData.pop();
        }


        /**
         * 获取栈中的最小值  时间复杂度O(1)
         * @return TODO
         */
        private int getMin() {
            if (stackMin.isEmpty()) {
                throw new RuntimeException("最小数栈为空");
            }

            return stackMin.peek();
        }

    }


    /**
     * 最小数栈，第二种实现
     * 同样是使用两个栈
     */
    static class MyStack02 {
        private Stack<Integer> stackData = new Stack<>();
        private Stack<Integer> stackMin = new Stack<>();


        /**
         * 入栈
         * @param newNum TODO
         */
        void push(int newNum) {
            if (stackMin.isEmpty()) {
                stackMin.push(newNum);//直接push
            } else if (newNum <= getMin()) {
                stackMin.push(newNum);
            }

            stackData.push(newNum);
        }

        private Integer getMin() {
            return -1;
        }


    }











    public static void main(String[] args) {
        MyStack stack = new MyStack();
        stack.push(3);
        stack.push(5);
        stack.push(6);
        stack.push(1);
        stack.push(9);

        System.out.println(stack.getMin());  // 1

        System.out.println(stack.pop()); // 9

        System.out.println(stack.getMin()); // 1

        System.out.println(stack.pop()); // 1

        System.out.println(stack.getMin()); // 3
    }








}

