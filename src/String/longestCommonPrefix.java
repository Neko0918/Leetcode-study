/**
 * Copyright (C), 2015-2018
 * FileName: longestCommonPrefix
 * Author:   kritio
 * Date:     2018/12/2 13:49
 * Description: 最长公共前缀
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package String;

/**
 * 〈一句话功能简述〉<br>
 * 〈最长公共前缀〉
 *
 * @author kritio
 * @create 2018/12/2
 * @since 1.0.0
 */
public class longestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        if (strs == null) {
            return null;
        }
        if (strs.length == 0) {
            return "";
        }
         //找到最短的字符串长度
        int min = Integer.MAX_VALUE;
        for (String str : strs) {
            if (min > str.length()) {
                min = str.length();
            }
        }
        int i;
        //依次进行比较
        for (i = 0; i < min; i++) {
            boolean flag = true;
            for (int j = 1; j < strs.length; j++) {
                if (strs[0].charAt(i) != strs[j].charAt(i)) {
                    flag = false;
                    break;
                }

            }
            if (!flag) {
                break;
            }

        }
        return strs[0].substring(0, i);
    }

    public static void main(String[] args) {
        String[] str = new String[]{"flower", "flow", "flight"};
        System.out.println(longestCommonPrefix(str));
    }
}