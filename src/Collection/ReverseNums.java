/**
 * Copyright (C), 2015-2018
 * FileName: ReverseNums
 * Author:   kritio
 * Date:     2018/12/4 15:19
 * Description: 反转整数
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Collection;

/**
 * 〈一句话功能简述〉<br>
 * 〈反转整数〉
 *
 * @author kritio
 * @create 2018/12/4
 * @since 1.0.0
 */
public class ReverseNums {
    public static int resvers(int nums) {
        int res = 0;
        while (nums != 0) {
            int temp = nums % 10;
            nums = nums / 10;
            //溢出判断
            if (res > Integer.MAX_VALUE / 10 || (res == Integer.MAX_VALUE / 10 && temp > 7)) {
                return 0;
            }
            if (res < Integer.MIN_VALUE / 10 || (res == Integer.MIN_VALUE / 10 && temp< -8)) {
                return 0;
            }
            res = res * 10 + temp;

        }
        System.out.println(res);
        return res;
    }

    public static void main(String[] args) {
        resvers(123);
    }
}