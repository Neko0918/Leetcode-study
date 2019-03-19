/**
 * Copyright (C), 2015-2018
 * FileName: datapage
 * Author:   kritio
 * Date:     2018/12/25 21:23
 * Description: 数据分页
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Collection.changyou;

import java.util.Scanner;

/**
 * 〈一句话功能简述〉<br>
 * 〈数据分页〉
 *
 * @author kritio
 * @create 2018/12/25
 * @since 1.0.0
 */
public class datapage {
    public static int[] page(int[] arr, int pageIndex, int max) {
        int bound = arr.length % max == 0 ? arr.length / max - 1 : arr.length / max;
        if (pageIndex > bound) {
            System.out.println("超出分页范围！");
            return null;
        }
        int[] a = new int[max];
        int index = 0;
        int start = pageIndex * max;

        while (max > 0) {
            a[index] = arr[start];
            index++;
            start++;
            max--;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入数据总数：");
        int n = sc.nextInt();
        System.out.println("输入全部数据：");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(" 输入页数：");
        int pageIndex=sc.nextInt();
        System.out.println("输入每页显示最大数：");
        int max=sc.nextInt();

        int[] data=page(arr,pageIndex,max);
        for(int p:data){
            System.out.println(p);
    }
}
}