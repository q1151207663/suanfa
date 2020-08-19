package T07_题型_综合.简单;

import java.util.Arrays;

/**
 * 输入数字 n，按顺序打印出从 1 到最大的 n 位十进制数。
 * 比如输入 3，则打印出 1、2、3 一直到最大的 3 位数 999。
 */
public class N02_简单_求1到最大的n位数 {


    public static void main(String[] args) {
        int[] arr = printNumbers(2);
        System.out.println(Arrays.toString(arr));
    }




    /**
     * 返回打印结果数组
     * @param n 数字
     * @return 需要打印的数组
     */
    static int[] printNumbers(int n) {
        int size = (int) Math.pow(10 ,n) - 1;
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = i + 1;
        }
        return arr;
    }

}
