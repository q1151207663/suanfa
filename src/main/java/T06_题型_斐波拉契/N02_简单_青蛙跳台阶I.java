package T06_题型_斐波拉契;


/**
 * 青蛙跳台阶问题
 *
 * 一只青蛙一次可以跳上 1 级台阶，也可以跳上 2 级。求该青蛙跳上一 个 n 级的台阶总共有多少种跳法。
 *
 */
public class N02_简单_青蛙跳台阶I {


    public static void main(String[] args) {
        System.out.println(jumpFloor(5));
        System.out.println(jumpFloor(6));
    }



    static int jumpFloor(int n) {
        if (n < 3) {
            return 2;
        }

        int preOne = 1;
        int preTwo = 0;
        int sum = 0;
        for (int i = 3; i <= n; i++) {
            sum = preOne + preTwo;
            preTwo = preOne;
            preOne = sum;
        }

        return sum;
    }


}
