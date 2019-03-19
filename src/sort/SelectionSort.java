/**
 * Copyright (C), 2015-2018
 * FileName: SelectionSort
 * Author:   kritio
 * Date:     2018/12/2 21:23
 * Description: 选择排序
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package sort;

/**
 * 〈一句话功能简述〉<br>
 * 〈选择排序〉
 * 最佳情况：T(n) = O(n2)  最差情况：T(n) = O(n2)  平均情况：T(n) = O(n2)
 *
 * @author kritio
 * @create 2018/12/2
 * @since 1.0.0
 */
public class SelectionSort {
    //选择排序
    public static int[] selectionSort(int[] array) {
        if (array.length == 0) {
            return array;
        }
        for (int i = 0; i < array.length; i++) {
            int minIndex = i;
            for (int j = i; j < array.length; j++) {
                if (array[j] < array[minIndex]) {//找到最小的数
                    minIndex = j; //最小数的索引保存
                }
                int temp = array[minIndex];
                array[minIndex] = array[i];
                array[i] = temp;
            }
        }
        return array;
    }

    //优化
   /* public void SelectSort(vector<int>&a) {
        int left = 0;
        int right = a.size() - 1;
        int min = left;//存储最小值的下标
        int max = left;//存储最大值的下标
        while (left <= right) {
            min = left;
            max = left;
            for (int i = left; i <= right; ++i) {
                if (a[i] < a[min]) {
                    min = i;
                }
                if (a[i] > a[max]) {
                    max = i;
                }
            }
            swap(a[left], a[min]);
            if (left == max)
                max = min;
            swap(a[right], a[max]);

            ++left;
            --right;
        }
    }
*/
}