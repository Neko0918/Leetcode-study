/**
 * Copyright (C), 2015-2019
 * FileName: TiquString
 * Author:   kritio
 * Date:     2019/3/14 21:41
 * Description: 提取字符串中的字母和数字
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package String;

/**
 * 〈一句话功能简述〉<br>
 * 〈提取字符串中的字母和数字〉
 *
 * @author kritio
 * @create 2019/3/14
 * @since 1.0.0
 */
public class TiquString {

    public static String[] solution(String s) {

        s = s.replaceAll("[^a-zA-Z0-9]", " ");
        String[] str = s.split(" ");
        return str;
    }

    public static void main(String[] args) {
        String s = "hello!@#$This%$@#……^ 123^my@%@code$^%!$%!435t@Q$#%  %!";
        String[] strings = solution(s);
        for (int i = 0; i <strings.length; i++) {
            System.out.println(strings[i]);
        }

    }

}