package T05_题型_二维结构.二维数组.简单;


/**
 * 在一个二维数组中，
 * 每一行都按照从左到右递增的顺序排序，
 * 每一列都按照从上到下递增的顺序排序。
 *
 * 题目一定一定一定要读懂。
 */
public class N01_简单_二维数组中查找目标值 {

    //测试
    public static void main(String[] args) {
        int[][] arr = new int[][]{
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        System.out.println(find1(arr, 5));
        System.out.println(find1(arr, 10));
    }



    /**
     * 双指针暴力查找 时间复杂度O(nm)
     * @param arr 数组
     * @param target 目标值
     * @return 是否找到
     */
    static boolean find1(int[][] arr ,int target) {
        if (arr==null || arr.length ==0)
            return false;
        int row = 0;
        int col = arr[0].length - 1;

        while (col >= 0 && row <= arr[0].length-1) {
            if (arr[row][col] == target) {
                return true;
            } else if (arr[row][col] > target) {
                col--;
            } else {
                row++;
            }
        }
        return false;
    }


}
