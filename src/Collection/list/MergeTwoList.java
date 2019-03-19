/**
 * Copyright (C), 2015-2019
 * FileName: MergeTwoList
 * Author:   kritio
 * Date:     2019/3/5 17:41
 * Description: 合并两个有序数组
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Collection.list;

/**
 * 〈一句话功能简述〉<br>
 * 〈合并两个有序数组〉
 * 给定两个有序整数数组 nums1 和 nums2，将 nums2 合并到 nums1 中，使得 num1 成为一个有序数组。
 * <p>
 * 说明:
 * <p>
 * 初始化 nums1 和 nums2 的元素数量分别为 m 和 n。
 * 你可以假设 nums1 有足够的空间（空间大小大于或等于 m + n）来保存 nums2 中的元素。
 * 示例:
 * <p>
 * 输入:
 * nums1 = [1,2,3,0,0,0], m = 3
 * nums2 = [2,5,6],       n = 3
 * <p>
 * 输出: [1,2,2,3,5,6]
 *
 * @author kritio
 * @create 2019/3/5
 * @since 1.0.0
 */
public class MergeTwoList {
    //新建一个数组，比较大小后放入，在复制给数组1
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] nums3 = new int[m + n];
        int x = 0, y = 0;
        int len = n + m;
        for (int i = 0; i < len; i++) {
            if (x < m && y < n) {
                if (nums1[x] < nums2[y]) {
                    nums3[i] = nums1[x];
                    x++;
                } else {
                    nums3[i] = nums2[y];
                    y++;
                }

            } else if (x < m) {
                nums3[i] = nums1[x];
                x++;

            } else if (y < n) {
                nums3[i] = nums2[y];
                y++;
            }
        }
        printList(nums3);
    }

    public static int[] mergeTwo(int[] nums1, int m, int[] nums2, int n) {
        //方法2：直接操作数组1，从尾部开始比较放入；
        int len = m + n - 1;
        int len1 = m - 1;
        int len2 = n - 1;
        while (len2 >= 0) {
            /*if (len1 >= 0 && nums1[len1] > nums2[len2]) {
                nums1[len--] = nums1[len1--];
            } else {
                nums1[len--] = nums2[len2--];
            }
        }*/
            nums1[len--] = (len1 >= 0 && nums1[len1] > nums2[len2]) ? nums1[len1--] : nums2[len2--];
        }
            return nums1;
    }

    public static void printList(int[] list) {
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3};
        int[] nums2 = {2, 5, 6};
        printList(mergeTwo(nums1, 3, nums2, 3));
       // merge(nums1, 3, nums2, 3);

    }

}