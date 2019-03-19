/**
 * Copyright (C), 2015-2019
 * FileName: SortLinkedList
 * Author:   kritio
 * Date:     2019/3/9 22:17
 * Description: 排序单链表
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Collection.list;

/**
 * 〈一句话功能简述〉<br>
 * 〈排序单链表〉
 *
 * @author kritio
 * @create 2019/3/9
 * @since 1.0.0
 */
public class SortLinkedList {
    public ListNode sortList(ListNode head) {
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return head;
        }
        ListNode cur = head;
        ListNode tail = null;
        while (cur.next != tail) {
            while (cur.next != tail) {
                if (cur.val > cur.next.val) {
                    int temp = cur.val;
                    cur.val = cur.next.val;
                    cur.next.val = temp;
                }
                cur = cur.next;

            }

            tail = cur;
            cur = head;
        }
        return head;
    }

}