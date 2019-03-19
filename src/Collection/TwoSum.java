/**
 * Copyright (C), 2015-2018
 * FileName: TwoSum
 * Author:   kritio
 * Date:     2018/11/30 11:54
 * Description: 求数组两数之和
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Collection;

import java.util.HashMap;
import java.util.Map;

/**
 * 〈一句话功能简述〉<br>
 * 〈求数组两数之和de元素下标〉
 *
 * @author kritio
 * @create 2018/11/30
 * @since 1.0.0
 */
public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        return null;
    }

    public static void main(String[] args) {
        int[] testSum = {1, 3, 4, 5};
        int target = 6;
        int[] sum = twoSum(testSum, target);
        for (int i = 0; i < sum.length; i++) {
            System.out.println(sum[i]);
        }
    }

}