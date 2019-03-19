/**
 * Copyright (C), 2015-2018
 * FileName: MaxSubSum
 * Author:   kritio
 * Date:     2018/12/9 20:52
 * Description: 最大子序列和
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Collection;

/**
 * 〈一句话功能简述〉<br>
 * 〈最大子序列和〉
 *
 * @author kritio
 * @create 2018/12/9
 * @since 1.0.0
 *
 *
 * 我们考虑在i处时，因为题中要求是连续子数组，因此我们只有两种选择，一种将nums[i]加入到已选定的子数组中
 * ，一种是放弃前面的子数组，从nums[i]开始重新记录子数组。所以状态转移方程就可以写成：

sum[i] = max(sum(i-1)+nums[i],nums[i])
sum[i]表示在i处的连续子数组的最大和
 */
public class MaxSubSum {
    public static int maxSubArray(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        int len = nums.length;
        int[] sum = new int[len];
        sum[0] = nums[0];
        int max = sum[0];

        for (int i = 1; i < len; i++) {
            sum[i] = Math.max(sum[i - 1] + nums[i], nums[i]);
            if (sum[i] > max) {
                max = sum[i];
            }

        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maxSubArray(nums));
    }
}