/**
 * Copyright (C), 2015-2019
 * FileName: Friends
 * Author:   kritio
 * Date:     2019/3/16 09:49
 * Description: 朋友圈
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Collection.list;

/**
 * 〈一句话功能简述〉<br>
 * 〈朋友圈〉
 *
 * @author kritio
 * @create 2019/3/16
 * @since 1.0.0
 */

public class Friends {
    public void dfs(int[][] M, int[] visited, int i) {
        for (int j = 0; j < M.length; j++) {
            if (M[i][j] == 1 && visited[j] == 0) {
                visited[j] = 1;
                dfs(M, visited, j);
            }
        }
    }

    public int findCircleNum(int[][] M) {
        int[] visited = new int[M.length];
        int count = 0;
        for (int i = 0; i < M.length; i++) {
            if (visited[i] == 0) {
                dfs(M, visited, i);
                count++;
            }
        }
        return count;
    }
}






/*
public class Two {
    public static ListNode addTwoNumber(ListNode l1, ListNode l2) {
        ListNode dumyHead = new ListNode(0);
        ListNode p = l1, q = l2, curr = dumyHead;
        int carry = 0;  // 表示是否需要进位(只有连个值:0跟1)
        while(p != null || q != null) {
            int x = (p != null ) ? p.val : 0; // 需要考虑位数不同的数字相加
            int y = (q != null ) ? q.val : 0;
            int sum = carry + x + y;
            carry = sum / 10;  // 进位携带
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            if(p != null ) p = p.next;
            if(q != null ) q = q.next;
        }
        // 加到最后一位
        if(carry > 0) {
            curr.next = new ListNode(carry);
        }

        return dumyHead.next;
    }

 */