package T04_题型_字符串;

/**
 * 可以使用StringBuild、StringBuffer中的方法
 *
 * 也可以使用递归实现
 *
 * 也可以逆序遍历字节数组
 */
public class N02_简单_字符串反转 {


    public static void main(String[] args) {
        System.out.println(revStr("abcde"));
    }



    /**
     * 递归
     * @param str todo
     * @return todo
     */
    static String revStr(String str) {

        if (str == null || str.length() <= 1)
            return str;


        return revStr(str.substring(1)) + str.charAt(0);
    }


    /**
     * 逆序遍历数组
     * @param str todo
     * @return todo
     */
    static String revStr2(String str) {
        StringBuilder sb = new StringBuilder();
        char[] chars = str.toCharArray();
        for (int i = str.length()-1; i > 0; i--) {
            sb.append(chars[i]);
        }

        return String.valueOf(sb);
    }


}
