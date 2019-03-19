/**
 * Copyright (C), 2015-2018
 * FileName: QuickSort
 * Author:   kritio
 * Date:     2018/12/24 16:57
 * Description: 快排
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package sort;

/**
 * 〈一句话功能简述〉<br>
 * 〈快排〉
 *
 * @author kritio
 * @create 2018/12/24
 * @since 1.0.0
 */
public class QuickSort {

    public static int partition(int[] arr, int low, int high) {
        int key = arr[low];
        while (low < high) {
            while (low < high && arr[high] >= key) {
                high--;

            }
            arr[low] = arr[high];
            while (low < high && arr[low] <= key) {
                low++;

            }
            arr[high] = arr[low];
        }
        arr[high] = key;
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        return high;
    }

    public static void sort(int[] array, int lo, int hi) {
        if (lo >= hi) {
            return;
        }
        int index = partition(array, lo, hi);
        sort(array, lo, index - 1);
        sort(array, index + 1, hi);
    }

    public static void main(String[] args) {
        int[] arr = {45,78,56,38,39,81,99,24};
        sort(arr, 0, arr.length - 1);
    }
}

