package T03_题型_排序.简单;


import java.util.Arrays;

/**
 * 整体是递归
 * 左边排好序 + 右边排好序 + merge(合并)让整体有序
 */
public class N01_简单_并归排序 {


    public static void main(String[] args) {
        int size = 20;
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = (int) (Math.random() * 10);
        }

        System.out.println(Arrays.toString(arr));

        mergeSort(arr);

        System.out.println(Arrays.toString(arr));
    }



    static void mergeSort(int[] arr) {
        process(arr, 0, arr.length - 1);
    }


    private static void process(int[] arr, int L, int R) {
        if (L == R) {//base case： 问题小到哪种规模，就不需要继续往下划分了
            return;
        }

        int mid = L + ((R - L) >> 1);
        process(arr, L, mid);
        process(arr, mid + 1, R);
        merge(arr, L, mid, R);
    }

    private static void merge(int[] arr, int L, int mid, int R) {
        int[] help = new int[R - L + 1];//辅助数组，长度是R-L+1(元素个数)
        int i = 0;//help的指针

        int p1 = L;//左指针
        int p2 = mid + 1;//右指针

        while (p1 <= mid && p2 <= R) {
            help[i++] = arr[p1] < arr[p2] ? arr[p1++] : arr[p2++];
        }

        while (p1 <= mid) {
            help[i++] = arr[p1++];
        }

        while (p2 <= R) {
            help[i++] = arr[p2++];
        }

        for (int j = 0; j < help.length; j++) {
            arr[L + j] = help[j];
        }

    }

}
