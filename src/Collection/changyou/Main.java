/**
 * Copyright (C), 2015-2018
 * FileName: Main
 * Author:   kritio
 * Date:     2018/12/26 20:34
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Collection.changyou;

import java.util.HashMap;

/**
 * 〈一句话功能简述〉<br>
 * 〈重复的数
 * 〉
 *
 * @author kritio
 * @create 2018/12/26
 * @since 1.0.0
 */
public class Main {
    public static void num(int[] arr) {
        int temp = 0;
        boolean flag = false;


        HashMap<Integer, Integer> hash = new HashMap<>();
        if (arr == null || arr.length < 0) {
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            if (hash.containsKey(arr[i])) {
                temp = arr[i];
                flag = true;
                break;
            }
            hash.put(arr[i], i);
        }
        if (flag) {
            System.out.println("重复的数字是：" + temp);
        } else {
            System.out.println("不存在重复的数字");
        }
    }

    public static void main(String[] args) {
        int[] arr = {3, 0, 6, 2, 1,1};
        num(arr);
    }
}