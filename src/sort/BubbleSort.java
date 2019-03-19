/**
 * Copyright (C), 2015-2018
 * FileName: BubbleSort
 * Author:   kritio
 * Date:     2018/12/2 21:56
 * Description: 冒泡排序
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package sort;

/**
 * 〈一句话功能简述〉<br>
 * 〈冒泡排序〉
 *
 * @author kritio
 * @create 2018/12/2
 * @since 1.0.0
 */
public class BubbleSort {
    public static int[] Bubblesort(int[] array) {
        if (array.length == 0) {
            return array;
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j + 1] < array[j]) {
                    int temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }
//优化
/*int i = 0, j = 0;
    int k = size - 1,pos = 0;   //pos变量用来标记循环里最后一次交换的位置
    for (i = 0; i < size - 1; i++)  //一共要排序size-1次
    {
        //每次遍历标志位都要先置为0，才能判断后面的元素是否发生了交换
        int flag = 0;
        for (j = 0; j < k; j++)//选出该趟排序的最大值往后移动
        {
            if (arr[j] > arr[j + 1])
            {
                int tmp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = tmp;
                flag = 1;   //只要有发生了交换，flag就置为1
                pos = j;    //循环里最后一次交换的位置 j 赋给pos
            }
        }
        k = pos;
        //判断标志位是否为0，如果为0，说明后面的元素已经有序，就直接return
        if (flag == 0)
        {
            return;
        }
    } */

}