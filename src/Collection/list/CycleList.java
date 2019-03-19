/**
 * Copyright (C), 2015-2019
 * FileName: CycleList
 * Author:   kritio
 * Date:     2019/3/9 20:05
 * Description: 判断单链表是否有环
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Collection.list;

/**
 * 〈一句话功能简述〉<br>
 * 〈判断单链表是否有环〉
 *https://blog.csdn.net/lavor_zl/article/details/42784247
 * @author kritio
 * @create 2019/3/9
 * @since 1.0.0
 */
public class CycleList {
    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (slow != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }
}