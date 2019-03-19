/**
 * Copyright (C), 2015-2018
 * FileName: ThreeNumsSum
 * Author:   kritio
 * Date:     2018/12/8 21:32
 * Description: 三数之和等于0
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/**
 * 〈一句话功能简述〉<br>
 * 〈三数之和等于0〉
 *
 * @author kritio
 * @create 2018/12/8
 * @since 1.0.0
 */
public class ThreeNumsSum {
    public static List<List<Integer>> threeSum(int[] nums) {
        if (nums == null) {
            return null;
        }
        if (nums.length < 3) {
            return new ArrayList<>();
        }
        boolean flag=false;
        for(int i:nums){
            if (i!=0){
                flag=true;
            }
        }
        if(!flag){
            ArrayList<Integer> arrayList=new ArrayList<>();
            arrayList.add(0);
            arrayList.add(0);
            arrayList.add(0);
            List<List<Integer>> lists = new ArrayList<>();
            lists.add(arrayList);
            return lists;
        }

        HashSet<List<Integer>> set=new HashSet<>();

        Arrays.sort(nums);
        for(int i:nums){
            System.out.print(i+" ");
        }
        System.out.println();
        for (int i = 0; i < nums.length; i++) {
            int j = i + 1;
            int k = nums.length - 1;
            while (j < k) {
                if (nums[i] + nums[j] + nums[k] == 0) {
                    ArrayList<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[j]);
                    list.add(nums[k]);
                    set.add(list);

                    while (j < k && nums[j] == nums[j + 1]) {
                        j++;
                    }
                    while (j < k && nums[k] == nums[k - 1]) {
                        k--;
                    }
                    j++;
                    k--;
                } else if (nums[i] + nums[j] + nums[k] >0) {
                   k--;
                } else {
                   j++;
                }
            }
        }
        return new ArrayList<>(set);
    }

    public static void main(String[] args) {
        int[] nums=new int[]{3,0,-2,-1,1,2};

        List<List<Integer>> list=new ArrayList<>();
        list=threeSum(nums);
       list.forEach(li-> System.out.println(li));
    }
}