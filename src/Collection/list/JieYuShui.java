/**
 * Copyright (C), 2015-2019
 * FileName: JieYuShui
 * Author:   kritio
 * Date:     2019/3/15 23:21
 * Description: 接雨水问题
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Collection.list;

/**
 * 〈一句话功能简述〉<br>
 * 〈接雨水问题〉
 *
 * @author kritio
 * @create 2019/3/15
 * @since 1.0.0
 */
public class JieYuShui {
    public int trap(int[] height) {
        int len = height.length;
        int left = 0;
        int right = len - 1;
        int level = 0;
        int res = 0;
        while (left < right) {
            int lower = height[height[left] < height[right] ? left++ : right--];
            level = Math.max(lower, level);
            res += level - lower;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] height={0,1,0,2,1,0,1,3,2,1,2,1};
        JieYuShui s=new JieYuShui();
      int p=  s.trap(height);
        System.out.println(p);
    }
}