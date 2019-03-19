/**
 * Copyright (C), 2015-2018
 * FileName: LengthOfLongestSubstring
 * Author:   kritio
 * Date:     2018/12/8 15:18
 * Description: 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package String;

import java.util.HashMap;
import java.util.Map;

/**
 * 〈一句话功能简述〉<br>
 * 〈给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。〉
 * https://www.cnblogs.com/K-artorias/p/7665604.html
 *
 * @author kritio
 * @create 2018/12/8
 * @since 1.0.0
 */
public class LengthOfLongestSubstring {
    public static int solution(String s) {
        if (s.length()==1) {
            return 1;
        }
        if (s==null||"".equals(s)) {
            return 0;
        }

        int count = 1;

        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0, j = 0; i < s.length(); i++) {
            //j保存未重复字符的初始位置
            if (map.containsKey(s.charAt(i))) {
                j = Math.max(map.get(s.charAt(i)), j);
            }
            count = Math.max(count, i - j + 1);
            map.put(s.charAt(i), i + 1);

        }


        return count;
    }

    public static void main(String[] args) {
        String str = "aaucdrfcc";
        int len = solution(str);
        System.out.println(len);
    }


}