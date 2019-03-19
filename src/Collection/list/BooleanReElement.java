/**
 * Copyright (C), 2015-2019
 * FileName: BooleanReElement
 * Author:   kritio
 * Date:     2019/3/6 19:37
 * Description: 给定一个整数数组，判断是否存在重复元素。  如果任何值在数组中出现至少两次，函数返回 true。如果数组中每个元素都不相同，则返回 false。
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Collection.list;

import java.util.HashSet;

/**
 * 〈一句话功能简述〉<br>
 * 〈给定一个整数数组，判断是否存在重复元素。
 * 如果任何值在数组中出现至少两次，函数返回 true。
 * 如果数组中每个元素都不相同，则返回 false。〉
 *
 * @author kritio
 * @create 2019/3/6
 * @since 1.0.0
 */
public class BooleanReElement {
    public boolean containsDuplicate(int[] nums) {
        HashSet set = new HashSet();
        for (int i = 0; i < nums.length; i++) {
            if (!set.add(nums[i])) {
                return true;
            }

        }
        return false;
    }
}