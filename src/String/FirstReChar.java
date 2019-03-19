/**
 * Copyright (C), 2015-2019
 * FileName: FirstReChar
 * Author:   kritio
 * Date:     2019/3/6 16:48
 * Description: 字符串中的第一个唯一字符 给定一个字符串，找到它的第一个不重复的字符，并返回它的索引。如果不存在，则返回 -1。
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package String;

import java.util.HashMap;

/**
 * 〈一句话功能简述〉<br>
 * 〈字符串中的第一个唯一字符 给定一个字符串，找到它的第一个不重复的字符，并返回它的索引。如果不存在，则返回 -1。  〉
 *
 * @author kritio
 * @create 2019/3/6
 * @since 1.0.0
 */
public class FirstReChar {
    public static int firstUniqChar(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int index = 0;

        for (int i = 0; i < s.length(); i++) {
            if (!map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), 1);
            } else {
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);

            }
        }
        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i)) == 1) {
                index = i;
                return index;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        String s = "leetcode";
        System.out.println(firstUniqChar(s));
    }
}