/**
 * Copyright (C), 2015-2019
 * FileName: BooleanHuiWen
 * Author:   kritio
 * Date:     2019/3/6 12:57
 * Description: 判断一个字符串是否是回文
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package String;

/**
 * 〈一句话功能简述〉<br>
 * 〈判断一个字符串是否是回文〉
 *
 * @author kritio
 * @create 2019/3/6
 * @since 1.0.0
 */
public class BooleanHuiWen {
    public static boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int low = 0;
        int high = s.length() - 1;
        while (low < high)

        {
            char ch1 = s.charAt(low);
            char ch2 = s.charAt(high);
            //过滤非数字，字母的字符
            if (!Character.isLetterOrDigit(ch1)) {
                low++;
                continue;
            }
            if (!Character.isLetterOrDigit(ch2)) {
                high--;
                continue;
            }
            if (ch1 != ch2) {
                return false;
            }
            low++;
            high--;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        String s1 = "  a. ";
        // System.out.println(" result "+isPalindrome(s));
        System.out.println(isPalindrome(s1));
    }
}