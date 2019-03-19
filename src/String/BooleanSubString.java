/**
 * Copyright (C), 2015-2019
 * FileName: BooleanSubString
 * Author:   kritio
 * Date:     2019/3/15 16:46
 * Description: 给定两个字符串 s1 和 s2，写一个函数来判断 s2 是否包含 s1 的排列。  换句话说，第一个字符串的排列之一是第二个字符串的子串。
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package String;

/**
 * 〈一句话功能简述〉<br>
 * 〈给定两个字符串 s1 和 s2，写一个函数来判断 s2 是否包含 s1 的排列。  换句话说，第一个字符串的排列之一是第二个字符串的子串。  〉
 *
 * @author kritio
 * @create 2019/3/15
 * @since 1.0.0
 */
public class BooleanSubString {
    public boolean checkInclusion(String s1, String s2) {

        //从s2中取s1长度的字串和s1进行比较

        int len1 = s1.length();
        int len2 = s2.length();
        int[] map1 = putMap(s1);
        if (len1 > len2) {
            return false;
        }
        for (int i = 0; i <= len2 - len1; i++) {
            String str = s2.substring(i, i + len1);
            int[] map2 = putMap(str);
            if (theSame(map1, map2)) {
                return true;
            }

        }
        return false;
    }

    public int[] putMap(String str) {
        int[] map = new int[26];
        for (int i = 0; i < str.length(); i++) {
            map[str.charAt(i) - 'a']++;
        }
        return map;
    }

    public boolean theSame(int[] map1, int[] map2) {
        for (int i = 0; i < map1.length; i++) {
            if (map1[i] != map2[i]) {
                return false;
            }

        }
        return true;
    }

    public static void main(String[] args) {
        String s = "abcd";
        String s1 = s.substring(1, 4);
        System.out.println(s1);
    }
}