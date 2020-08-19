package T04_题型_字符串;

public class N01_简单_字符串替换空格 {

    public static void main(String[] args) {
        System.out.println(test("a b c defg h"));
        System.out.println(replaceSpace("a b c defg h"));
    }





    /**
     * 将空格替换为%20，时间复杂度O(n)
     * @param str
     * @return
     */
    static String replaceSpace(String str) {
        if (str == null)
            return null;

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (String.valueOf(str.charAt(i)).equals(" ")) {
                sb.append("%20");
            } else {
                sb.append(str.charAt(i));
            }
        }
        return String.valueOf(sb);
    }


    static String test(String str) {
        return str.replaceAll(" " ,"%20");
    }


}
