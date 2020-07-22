package T02_题型_递归.简单;

/**
 * 思路
 *
 * 递归的将数组分成两半，左：0~mid   右：mid+1~size
 * 一直递归到分不了只有一个数
 *
 *
 * 分析递归问题 一定要画思维脑图
 * 递归的脑图怎么话，看马士兵左神算法班第二集1小时50分
 *
 */
public class N01_简单_用递归求数组最大值 {

    /**
     * 求数组中的最大值
     * @param arr TODO
     * @return TODO
     */
    private static int getMax(int[] arr) {
        return process(arr ,0 ,arr.length-1);
    }


    /**
     * 求arr[L..R]范围内的最大值
     * @param arr todo
     * @param L todo
     * @param R todo
     * @return todo
     */
    private static int process(int[] arr, int L, int R) {
        if (L==R) {
            return arr[L];
        }

//        int mid = (L+R)/2;
        int mid = L + ((R-L) >> 1);//中点

        int leftMax = process(arr ,L ,mid);
        int rightMax = process(arr ,mid+1 ,R);

        return Math.max(leftMax ,rightMax);
    }



    public static void main(String[] args) {
        int[] arr = new int[5];

        getMax(arr);
    }

}
