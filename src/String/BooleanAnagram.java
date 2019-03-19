/**
 * Copyright (C), 2015-2019
 * FileName: BooleanAnagram
 * Author:   kritio
 * Date:     2019/3/6 14:47
 * Description: 有效的字母异位词 给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的一个字母异位词。
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package String;

/**
 * 〈一句话功能简述〉<br>
 * 〈有效的字母异位词>
 * <给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的一个字母异位词。  〉
 *
 * @author kritio
 * @create 2019/3/6
 * @since 1.0.0
 */
public class BooleanAnagram {
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }


        int[] maps = new int[128];
        int[] mapt = new int[128];

        for (int i = 0; i < s.length(); i++) {
            maps[s.charAt(i)]++;
            mapt[t.charAt(i)]++;
        }
        for (int i = 0; i < 128; i++) {
            if (maps[i] != mapt[i]) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        String s = "ccvv";
        String t = "vvcc";
        System.out.println(isAnagram(s, t));

        int p= 6+(4-2)/2;
        System.out.println(p);
    }
}