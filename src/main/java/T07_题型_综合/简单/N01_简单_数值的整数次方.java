package T07_题型_综合.简单;


/**
 * 求base的exponent次方。不得使用库函数，同时不需要考虑大数问题
 * 精确到小数点后5位：0.00001
 */
public class N01_简单_数值的整数次方 {

    public static void main(String[] args) {
        System.out.println(myPow(2, -2));
    }




    static double myPow(double x, int n) {
        //x < 0.00001 && x > -0.00001
        if (equal(x)) {
            return 0.0;
        }

        //n = 0
        if (n == 0) {
            return 1.0;
        }

        //n < 0
        if (n > 0) {
            return execute(x ,n);
        } else {
            return execute(1 / x ,-n);
        }
    }

    private static double execute(double x, int n) {
        double sum = 1;
        for (int i = 0; i < n; i++) {
            sum = sum * x;
        }
        return sum;
    }

    private static boolean equal(double x) {
        return x > 0.00001 && x < -0.00001;
    }

}
