/**
 * Copyright (C), 2015-2018
 * FileName: maxProfit
 * Author:   kritio
 * Date:     2018/12/20 16:18
 * Description: 买股票的最佳时机
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Collection.list;

/**
 * 〈一句话功能简述〉<br>
 * 〈买股票的最佳时机〉
 *
 * @author kritio
 * @create 2018/12/20
 * @since 1.0.0
 */
public class maxProfit {
    //双重循环
    public static int maxMoney(int[] arr) {
        int money = 0;
        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = i + 1; j < arr.length; j++) {
                int temp = arr[j] - arr[i];
                if (temp > money && temp > 0) {
                    money = temp;
                }
            }

        }
        return money;
    }

    //优化1
    public static int maxMoneyTwo(int[] arr) {
        int len=arr.length;
        int low = 0;
        int high = low + 1;
        int money = 0;
        while (low < high&&low<len&&high<len) {
            int temp = arr[high] - arr[low];
            if (arr[high] - arr[low] < 0) {
                low++;
                high = low + 1;
            } else {
                high++;
            }
            if (temp > money) {
                money = temp;
            }
        }
        return money;
    }

    public static void main(String[] args) {
        int[] arr = {1,24};
        System.out.println(maxMoney(arr));
        System.out.println(maxMoneyTwo(arr));
    }
}