/**
 * Copyright (C), 2015-2019
 * FileName: DeleteList
 * Author:   kritio
 * Date:     2019/3/10 16:13
 * Description: 删除链表节点
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Collection.list;

/**
 * 〈一句话功能简述〉<br>
 * 〈删除链表节点〉
 *
 * @author kritio
 * @create 2019/3/10
 * @since 1.0.0
 */
public class DeleteList {
    public void deleteNode(ListNode head, ListNode node) {
        if (node == null) {
            return;
        }
        if (node.next != null) {
            node.val = node.next.val;
            node.next = node.next.next;
        } else {
            if (node == head) {
                head = null;
            } else {
                ListNode tail = head;
                while (tail.next != node) {
                    tail = tail.next;
                }
                tail.next = null;
            }
        }

    }
}