/**
 * Copyright (C), 2015-2018
 * FileName: ReverseWords
 * Author:   kritio
 * Date:     2018/12/8 19:29
 * Description: 反转字符串
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package String;

/**
 * 〈一句话功能简述〉<br>
 * 〈反转字符串单词〉
 *
 * @author kritio
 * @create 2018/12/8
 * @since 1.0.0
 */
public class ReverseWords {
    public static String solution(String s) {

        if (s.isEmpty() || s=="") {
            return "";
        }
        String[] str = s.split(" ");


        StringBuilder sb = new StringBuilder();
        for (int i = str.length - 1; i > 0; i--) {

            if (!str[i].isEmpty()) {
                sb = sb.append(str[i] + " ");
            } else {
                continue;
            }

        }
        sb = sb.append(str[0]);
        return sb.toString().trim();
    }




    public static void main(String[] args) {
        String s = " ";
        System.out.println(solution(s));
    }
}

/*
final StringBuilder stringBuilder = new StringBuilder();
	    for (final String part : input.split("\\s+")) {
	        if (!part.isEmpty()) {
	          if (stringBuilder.length() > 0) {
	            stringBuilder.insert(0, " ");
	          }
	          stringBuilder.insert(0, part);
	        }
	    }
	    return stringBuilder.toString();

 */