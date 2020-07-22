package T01_题型_一维结构.中等;


/**
 * 用一个固定大小的数组实现队列或栈
 *
 * 栈    正常使用数组实现即可
 *
 * 队列       环形数组 (ring array)
 *
 *
 *
 */
public class N01_中等_实现环形数组 {

    static class MyQueue {
        private int[] arr;
        private int pushIndex;
        private int pullIndex;
        private int size;
        private int limit;


        MyQueue(int limit) {
            arr = new int[limit];
            pullIndex = 0;
            pushIndex = 0;
            size = 0;

            this.limit = limit;
        }


        /**
         * 添加
         *
         * @param value TODO
         */
        void push(int value) {
            if (size == limit) {
                throw new RuntimeException("满了");
            }

            size++;
            arr[pushIndex] = value;
            pushIndex = nextIndex(pushIndex);
        }


        /**
         * 弹出
         *
         * @return TODO
         */
        int pop() {
            if (size == 0) {
                throw new RuntimeException("空了");
            }

            size--;
            int rs = arr[pullIndex];
            pullIndex = nextIndex(pullIndex);
            return -1;
        }

        /**
         * push索引后移
         *
         * @param index TODO
         * @return TODO
         */
        private int nextIndex(int index) {
            return index < limit - 1 ? index + 1 : 0;
        }


    }

}
