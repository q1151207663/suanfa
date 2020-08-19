package T06_题型_斐波拉契;

/**
 * 0、1、1、2、3、5、8、13
 *
 * 重点掌握非递归的实现方式
 *
 */
public class N01_简单_求斐波拉契第N项 {

//    public static void main(String[] args) {
//        System.out.println(fibonacci(45));
//        System.out.println(fibonacci2(45));
//    }





    /**
     * 非递归方式(循环)
     * @param index 索引
     * @return result
     */
    static int fibonacci2(int index) {
        if (index < 2) {
            return index;
        }

        int preOne = 1;
        int preTwo = 0;
        int sum = 0;
        for (int i = 2; i <= index; i++) {
            sum = preOne + preTwo;
            preTwo = preOne;
            preOne = sum;
        }

        return sum;
    }




    /**
     * 递归方式
     * @param index 索引
     * @return result
     */
    static int fibonacci(int index) {
        if (index < 2) {
            return index;
        }
        return fibonacci(index - 1) + fibonacci(index - 2);
    }

}
