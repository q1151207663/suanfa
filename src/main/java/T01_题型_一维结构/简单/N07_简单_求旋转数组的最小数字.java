package T01_题型_一维结构.简单;

/**
 * 解法：二分法，递归
 *
 * 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
 * 输入一个 非递减排序 的数组的一个旋转，输出旋转数组的最小元素。
 * 例如
 * 数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为 1。
 *
 * NOTE：给出的所 有元素都大于 0，若数组大小为 0，请返回-1。假设数组中不存在重复元素。
 */
public class N07_简单_求旋转数组的最小数字 {

    public static void main(String[] args) {
        int[] arr = new int[] {1 ,2 ,13 ,4 ,5};

        System.out.println(getMin(arr));
    }




    /**
     * 返回旋转数组的最小元素
     * @param array 旋转好的数组
     * @return 最小元素
     */
    private static int getMin(int[] array) {
        return process(array ,0 , array.length);
    }


    /**
     * 返回array[L...R]上的最小值
     * @param array 数组
     * @param L 左边界
     * @param R 右边界
     * @return 最小值
     */
    private static int process(int[] array ,int L ,int R) {

        if (L == R) {
            return array[L];
        }

        int mid = (L + R) >> 1;
        int left = process(array, L, mid);
        int right = process(array ,mid + 1 ,R);

        return Math.min(left ,right);
    }

}
